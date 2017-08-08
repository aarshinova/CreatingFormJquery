public class Main2 {

    // Solution using recursion
    public static void main(String[] args){

        // TEST1
        Node node1= new Node(5);
        node1.append(1);
        node1.append(2);
        node1.append(9);
        node1.append(4);

        Node node2= new Node(8);
        node2.append(2);
        node2.append(9);

        printList(node1);
        printList(node2);

        LinkedListNode result1 = new LinkedListNode();

        sumLists(node1, node2, 0, result1);
        System.out.println("Result : " + (49215 + 928));
        printList(result1.node);

        // TEST2
        Node node3= new Node(5);
        node3.append(1);
        node3.append(2);
        node3.append(9);
        node3.append(4);

        Node node4= new Node(1);
        node4.append(2);
        node4.append(9);
        node4.append(8);

        printList(node3);
        printList(node4);

        int carry=0;

        LinkedListNode result2 = new LinkedListNode();;

        sumLists(node3, node4, carry, result2);
        System.out.println("Result : " + (49215 + 8921));
        printList(result2.node);

    }

    public static void printList(Node node1){
        Node curr = node1;
        while (curr!=null) {

            System.out.println("Linked list  : " + curr.data);
            curr = curr.next;
        }
        System.out.println();

    }


    public static void sumLists(Node node1, Node node2, int carry, LinkedListNode result){

        if (node1==null && node2==null) return;
        int sum = 0;
        if (node1!=null)
        sum+=node1.data;

        if (node2!=null)
         sum += node2.data;

        sum+=carry;

        int res = sum%10;
        if (res >= 0) {
            result.append(res);
        }
        else {
            result.append(sum);
        }

        carry = sum/10;

        sumLists(((node1!= null && node1.next!=null) ? node1.next : null), ((node2!=null && node2.next!=null) ? node2.next : null), carry, result);

    }


}
