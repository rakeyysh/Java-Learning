import java.util.PriorityQueue;

public class Heap_learn {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // default min heap

        pq.offer(10);
        pq.offer(1);
        pq.offer(97);
        pq.offer(8);
        pq.offer(137);
        pq.offer(31);

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());

    }

}
