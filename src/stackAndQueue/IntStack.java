package stackAndQueue;

/**
 * @author Soumen Karmakar
 * 9/11/2018
 */
public class IntStack {

    private int[] _stack;
    private int top = -1;

    public IntStack(int size) {
        this._stack = new int[size];
    }

    public void push(int data) {
        if (top < this._stack.length - 1) {
            this._stack[++top] = data;
        } else {
            throw new RuntimeException("STACK OVERFLOW");
        }
    }

    public int peek() {
        if (top < 0) {
            throw new RuntimeException("STACK EMPTY");
        }
        return this._stack[top];
    }

    public int pop() {
        if (top < 0) {
            throw new RuntimeException("STACK EMPTY");
        } else {
            return this._stack[top--];
        }
    }

}
