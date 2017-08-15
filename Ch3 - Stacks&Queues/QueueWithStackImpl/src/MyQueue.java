import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private Node first;
    private Node last;

    public MyQueue() {

    }

    public MyQueue(Stack<Integer> stack1) {
        this.stack1 = stack1;
        this.stack2 = new Stack<>();
        while(stack1.size()!=0){
            stack2.push(stack1.pop());
        }
        buildMyQueue(stack2);
    }

    private void buildMyQueue(Stack<Integer> stack2){
        if (stack2==null)
            return;
        while (stack2.size()!=0){
            if (first == null){
                first = new Node(stack2.pop());
                last = first;
            }else{
                Node node = new Node(stack2.pop());
                last.setNext(node);
                last = last.getNext();
            }
        }
    }

    public void printAll(){
        if (first==null)
        {
            System.out.println("Queque is empty");
            return;
        }
        MyQueue queueNode = new MyQueue();
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
