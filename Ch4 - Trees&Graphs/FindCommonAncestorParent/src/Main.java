import java.util.Stack;

public class Main {

    // Find common ancestor if parent is known
    public static void main(String[] args) {
        Node a = new Node("a");
        Node r = new Node("r");
        Node k = new Node("k");
        Node b = new Node("b");
        Node s = new Node("s");
        Node t = new Node("t");

        Node[] childrenOfA = {r,k};
        r.setParent(a);
        k.setParent(a);
        a.setChildren(childrenOfA);

        Node[] childrenOfK = {r};
        k.setChildren(childrenOfK);
        r.setParent(k);

        Node[] childOfR = {b};
        r.setChildren(childOfR);
        b.setParent(r);

        Node[] childOfB = {s,t};
        b.setChildren(childOfB);
        s.setParent(b);
        t.setParent(b);

        String value = findCommonAncestor(a,r,s);
        if (!value.isEmpty())
            System.out.println("Common ancestor is : " + value);
        else
            System.out.println("There is no common ancestor");
    }

    public static String findCommonAncestor(Node root,Node childToFind1,Node childToFind2) {
        int depthChild1 = getDepth(childToFind1);
        int depthChild2 = getDepth(childToFind2);

        int depth = Math.abs(depthChild1 - depthChild2);

        while (childToFind1 != null && childToFind2 != null) {
            if (depth>0){
                if (depthChild1>depthChild2)
                    childToFind1 = childToFind1.getParent();
                else
                    childToFind2 = childToFind2.getParent();
                depth--;
            }
            else {
                childToFind2 = childToFind2.getParent();
                childToFind1 = childToFind1.getParent();
                if (childToFind1.getData().equals(childToFind2.getData()))
                    return childToFind1.getData();
            }
        }

        return "";
    }


    public static int getDepth(Node child) {
        int depth = 0;
        while (child!= null) {
            child = child.getParent();
            depth++;
        }

        return depth;
    }

}
