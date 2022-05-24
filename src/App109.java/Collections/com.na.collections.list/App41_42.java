package App109.java.Collections.com.na.collections.list;

import java.util.Scanner;
import java.util.LinkedList;

public class App41_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();
        list.add("Thang 1");
        list.add("Thang 2");
        list.add("Thang 3");
        list.add("Thang 4");
        list.add("Thang 5");
        list.add("Thang 6");
        list.add("Thang 7");
        list.add("Thang 8");
        list.add("Thang 9");
        list.add("Thang 10");
        list.add("Thang 11");
        list.add("Thang 12");


        System.out.println("Nhap vao chi so phan tu can lay: ");
        int index = sc.nextInt();

        if(index < 0 || index > list.size() - 1) {
            System.out.println("Chi so can lay phai lon hon 0 va nho hon " + (list.size() - 1));
        }
        else {
            String node = list.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong list la:" + node);
        }

        String firstNode = list.getFirst();
        String lastNode = list.getLast();

        System.out.println("Phan tu dau tien trong day la: " + firstNode);
        System.out.println("Phan tu cuoi cung trong day la: " + lastNode);

    }
}
