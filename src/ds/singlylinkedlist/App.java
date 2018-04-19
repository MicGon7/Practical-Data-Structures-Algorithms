package ds.singlylinkedlist;

public class App {
    public static void main(String[] args) {

        // Single direction -> cannot go backward.
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);

        System.out.println("Original List");
        myList.displayList();
        Node deletedNoded = myList.deleteFirst();

        System.out.println("Deleted first node: " + deletedNoded.data);
        myList.displayList();

        System.out.println(myList);
    }
}
