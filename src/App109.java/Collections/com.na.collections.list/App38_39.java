package App109.java.Collections.com.na.collections.list;

import java.util.LinkedList;
public class App38_39 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("Java");

        System.out.println("Vi du su dung phuong thuc addAll:");
        System.out.println("---------------------------------");

        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.print("ListA:");
        showList(listA);
    }

    public static void showList(LinkedList<String> list){
        for(String obj : list) {
            System.out.print("\t" + obj + ", ");
        }

        System.out.println();
    }
}
