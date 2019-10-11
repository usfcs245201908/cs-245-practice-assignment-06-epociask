
import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T> {
    private static int BASECAP = 10;

    private int size, head, tail;
    private T[] que;

    public ArrayQueue() {
        que = (T[]) new Object[BASECAP];
        size = BASECAP;
        head = 0; 
        tail = -1;
    }

    public boolean empty(){
        return tail < head;
    }

    public void enqueue(T item){
        if (size == tail + 1) {
            que = Arrays.copyOf(que, size * 2);
            size *= 2;
        }
        que[++tail] = item;
    }

    public T dequeue() throws Exception {
        if (empty()){
            throw new Exception("Queue is empty but you're trying to dequeue");
        }
        return que[head++];
    }

}