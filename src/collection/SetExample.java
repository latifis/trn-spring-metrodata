package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {
    public static void main(String[] args) {
        Set<String> data = new HashSet<String>();
        data.add("A");
        data.add("a");

        data.stream().collect(Collectors.toList()).get(0);
        System.out.println(data.stream().collect(Collectors.toList()).get(0));

//        data

        System.out.println(data);
    }
}
