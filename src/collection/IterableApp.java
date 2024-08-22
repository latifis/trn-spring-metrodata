package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Joko", "John", "Jean");
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }

//        Collection.
    }
}
