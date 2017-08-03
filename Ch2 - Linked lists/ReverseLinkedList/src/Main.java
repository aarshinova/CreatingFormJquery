public class Main {

    public static void main(String[] args){
        LinkedListNode node= new LinkedListNode(1);
        node.append(2);
        node.append(3);
        node.append(4);

        LinkedListNode curr = node;
        while (curr!=null) {

            System.out.println("Linked list : " + curr.data);
            curr = curr.next;
        }

        LinkedListNode newList = reverseList(node);

        while (newList!=null) {
            System.out.println("Linked list reversed : " + newList.data);
            newList = newList.next;
        }
    }

    public static LinkedListNode reverseList(LinkedListNode current) {
        LinkedListNode newList = null;
        while (current!=null){
            LinkedListNode next = current.next;
            current.next = newList;
            newList = current;
            current = next;
        }
        return newList;
    }
}
