package stackAndQueue;

/**
 * @author Soumen Karmakar
 * 9/11/2018
 */
public class IntQueue {

    private int[] queue;
    private int rear = -1, front = -1;

    public IntQueue(int size) {
        this.queue = new int[size];
    }

    public void enQueue(int data) {
        if (!isQueueFull()) {
            queue[++front] = data;
        } else {
            throw new RuntimeException("QUEUE FULL");
        }

    }


    public int deQueue() {
        if (isQueueEmpty()) {
            throw new RuntimeException("QUEUE EMPTY");
        } else {
            return queue[++rear];
        }

    }

    private boolean isQueueFull() {
        if (front == queue.length - 1) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isQueueEmpty() {
        if (rear >= front) {
            return true;
        } else {
            return false;
        }
    }

}
