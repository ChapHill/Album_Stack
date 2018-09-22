
/**
 * Main stack interface
 */

import java.util.EmptyStackException;

public class StackInterface<T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public StackInterface() {
    }

    public StackInterface(int size) {
        this.maxSize = size;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(T element) {
        if(this.isFull()){
            System.out.println("The stack is currently full");
        } else {
            top++;
            stackArray[top] = element;
        }
    }

    public T pop() {
        if (this.isEmpty())
            throw new EmptyStackException();
        return element(top--);
    }

    public T peek() {
        if (this.isEmpty())
            throw new EmptyStackException();
        return element(top);
    }

    public int size(){
        return maxSize;
    }

    @SuppressWarnings("unchecked")
    private T element(int index) {
        return (T) stackArray[index];
    }

    public void printStack() {
        for (int i = top; i > -1; i--) {
            if (i == top) {
                System.out.println(stackArray[top] + " ^-- TOP");
                System.out.println();
            }
            else if (i == 0) {
                System.out.println(stackArray[0] + " ^-- BOTTOM");
                System.out.println();
            }
            else {
                System.out.println(stackArray[i]);
                System.out.println();
            }
        }

    }


}
