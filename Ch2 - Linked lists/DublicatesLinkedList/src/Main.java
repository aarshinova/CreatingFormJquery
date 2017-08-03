public class Main {

    public static void main(String[] args){
        LinkedListNode node= new LinkedListNode(1);
        node.append(2);
        node.append(3);
        node.append(2);
        node.append(6);
        node.append(3);

        LinkedListNode curr = node;
        while (curr!=null) {

            System.out.println("Linked list : " + curr.data);
            curr = curr.next;
        }

         removeDuplicates(node);

        while (node!=null) {
            System.out.println("Linked list no duplicates : " + node.data);
            node = node.next;
        }
    }

    public static void removeDuplicates(LinkedListNode head) {

        LinkedListNode current = head;
        LinkedListNode runner = null;
        int data;
        int nextData;
        while (current!=null) {
            data = current.data;
            runner = current;
            while (runner!=null && runner.next!=null){
                nextData = runner.next.data;
                if (data == nextData){
                    // remove node
                    runner.next = runner.next.next;

                }
                runner = runner.next;
            }
            current = current.next;
        }
    }
}
