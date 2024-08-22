package collection;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "latif");
        map.put("age", 23);
        map.put("isVerified", true);
        map.put("name", "irfan");

        System.out.println(map);
        System.out.println(map.get("name"));
    }
}
