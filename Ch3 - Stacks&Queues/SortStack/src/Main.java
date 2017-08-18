import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(9);
        stack.push(3);
        stack.push(1);
        stack.push(7);
        stack.push(10);
        stack.push(1);
        stack.push(100);

        Stack<Integer> newStack = sortStack(stack);

        while (!newStack.isEmpty()) {
            System.out.println("Sorted stack el " + newStack.pop());
        }
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack) {
        Integer tmp;
        Integer comp;
        Stack<Integer> finalStack = new Stack<>();
        while (!stack.isEmpty()) {
            tmp = stack.pop();
            if (!finalStack.isEmpty())
                comp = finalStack.peek();
            else
                comp = -1;

            if (tmp < comp) {
                while (tmp < comp) {
                    finalStack.pop();
                    stack.push(comp);
                    if (!finalStack.isEmpty())
                        comp = finalStack.peek();
                    else
                        break;
                }
            }

            finalStack.push(tmp);
        }

        // reverse final stack using initial stack
        while (!finalStack.isEmpty()) {
            stack.push(finalStack.pop());
        }

        return stack;
    }
}
