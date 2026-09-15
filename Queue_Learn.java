import java.util.*;

public class Queue_Learn {

    public static void main(String[] args) {

        Queue<Integer> pq = new ArrayDeque<>();

        // pq.offer(1);
        // pq.offer(2);
        // pq.offer(3);
        // pq.offer(4);
        // pq.offer(5);

        // System.out.println(pq.element()); // java.util.NoSuchElementException -->
        // gives exception

        // Integer first = pq.peek(); // much safer for null access preferable
        // System.out.println(first);

        // System.out.println(pq.remove()); // java.util.NoSuchElementException
        System.out.println(pq.poll()); // same here like before much safer

        // System.out.println(pq.poll());

    }

}
