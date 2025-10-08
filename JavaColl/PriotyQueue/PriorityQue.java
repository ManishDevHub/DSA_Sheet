import java.util.*;

public class PriorityQue {
    
    public static void main(String[] args) {
        
        // min heap implement kar rha hae 
                // PriorityQueue< Integer> pq = new PriorityQueue<>();
        // if i pass Comparator.reverseOder it will become maxheap
        PriorityQueue< Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
             pq.offer(59);
             pq.offer(20);
             pq.offer(30);
             pq.offer(10);
             System.out.println(pq);
             pq.poll();
             System.out.println(pq);
             System.out.println(pq.peek());
    }
}
