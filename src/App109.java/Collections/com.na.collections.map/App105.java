package App109.java.Collections.com.na.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App105 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        treeMap.put(1, 'A');
        treeMap.put(2, 'B');
        treeMap.put(3, 'C');
        treeMap.put(4, 'D');
        treeMap.put(5, 'E');
        treeMap.put(6, 'F');
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
        System.out.println(" Các entry có trong setTreeMap:");
        System.out.println(setTreeMap);

    }
}
