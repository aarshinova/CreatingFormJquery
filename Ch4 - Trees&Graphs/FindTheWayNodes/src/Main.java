import java.util.LinkedList;
import java.util.PriorityQueue;
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
        Queue<Node> queue = new LinkedList<>();
        boolean isNodeConnected = findBFS(a,t,queue);
        System.out.println("Node are connected : " + isNodeConnected);

    }

    public static boolean findBFS(Node start, Node end, Queue<Node> queue){
        if (!start.isVisited()) {
            queue.add(start);
            start.setVisited(true);
        }
        Node[] children = start.getChildren();

        for (Node child : children){
            if (child.equals(end)){
                return true;
            }
            if (!child.isVisited()) {
                queue.add(child);
                child.setVisited(true);
            }
        }
        queue.poll();
        if (queue.isEmpty())
            return false;
        start = queue.peek();

        return findBFS(start, end, queue);
    }
}
