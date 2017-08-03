public class Main2 {

    static class LinkedList {
        private LinkedListNode head;

        public LinkedList(LinkedListNode head) {
            this.head = head;
        }

        public void setHead(LinkedListNode head) {
            this.head = head;
        }

        void print() {
            LinkedListNode curr = head;
            while (curr!=null) {
                System.out.println("Linked list : " + curr.data);
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args){
        LinkedListNode node= new LinkedListNode(1);
        node.append(2);
        node.append(3);
        node.append(4);
        LinkedList list = new LinkedList(node);

        System.out.println("===before reverse===");
        list.print();
        reverseList(list);
        System.out.println("===after reverse===");
        list.print();
    }

    public static void reverseList(LinkedList list) {
        LinkedListNode current = list.head;
        LinkedListNode runner = list.head;
        LinkedListNode prev = null;
        while (runner!=null){
            LinkedListNode next = current.next;
            current.next = prev;
            prev = current;
            if (next!=null) {
                current = next;
            }
            runner = next;
        }
        list.setHead(current);
    }
}
