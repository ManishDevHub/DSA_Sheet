
import java.util.*;

public class LinkLQ {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        // add element
        queue.offer(12);
        queue.offer(20);
        queue.offer(23);
        System.out.println(queue);

        // delete element 12 
        System.out.println(queue.poll());

        // it telling you which element are poll next
        System.out.println(queue.peek());


    }
}