public class Main {
    // Solution 1 without recursion ( bad and long )
    public static void main(String[] args){

        // TEST1
        Node node1= new Node(5);
        node1.append(1);
        node1.append(2);
        node1.append(9);
        node1.append(4);

        Node node2= new Node(1);
        node2.append(2);
        node2.append(9);

        printList(node1);
        printList(node2);

        Node output = summLists(node1, node2);
        System.out.println("Result : " + (49215 + 921));
        printList(output);

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

        Node output2 = summLists(node3, node4);
        System.out.println("Result : " + (49215 + 8921));
        printList(output2);

    }

    public static void printList(Node node1){
        Node curr = node1;
        while (curr!=null) {

            System.out.println("Linked list  : " + curr.data);
            curr = curr.next;
        }
        System.out.println();

    }


    public static Node summLists(Node node1, Node node2){
        Node result = null;
        boolean init = false;
        int buff = 0;

        while (node1!=null || node2!=null){
            int sum=0;
            if (node1!=null && node2!=null) {
                 sum = node1.data + node2.data;
            }else if (node1==null){
                sum = node2.data;
            }
            else if (node2==null){
                sum = node1.data;
            }

            if (sum>=10){
                    if (init == false) {
                        result = new Node(sum % 10 + buff);
                        init = true;
                    }
                    else {
                        result.append(sum%10 + buff);
                    }
                    buff=1;
            } else if (sum%10+buff>=10) {
                if (init == false) {
                    result = new Node((sum%10+buff) % 10);
                    init = true;
                }
                else {
                    result.append((sum%10+buff)% 10);
                }
                buff = 1;
            }
            else{
                if (init == false) {
                    result = new Node(sum + buff);
                    init = true;
                }
                else {
                    result.append(sum + buff);
                }
                buff = 0;
            }
            if (node1!=null)
            node1 = node1.next;
            if (node2!=null)
            node2 = node2.next;
        }

       if (buff!=0) result.append(buff);

        return result;

    }


}
