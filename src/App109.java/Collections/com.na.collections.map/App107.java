package App109.java.Collections.com.na.collections.set;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class App107 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 1.0);
        treeMap.put(2, 10.1d);
        treeMap.put(3, 3.0d);
        treeMap.put(4, 4.0d);
        treeMap.put(5, 20.0d);

        System.out.println("Các phần tử có trong TreeMap:");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        treeMap.replace(2, 10.1d);

        treeMap.replace(1, 1.0, 20.0d);

        System.out.println("Các phần tử có trong TreeMap sau khi replace:");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
    }

}
