package collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        Map<String,String> map = new IdentityHashMap<>();

        String key1 = new String("Key");
        String key2 = new String("Key");

        map.put(key1,"value1");
        map.put(key2,"value2");

        System.out.println(map.size());

        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
