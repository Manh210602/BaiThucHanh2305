package App114.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App114 {
    public static void main(String[] args) {
        System.out.print("Nhập số sinh viên: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SinhVien sv = new SinhVien();
        HashMap<Integer, SinhVien> h = new HashMap<>();

        for(int i = 0; i < n; i++){
            System.out.println("Nhập sinh viên thứ " + i + ": ");
            sv.nhap();
            h.put(i, sv);
        }
        System.out.println("Nhập tên lớp sinh viên cần tìm: ");
        String lop = sc.nextLine();
        System.out.println("Các sinh viên có trong lớp là: ");
        for(Map.Entry<Integer, SinhVien> s : h.entrySet()) {
            if(s.getValue().getLop() == lop) {
                System.out.println(s.getValue());
            }
        }
        System.out.println("Nhập mã sinh viên cần tìm: ");
        int masv = sc.nextInt();
        System.out.println("Sinh viên cần tìm là: ");
        for(Map.Entry<Integer, SinhVien> s : h.entrySet()) {
            if(s.getValue().getMasv() == masv) {
                System.out.println(s.getValue());
            }
        }
    }
}
