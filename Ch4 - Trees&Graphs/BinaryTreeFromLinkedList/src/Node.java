public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public boolean equals(Node nodeGiven){ return (nodeGiven==null)? nodeGiven==this : nodeGiven.data==this.data;

    }
}
