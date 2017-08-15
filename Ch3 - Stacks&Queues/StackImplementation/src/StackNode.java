public class StackNode {

    private int data;
    private Node top;

    public StackNode(int d){
        data = d;
    }

    public StackNode(){
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    // remove the last element in stack
    public Node pop(){
        Node node = top;
        if (node!=null && node.getNext()!=null) {
            top = node.getNext();
        }
        return node;
    }
    // push a new element
    public void push(int data){
        if (top!=null){
            Node newNode = new Node(data);
            newNode.setNext(top);
            top = newNode;
        }
        else{
            top = new Node(data);
        }
    }
    // consult the last element
    public Node visitLast(){
        return top;
    }

    public void printAllNodes(){
        StackNode stack = new StackNode();
        stack.top = this.top;
        stack.data = this.data;

        while (stack.top!=null){
            System.out.println("Node : " + stack.top.getData());
            stack.top = stack.top.getNext();
        }
    }

}
