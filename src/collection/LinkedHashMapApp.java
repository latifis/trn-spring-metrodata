package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 10);
        map.put("Budi", 20);
        map.put("Kimmy", 30);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
