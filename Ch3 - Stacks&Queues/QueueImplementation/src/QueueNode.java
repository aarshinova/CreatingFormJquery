public class QueueNode {
    private Node first;
    private Node last;

    // add the element in the end of the queue
    public void add(int data){
        if (first==null){
            first = new Node(data);
            last = first;
            first.setNext(last);
        }else{
            Node node = new Node(data);
            last.setNext(node);
            last = last.getNext();
        }
    }
    //remove element at the begining of the queue
    public Node remove(){
        if (first==null) {
            last = null;
            return null;
        }
        Node nodeToRemove = first;
        first = first.getNext();
        return  nodeToRemove;
    }
    // return the top of the queue
    public Node peak(){
        return  first;
    }

    public void printAll(){
        if (first==null)
        {
            System.out.println("Queque is empty");
            return;
        }
        QueueNode queueNode = new QueueNode();
        queueNode.last = this.last;
        queueNode.first = this.first;
        System.out.println("Last node " + queueNode.last.getData());
        int i = 0;
        while (queueNode.first!=null){
            if (i==0) System.out.println("First node to be out " + queueNode.first.getData());
            if (i!=0) System.out.println("Then next node to be out will be " + queueNode.first.getData());
            i++;
            queueNode.first = queueNode.first.getNext();
        }
    }
}
