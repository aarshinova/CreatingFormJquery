public class Node {
    private String data;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    private boolean visited;
    private Node[] children;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node(String data) {
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
