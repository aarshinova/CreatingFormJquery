import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node r = new Node(3);
        Node k = new Node(15);
        Node b = new Node(12);
        Node s = new Node(17);
        Node t = new Node(11);
        Node x = new Node(13);
        Node l = new Node(16);
        Node o = new Node(18);
        Node j = new Node(23);
        Node f = new Node(14);

        a.setLeft(r); //3
        a.setRight(k); //15
        k.setLeft(b); //12
        k.setRight(s); //17
        b.setRight(x); //13
        b.setLeft(t); //11
        s.setRight(o); //18
        s.setLeft(l); //16
        o.setLeft(f); //14
        o.setRight(j); //23

        System.out.println("is a binary tree : " + checkIfBinaryTree(a));
    }

    public static boolean checkIfBinaryTree(Node node) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {

            if (node.hasLeft()) {
                queue.add((node.getLeft()));
                if (node.getLeft().getData() > node.getData())
                    return false;
                if (!checkRightBST(node, node.getLeft()))
                    return false;

            }

            if (node.hasRight()) {
                queue.add((node.getRight()));
                if (node.getRight().getData() < node.getData())
                    return false;
                if (!checkLeftBST(node, node.getRight()))
                    return false;
            }

            queue.poll();
            node = queue.peek();
        }
        return true;

    }

    public static boolean checkLeftBST(Node parent,Node head) {
        LinkedList<Node> queue = new LinkedList<>();
        if (!head.hasLeft()) return true;
        head = head.getLeft();
        queue.add(head);

        while (!queue.isEmpty()) {
            if (head.getData() < parent.getData())
                return false;

            if (head.hasLeft()) {
                queue.add((head.getLeft()));
                if (head.getLeft().getData() < parent.getData())
                    return false;
            }


            if (head.hasRight()) {
                queue.add((head.getRight()));
                if (head.getRight().getData() < parent.getData())
                    return false;
            }

            queue.poll();
            head = queue.peek();
        }

        return true;
    }

    public static boolean checkRightBST(Node parent,Node head) {
        LinkedList<Node> queue = new LinkedList<>();
        if (!head.hasRight()) return true;
        head = head.getRight();
        queue.add(head);

        while (!queue.isEmpty()) {
            if (head.getData() > parent.getData())
                return false;

            if (head.hasLeft()) {
                queue.add((head.getLeft()));
                if (head.getLeft().getData() > parent.getData())
                    return false;

            }

            if (head.hasRight()) {
                queue.add((head.getRight()));
                if (head.getRight().getData() > parent.getData())
                    return false;
            }


            queue.poll();
            head = queue.peek();
        }

        return true;
    }
}
