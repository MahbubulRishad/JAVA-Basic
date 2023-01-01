package JavaArrayList;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
//        Map creation
        Map<String, Object> map = new HashMap<>();

//        value add
        map.put("ID", 1001);
        map.put("Name", "Raka");
        map.put("Age", 21);
        map.put("Sex", "Male");
        map.put("Study", "HSC");

        System.out.println(map);

//        get value
        System.out.println(map.get("Name"));
        System.out.println(map.get("ID"));

//        remove key/value
        map.remove("Study");
        System.out.println(map);
    }
}
