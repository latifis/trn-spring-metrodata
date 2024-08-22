package collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        // Menembahkan Data
        names.add("John");
        names.add("Jane");
        names.add("Joko");

        // Menambahkan data pada indeks tertentu
        names.add(1, "Joni");

        // Mengakses elemen berdasarkan indeks
        System.out.println("Element at index 1: " + names.get(1));

        // Melihat size arraylist
        System.out.println(names.size());

        // Mengganti elemen pada indeks tertentu
        names.set(2, "Jodi");

        // Menghapus elemen berdasarkan indeks
        names.remove(3);

        // Menampilkan semua elemen dalam ArrayList
        System.out.println("Names in list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Mengecek apakah ArrayList mengandung elemen tertentu
        if (names.contains("Jodi")) {
            System.out.println("ArrayList contains Jodi");
        }

        // Menghapus semua elemen dari ArrayList
        names.clear();
        System.out.println("Size of ArrayList after clear: " + names.size());


        /// TTRYY
        Employee emp = new Employee();
        emp.name = "latif";
        emp.salary = 2000;

        System.out.println(emp.toString());
    }

}
