package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Lower than 30: " + numbers.lower(30));
        System.out.println("Higher than 30: " + numbers.higher(30));
        System.out.println("Ceiling by 21: " + numbers.ceiling(21));
        System.out.println("Floor of 28: " + numbers.floor(28));

        System.out.println("Poll First: " + numbers.pollFirst());
        System.out.println("Poll Last: " + numbers.pollLast());

        System.out.println("NavigableSet After polling");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        NavigableSet<Integer> descendingSet = numbers.descendingSet();
        System.out.println("Descending Set: ");
        for (Integer number : descendingSet) {
            System.out.println(number);
        }
    }
}
