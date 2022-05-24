package App109.java.Collections.com.na.collections.map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class App87 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("HN", "Hà Nội");
        hashMapCity.put("HCM", "Hồ Chí Minh");
        hashMapCity.put("HN", "Ha thanh");
        hashMapCity.put("HCM", "Tp Hồ Chí Minh");

        System.out.println("Danh sách các thành phố trong hashMapCity: ");
        Set<Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("HN: " + hashMapCity.get("HN"));
        System.out.println("HCM: " + hashMapCity.get("HCM"));

        if (hashMapCity.containsValue("Hà Nội")) {
            System.out.println("Hà Nội có trong hashMapCity");
        } else {
            System.out.println("Hà Nội không có trong hashMapCity");
        }
    }
}
