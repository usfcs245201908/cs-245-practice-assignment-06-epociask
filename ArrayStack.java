import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>{
    private static int BASECAP = 10;

    private int size;
    private int current;
    private T[] stack;

    public ArrayStack() {
        stack = (T[]) new Object[BASECAP];
        size = BASECAP;
        current = -1;
    }

    public boolean empty(){
        return current == -1;
    }


    public T peek() throws Exception{
        if (empty())
            throw new Exception("ERROR");
        return stack[current];
    }


    public T pop() throws Exception{
        if (empty())
            throw new Exception("ERROR");
        return stack[current--];
    }


       public void push(T item){
        if (size == current + 1) {
        	size *= 2;
        	stack = Arrays.copyOf(stack, size);
        }
        stack[++current] = item;
    }

}