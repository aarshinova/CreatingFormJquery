public class Main {
    // find out if two linked lists intersects
    public static void main(String[] args) {
        Node firstList = new Node(4);
        Node newNode5 = new Node(5);
        Node newNode6 = new Node(6);
        Node newNode7 = new Node(7);
        Node newNode8 = new Node(8);

        firstList.setNext(newNode5);
        newNode5.setNext(newNode6);
        newNode6.setNext(newNode7);
        newNode7.setNext(newNode8);
        newNode8.setNext(null);

        Node secondList = new Node(9);
        Node newNode10 = new Node(10);
        Node newNode11 = new Node(11);
        Node newNode12 = new Node(12);
        Node newNode13 = new Node(13);

        secondList.setNext(newNode10);
        newNode10.setNext(newNode11);
        newNode11.setNext(newNode12);
        newNode12.setNext(newNode13);
        newNode13.setNext(newNode6);
        newNode6.setNext(newNode7); // Same node as List1 node
        newNode7.setNext(newNode8);
        newNode8.setNext(null);

        int lengthFirst = firstList.getLength();
        int lengthSecond = secondList.getLength();

        if (firstList.getLastNode()!=secondList.getLastNode()) {
            System.out.println("Lists are not intersecting! ");
            return;
        }
        int difference = 0;
        difference = (lengthFirst>lengthSecond)?lengthFirst-lengthSecond:lengthSecond-lengthFirst;

        Node intersect = (lengthFirst>lengthSecond)?
            detectIntersection(secondList, firstList, difference):
            detectIntersection(firstList,secondList, difference);

        System.out.println("Intersection node : " + intersect.getData());
    }




    public static Node detectIntersection(Node shorterList, Node longerList, int lengthDiff){
        Node fastList=longerList;
        Node slowList=shorterList;
        int counter=0;
        while(fastList!=null){
            if (counter == lengthDiff){
                if (slowList== fastList)
                    return slowList;
                slowList = slowList.getNext();
            }else{
                counter++;
            }
            fastList = fastList.getNext();
        }

        return  null;
    }
}
