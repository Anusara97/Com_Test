public class Stack {
    private int[] stk;
    private int top;

    public Stack() {
        stk = new int[10];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stk.length - 1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow.");
            return -1;
        } else {
            int x = stk[top];
            top--;
            return x;
        }
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is overflow.");
        } else {
            stk[++top] = item;
        }
    }
}