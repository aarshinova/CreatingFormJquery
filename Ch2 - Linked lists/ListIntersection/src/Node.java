public class Node {
    private int data;
    private Node next;
    private Node lastNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {

        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getLength(){
        int length = 0;
        Node n = this;
        Node previous=null;
        while (n!=null){
            previous = n;
            n = n.getNext();
            length++;
        }
        lastNode = previous;
        return length;
    }

    public Node getLastNode() {
        return lastNode;
    }
}
