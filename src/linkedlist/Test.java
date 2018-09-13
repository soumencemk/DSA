package linkedlist;

/**
 * @author Soumen Karmakar
 * 9/11/2018
 */
public class Test {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.add(1);
        dll.add(3);
        dll.add(4);
        dll.print();
        dll.add(2, 3);
        dll.print();
        dll.remove(2);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
