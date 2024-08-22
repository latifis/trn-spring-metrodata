package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {

    public static void main(String[] args) {

        SortedSet<String> fruits = new TreeSet<>();

        // Menambahkan elemen ke dalam TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        // Menampilkan elemen-elemen dalam TreeSet
        System.out.println("SortedSet elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Menggunakan metode navigasi
        System.out.println("First element: " + fruits.first());
        System.out.println("Last element: " + fruits.last());

        // Mengambil subset elemen
        SortedSet<String> headSet = fruits.headSet("Mango");
        System.out.println("HeadSet (elements before Mango): " + headSet);

        SortedSet<String> tailSet = fruits.tailSet("Mango");
        System.out.println("TailSet (get elements from Mango): " + tailSet);

        SortedSet<String> subSet = fruits.subSet("Apple", "Orange");
        System.out.println("SubSet (elements from Apple to Orange, exclusive): " + subSet);
    }

}
