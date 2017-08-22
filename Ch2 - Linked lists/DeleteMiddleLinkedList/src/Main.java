public class Main {

    // Input node C=4
    // Delete node c in linked list : 1->2->3->4->5->6->7->8
    // Output : 1->2->3->5->6->7->8
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        Node deletedNode = new Node(4);
        Node newNode5 = new Node(5);
        Node newNode6 = new Node(6);
        Node newNode7 = new Node(7);
        Node newNode8 = new Node(8);

        deletedNode.setNext(newNode5);
        newNode5.setNext(newNode6);
        newNode6.setNext(newNode7);
        newNode7.setNext(newNode8);
        newNode8.setNext(null);

        list.deleteNode(deletedNode);

        Node head = list.getHead();
        while (head!=null){
            System.out.println("El " + head.getData());
            head = head.getNext();
        }

    }
}
