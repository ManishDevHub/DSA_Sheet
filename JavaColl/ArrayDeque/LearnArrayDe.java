import java.util.*;;

public class LearnArrayDe {
    public static void main(String[] args) {
        
        // In this queue you can add element from stating and ending and also you do deleting front and rear

        // it implement Queue so all queue method apply 

        ArrayDeque<Integer> ad = new ArrayDeque<>();
ad.offer(43);
ad.offer(33);
ad.offerFirst(553);
ad.offerLast(22);
System.out.println(ad);
ad.poll();
ad.pollFirst();
ad.pollLast();
ad.peek();
ad.peekFirst();
ad.peekLast();
        
    }
}
