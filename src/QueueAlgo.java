import java.util.LinkedList;
import java.util.Queue;

public class QueueAlgo {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(6);
        queue.add(8);
        queue.add(9);
        queue.add(12);

        System.out.println(queue);

        // for(int e : queue){e
        //     System.out.print(e+"=>");
        // }

        queue.remove();
        queue.remove();

        System.out.println(queue);

    }
}
