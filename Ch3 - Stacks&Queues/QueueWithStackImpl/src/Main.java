import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implementing a queue with 2 stacks : ");

        // 1st stack
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(2);
        stack1.push(5);
        stack1.push(10);
        stack1.push(11);
        stack1.push(15);

        System.out.println("First el to be out in stack1 " + stack1.peek());
        System.out.println("$$$");
        MyQueue myQueue = new MyQueue(stack1);
        myQueue.printAll();
    }
}
