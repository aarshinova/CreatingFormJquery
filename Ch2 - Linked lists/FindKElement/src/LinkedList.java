public class LinkedList {
    private Node lastNode;

    public Node getHead() {
        return head;
    }

    private Node head;

    public void addNode(int data) {
        if (head == null) {
            head = new Node(data);
            head.setNext(null);
            lastNode = head;
        } else {
            Node newNode = new Node(data);
            lastNode.setNext(newNode);
            lastNode = lastNode.getNext();
        }
    }

    public Node findKthNode(int k) {
        Node runner1 = head;
        Node runner2 = head;
        int count = 0;
        while (runner1 != null) {
            if (k == count) {
                runner2 = runner2.getNext();
            } else {
                count++;
            }
            runner1 = runner1.getNext();
        }

        return  runner2;
    }

}
