package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>();
//        Queue<String> queue = new LinkedList<>();
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Joko");
        queue.add("Bob");
        queue.add("Andi");
        queue.add("koby");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

    }
}
