public class Stack {

    private int data;
    private Stack next=null;
    private Stack last;

    public Stack getNext() {
        return next;
    }

    public void setNext(Stack next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Stack removeLast(){
        Stack node = this;
        return this;
    }


}
