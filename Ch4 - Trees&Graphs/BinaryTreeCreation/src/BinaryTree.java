import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public Node root;

    public BinaryTree(Node node)
    {
        root = node;
    }

    public void add(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
            parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

    public void printTree(Node tmpRoot) {

        Queue<Node> currentLevel = new LinkedList<Node>();
        Queue<Node> nextLevel = new LinkedList<Node>();

        currentLevel.add(tmpRoot);

        while (!currentLevel.isEmpty()) {
            for (Node currentNode : currentLevel) {
                if (currentNode.getLeft() != null) {
                    nextLevel.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    nextLevel.add(currentNode.getRight());
                }

                System.out.print(currentNode.getData() + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<Node>();

        }

    }


}
