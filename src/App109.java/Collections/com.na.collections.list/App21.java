package App109.java.Collections.com.na.collections.list;

import java.util.ArrayList;

public class App21 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add(1, "Green");
        color.add(4, "Puple");
        color.remove("Green");
        color.set(0, "Pink");


        System.out.println("Cac phan tu co trong danh sach la:");
        for(int i = 0; i < color.size(); i++){
            System.out.println(color.get(i));
        }
        System.out.println("So phan tu co trong danh sach la:" + color.size());
        System.out.println(color.contains("Red"));
        System.out.println(color);
    }
}
