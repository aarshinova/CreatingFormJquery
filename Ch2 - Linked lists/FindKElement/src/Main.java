public class Main {
    // Find kth element
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        Node found = list.findKthNode(5);

        System.out.println("El found : " + found.getData());

    }
}
