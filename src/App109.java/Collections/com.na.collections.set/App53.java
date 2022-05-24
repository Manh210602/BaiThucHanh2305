package App109.java.Collections.com.na.collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class App53 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashsetintenger=new HashSet<>();
        Scanner sc=new Scanner(System.in);

        hashsetintenger.add(0);
        hashsetintenger.add(3);
        hashsetintenger.add(1);
        hashsetintenger.add(4);
        hashsetintenger.add(2);
        hashsetintenger.add(8);

        System.out.println("cac phan tu co trong hashsetinteger la: "+hashsetintenger);
        System.out.println("nhap phan tu can them");
        number=sc.nextInt();

        if(!hashsetintenger.contains(number)) {
            hashsetintenger.add(number);
            System.out.println("them phan tu thanh cong");
            System.out.println("cac phan tu sau khi them la: "+hashsetintenger);
        }
        else {
            System.out.println("phan tu "+number+" da ton tai");
        }
    }
}
