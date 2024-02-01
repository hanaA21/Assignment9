package lesson9;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public void enqueue(int obj) {
        if (rear == arr.length) {
            System.out.println("The queue is full");;
        }
        arr[rear++] = obj;
        if (front == -1) {
            front = 0;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedElement = arr[front++];
        if (front > rear) {
            front = -1;
            rear = 0;
        }
        return removedElement;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    public boolean isEmpty() {
        return front == -1 || front >= rear;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front;
    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        System.out.println("Is empty: " + q.isEmpty());
        System.out.println("Size: " + q.size());

        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());

        System.out.println("Is empty: " + q.isEmpty());
        System.out.println("Size: " + q.size());
    }
}

