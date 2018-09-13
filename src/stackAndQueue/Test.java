package stackAndQueue;

/**
 * @author Soumen Karmakar
 * 9/11/2018
 */
public class Test {
    public static void main(String[] args) {
        /*IntStack stack = new IntStack(5);
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println("PEEK ::" + stack.peek());
        System.out.println("POP ::" + stack.pop());*/
        IntQueue q = new IntQueue(5);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}
