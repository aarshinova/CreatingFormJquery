public class Node {

    public Node(int d){
        data = d;
        left = null;
        right = null;
    }
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node left;
    public Node right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int data;

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


}
