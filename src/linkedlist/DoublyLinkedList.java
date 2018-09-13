package linkedlist;

/**
 * @author Soumen Karmakar
 * 9/11/2018
 */
public class DoublyLinkedList<T> {

    Node head;

    class Node {
        T data;
        Node next;
        Node prev;

        Node(T d) {
            data = d;
        }
    }

    public void add(T t) {
        if (this.head == null) {
            head = new Node(t);
        } else {
            Node n = new Node(t);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.prev = temp;
        }
    }

    public void print() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print("[" + temp.data + "]");
            if (temp.next != null) {
                System.out.print("<-->");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        Node temp = this.head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;

    }

    public boolean add(T t, int pos) {
        if (pos > size()) {
            return false;
        } else {
            Node temp = this.head;
            for (int i = pos; i > 2; i--) {
                temp = temp.next;
            }
            Node n = new Node(t);
            n.next = temp.next;
            n.prev = temp;
            temp.next = n;
            return true;
        }

    }

    public boolean remove(int pos) {
        if (pos > size()) {
            return false;
        } else {
            Node temp = this.head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            Node prev = temp.prev;
            prev.next = temp.next;
            temp.next.prev = prev;
            return true;
        }

    }

    public void reverse() {


    }
}
