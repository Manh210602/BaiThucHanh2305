package App109.java.Collections.com.na.collections.set;

import java.util.TreeSet;
import java.util.Scanner;
public class App68 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treesetinteger =new TreeSet<>();
        Scanner sc=new Scanner(System.in);

        treesetinteger.add(0);
        treesetinteger.add(3);
        treesetinteger.add(1);
        treesetinteger.add(4);
        treesetinteger.add(2);
        treesetinteger.add(8);

        System.out.println("cac phan tu co trong treesetinteger la: "+treesetinteger);
        number=sc.nextInt();

        if(!treesetinteger.contains(number)) {
            treesetinteger.add(number);
            System.out.println("them thanh cong");
            System.out.println("cac phan tu co trong treesetinteger la: "+treesetinteger);
        }
        else {
            System.out.println("phan tu da ton tai");
        }
    }
}
