public class LinkedList{
    private Node lastNode;

    public Node getHead() {
        return head;
    }

    private  Node head;

    public void addNode(int data){
     if (head==null){
         head = new Node(data);
         head.setNext(null);
         lastNode = head;
     }else{
         Node newNode = new Node(data);
         lastNode.setNext(newNode);
         lastNode = lastNode.getNext();
     }
    }

    private void recursiveReplace(Node node){
        Node next = node.getNext();
        node.setData(next.getData());
        if (node.getNext().getNext() == null){
            node.setNext(null);
            return;
        }
        recursiveReplace(next);
    }

    public void deleteNode(Node node){
        Node newNode = head;
        while(newNode!=null){
            // newNode is the node to be deleted
            if (newNode.getData()==node.getData() && newNode.getNext().getData()==node.getNext().getData() ){
                recursiveReplace(newNode);
                break;
            }
            newNode = newNode.getNext();
        }
    }

}
