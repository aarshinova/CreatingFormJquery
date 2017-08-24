public class Main {
    // find out if two linked lists intersects
    public static void main(String[] args) {

        Node list = new Node(9);
        Node newNode10 = new Node(10);
        Node newNode11 = new Node(11);
        Node newNode12 = new Node(12);
        Node newNode13 = new Node(13);
        Node newNode6 = new Node(6);
        Node newNode7 = new Node(7);
        Node newNode8 = new Node(8);

        list.setNext(newNode10);
        newNode10.setNext(newNode11);
        newNode11.setNext(newNode12);
        newNode12.setNext(newNode13);
        newNode13.setNext(newNode6);
        newNode6.setNext(newNode7);
        newNode7.setNext(newNode8);
        newNode8.setNext(newNode13); // circular list<

        Node loopNode =
            detectLoop(list);

        if (loopNode!=null)
            System.out.println("Loop node : " + loopNode.getData());
        else
            System.out.println("No loop detected");
    }


    public static Node detectLoop(Node list){
        Node fastList=list.getNext();
        Node slowList=list;
        while(fastList!=null){
            if (slowList==fastList)
                        return fastList;

            fastList = fastList.getNext().getNext();

            slowList = slowList.getNext();
        }
        return  null;
    }
}
