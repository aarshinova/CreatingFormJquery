public class Main2 {

    // Solution using recursion
    public static void main(String[] args){

        // TEST1 1234 & 1239
        LinkedListNode node1= new LinkedListNode(5);
        node1.append(1);
        node1.append(2);
        node1.append(9);
        node1.append(4);

        LinkedListNode node2= new LinkedListNode(8);
        node2.append(2);
        //node2.append(3);
        node2.append(9);

        printList(node1);
        printList(node2);

        ListNode result1 = new ListNode();

        sumLists(node1, node2, 0, result1);
        System.out.println("Result : " + (49215 + 928));
        printList(result1.node);

        // TEST2
        LinkedListNode node3= new LinkedListNode(5);
        node3.append(1);
        node3.append(2);
        node3.append(9);
        node3.append(4);

        LinkedListNode node4= new LinkedListNode(1);
        node4.append(2);
        node4.append(9);
        node4.append(8);

        printList(node3);
        printList(node4);

        int carry=0;

        ListNode result2 = new ListNode();;

        sumLists(node3, node4, carry, result2);
        System.out.println("Result : " + (49215 + 8921));
        printList(result2.node);

    }

    public static void printList(LinkedListNode node1){
        LinkedListNode curr = node1;
        while (curr!=null) {

            System.out.println("Linked list  : " + curr.data);
            curr = curr.next;
        }
        System.out.println();

    }


    public static void sumLists(LinkedListNode node1, LinkedListNode node2, int carry, ListNode result){

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
