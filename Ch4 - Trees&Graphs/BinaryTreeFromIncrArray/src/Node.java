public class Node {
    private int data;

    private Node[] children;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node(int data) {
        this.data = data;
    }

    public Node[] getChildren() {
        if (children==null) {
            Node[] node = {};
            return node;
        }
        else return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }
}
