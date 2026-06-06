import java.util.LinkedList;
import java.util.Queue;

public class SharedBufferResources {
    private Queue<Integer> queue;
    private int buffersize;

    public SharedBufferResources(int buffersize){
        queue = new LinkedList<>();
        this.buffersize = buffersize;
    }

    public synchronized void produce(int item) throws Exception{

        while(queue.size()==buffersize)
        {
            System.out.println("Queue is Full. Thread is in the waiting state");
            wait();
        }
        queue.add(item);
        System.out.println("Item are added and the consumer thread is notified");
        notify();
    }

    public synchronized void consume() throws Exception
    {
        while(queue.isEmpty())
        {
            System.out.println("The Queue is empty, thread is in waiting state");
            wait();
        }
        queue.poll();
        System.out.println("Item are consumed and the producer thread is notified");
        notify();
    }

}
