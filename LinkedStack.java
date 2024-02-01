package lesson9;

public class LinkedStack {
     Node top;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        LinkedStack s = new LinkedStack();

        System.out.println("Is empty: " + s.isEmpty());

        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Peek: " + s.peek());
        System.out.println("Pop: " + s.pop());

        System.out.println("Is empty: " + s.isEmpty());
    }
}

