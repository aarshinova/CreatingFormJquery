public class Main {
    // find out if two linked lists intersects
    public static void main(String[] args) {

        Node list = new Node(1);
        Node newNode2 = new Node(2);
        Node newNode3 = new Node(3);
        Node newNode4 = new Node(4);
        Node newNode5 = new Node(5);
        Node newNode6 = new Node(6);
        Node newNode7 = new Node(7);
        Node newNode8 = new Node(8);

        list.next=newNode2;
        newNode2.next=newNode3;
        newNode3.next=newNode4;
        newNode4.next=newNode5;
        newNode5.next=newNode6;
        newNode6.next=newNode7;
        newNode7.next=newNode8;

        TreeNode newTree = sortedListToBST(list);

    }

    static TreeNode sortedListToBST(Node head) {
        return findSorted(head, null);

    }

    static TreeNode findSorted(Node head, Node tail){
        Node h = head;
        Node runner= head;
        if (head==tail) return null;
        while ((runner.next!=null && runner.next.next!=null && tail==null) || (tail!=null && runner.next!=tail)){
            runner = runner.next.next;
            h = h.next;
        }
        TreeNode node = new TreeNode(h.data);

        node.left = findSorted(head, h);;
        node.right = findSorted(h.next, tail);;

        return node;
    }

}