package App109.java.Collections.com.na.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App85 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put("key4", "value4");
        hashMap.put("key5", "value5");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Các phần tử trong HashMap: ");
        System.out.println(setHashMap);
    }
}
