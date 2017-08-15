import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        QueueNode queue = new QueueNode();
        queue.add(3);
        queue.add(4);
        queue.add(9);
        queue.add(6);
        queue.add(2);

        queue.printAll();

        queue.remove();
        queue.remove();
        queue.remove();

        queue.printAll();
    }
}
