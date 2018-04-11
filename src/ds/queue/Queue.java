package ds.queue;

public class Queue {

    private int maxSize; // initializes the set number of slots.
    private long[] queArray; // slots to man the data.
    private int front; // index position for the element in the front.
    private int rear; // index position for element at the back of the line.
    private int nItems; // counter to maintain the number of items in our queue.

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; // index position of the first slot of array.
        rear = -1; // index position of last slot in array (no item in array yet to be consider as the last item).
        nItems = 0; // we don't have items in our array yet

    }

    public void insert(long j) {
        if (rear == maxSize - 1) {
            rear = -1; // nothing behind this element.
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public long remove() { // remove item from the front of the queue.
        long temp = queArray[front];
        front++; // point to the next element in the line.
        if (front == maxSize) {
            front = 0; // set front back to 0th index to utilize the entire array again.
        }
        nItems--;

        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

}
