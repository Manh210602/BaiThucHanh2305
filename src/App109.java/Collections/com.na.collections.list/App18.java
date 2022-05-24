package App109.java.Collections.com.na.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) throws Exception {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.5f);
        arrListFloat.add(7.3f);
        arrListFloat.add(6.5f);
        arrListFloat.add(5.5f);
        arrListFloat.add(10.5f);
        arrListFloat.add(5, 6.5f);

        Iterator<Float> iter = arrListFloat.iterator();

        System.out.println("Cac phan tu co trong danh sach la:");
        while(iter.hasNext()){
            System.out.println(iter.next() + "\t");
        }
    }
}