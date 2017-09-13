import java.util.*;

public class Main {

    // Find common ancestor if parent is unknown
    public static void main(String[] args) {
        Node a = new Node("a");
        Node r = new Node("r");
        Node k = new Node("k");
        Node b = new Node("b");
        Node s = new Node("s");
        Node t = new Node("t");
        Node x = new Node("x");

        Node[] childrenOfA = {r,k};
        a.setChildren(childrenOfA);
        Node[] childrenOfK = {r};
        k.setChildren(childrenOfK);
        Node[] childOfR = {b};
        r.setChildren(childOfR);
        Node[] childOfB = {s,t};
        b.setChildren(childOfB);
        String value = findCommonAncestor(a,t,b);
        if (!value.isEmpty())
        System.out.println("Common ancestor is : " + value);
        else
            System.out.println("There is no common ancestor");
    }

    public static String findCommonAncestor(Node root,Node childToFind1,Node childToFind2) {
        Stack<String> child1Path = new Stack<>();
        //find the paths to reach child1 - the path is unique in binary tree
        boolean found = findDFS(root,childToFind1,child1Path);
        if (found == false) return "";
        Stack<String> child2Path = new Stack<>();
        //find the path to reach child2
        found = findDFS(root,childToFind2,child2Path);
        if (found == false) return "";

        // find the nearest ancestor
        while (!child1Path.isEmpty()) {
            String node1 = child1Path.pop();
            for (String node2 : child2Path) {
                if (node1.equals(node2))
                    return node1;
            }
        }

        return "";
    }


    public static boolean findDFS(Node root,Node childToFind,Stack childPath) {
        Node[] children = root.getChildren();
        if (!childPath.contains(root.getData()))
            childPath.add(root.getData());

        for (Node child : children) {
            if (child.getData().equals(childToFind.getData()))
                return true;
            if (findDFS(child,childToFind,childPath)) return true;
        }

        return false;
    }

}
