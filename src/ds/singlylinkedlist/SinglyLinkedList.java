package ds.singlylinkedlist;

public class SinglyLinkedList {
    private Node first; // Null is thought of as engine of train with no carts.

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    // used ot insert at begining of the list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first; // Old first
        first = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }


}
