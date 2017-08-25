public class Main {

    public static void main(String[] args){
        int[] orderedArray = {1,2,3,4,5,6,7,8,9,10,11,12, 13, 14,15, 16};
        Node root = new Node(10);
        Node node3 = new Node(3);
        Node node5 = new Node(5);
        Node node7 = new Node(7);
        Node node20 = new Node(20);
        Node node15 = new Node(15);
        Node node30 = new Node(30);

        BinaryTree tree = new BinaryTree(root);
        tree.add(root, node5, "left");
        tree.add(root, node20, "right");

        tree.add(node5, node3, "left" );
        tree.add(node5, node7, "right");

        tree.add(node20, node15, "left");
        tree.add(node20, node30, "right");

        createBinaryTree(orderedArray);
        tree.printTree(root);
    }

    public static Node createBinaryTree(int[] array){
        return divide(0, array.length-1, array);
    }

    public static Node divide(int start, int end,  int[] array){

        if (end<start) return null;

        int newMidPoint = (start + end) /2;

        Node newNode = new Node(array[newMidPoint]);

        newNode.left = divide(start, newMidPoint - 1, array);
        newNode.right = divide(newMidPoint+1, end , array);

        return newNode;

    }


}
