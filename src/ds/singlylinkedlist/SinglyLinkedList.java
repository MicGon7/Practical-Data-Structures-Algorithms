package ds.singlylinkedlist;

public class SinglyLinkedList {
    private Node first; // Null is thought of as engine of train with no carts.
    private Node last;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    // used to insert at beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first; // the newNodes next should point to the old first node (pushing it back).
        last = newNode.next;
        first = newNode; // Now the newNode is first.
    }

    // Delete first node in list
    public Node deleteFirst() {
        Node temp = first; // Store the first node
        last = temp;
        first = first.next; // then make the next node the first node.
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

    public Node getSecondFromLast() {
        Node temp = first;

        if (temp.next != null) {
            Node newNode = first.next;

            // increment newNode while keeping track of previous node until end of the list is reached.
            while (newNode.next != null) {
                temp = newNode;
                newNode = newNode.next;
            }

        } else {
            System.out.println("There is only one node in list");
            return null;
        }

        return temp;
    }


}
