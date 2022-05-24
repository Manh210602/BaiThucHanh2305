package App109.java.Collections.com.na.collections.set;

import java.util.Scanner;
import java.util.HashSet;


public class App55{
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        HashSet<String> hashsetstring=new HashSet<>();

        hashsetstring.add("Wilson");
        hashsetstring.add("Nike");
        hashsetstring.add("Volvo");
        hashsetstring.add("Kia");
        hashsetstring.add("Lenovo");

        System.out.println("cac phan tu co trong hashsetstring la: "+hashsetstring);
        System.out.println("nhap phan tu can xoa");
        name=sc.nextLine();
        if(hashsetstring.contains(name)) {
            hashsetstring.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan tu con lai la: "+hashsetstring);
        }
        else {
            System.out.println("phan tu khong ton tai");
        }
    }
}
