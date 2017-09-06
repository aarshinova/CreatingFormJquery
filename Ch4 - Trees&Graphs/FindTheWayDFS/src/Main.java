import java.util.LinkedList;
import java.util.Queue;

public class Main {
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
        Node[] childOfR={b};
        r.setChildren(childOfR);
        Node[] childOfB={s,t};
        b.setChildren(childOfB);
        Res res = new Res();
        findDFS(a, x, res);
        System.out.println("Node are connected : " + res.isRes());

    }


    public static void findDFS(Node start, Node end, Res res){
        if (start==null) return;
        //start.setVisited(true);
        Node[] children = start.getChildren();
        for (Node child : children)
            if (!child.isVisited()) {
                child.setVisited(true);
                if (child.equals(end)) {
                    res.setRes(true);
                }
                findDFS(child,end, res);
            }
    }
}
