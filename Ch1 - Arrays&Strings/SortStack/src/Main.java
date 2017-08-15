public class Main {

    public static void main(String[] args) {

        System.out.println("Stack implementation");

        StackNode node = new StackNode();
        node.push(1);
        node.push(3);
        node.push(4);
        node.push(2);

       node.printAllNodes();

       node.pop();
       node.pop();

       System.out.println("After poping some elements");
       node.printAllNodes();
    }
}
