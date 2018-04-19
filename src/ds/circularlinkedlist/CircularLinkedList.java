package ds.circularlinkedlist;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }

        newNode.next = first; // newNode next is now pointing pointing to old first node (pushed back)
        first = newNode; // newNode now in first place
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; // the next value of the last node will point to the new node
            last = newNode; // make new node last one in list
        }
    }

    public int deleteFirst() {
        int temp = first.data;

        if (first.next == null) {
            last = null;
        }

        first = first.next; // first will point to old's next value;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
}
