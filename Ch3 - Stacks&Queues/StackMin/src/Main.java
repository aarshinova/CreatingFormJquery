public class Main {
    public static void main(String[] args) {
        StackMin newStack = new StackMin();

        newStack.push(4);
        newStack.push(8);
        newStack.push(1);
        newStack.push(2);

        System.out.println("Min element : " + newStack.getMin());

        newStack.pop();
        newStack.pop();

        System.out.println("Min element : " + newStack.getMin());

    }
}
