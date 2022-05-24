package App112.java;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class ListSinhVien {
    public static void main(String[] args) {
        LinkedList<SinhVien> listSinhVien = new LinkedList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên sinh viên:");
            String name = scanner.nextLine();
            if (name == "") {
                break;
            }
            System.out.println("Nhập điểm sinh viên:");
            double point = scanner.nextDouble();
            listSinhVien.add(new SinhVien(name, point));
        }
        String thiLai = new String();
        String diemCao = new String();
        int soSVThiLai = 0;
        double diemCaoNhat = 0.0;
        for (int i = 0; i <listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getPoint() <= 5.0) {
                soSVThiLai ++;
                thiLai += listSinhVien.get(i).getInfomation() +"\n";
            }
        }
        System.out.println("Số sinh viên thi lại: " + soSVThiLai
                + "\n" + thiLai);

        for (int i = 0; i <listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getPoint() > diemCaoNhat) {
                diemCaoNhat = listSinhVien.get(i).getPoint();
            }
        }
        for (int i = 0; i <listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getPoint() == diemCaoNhat) {
                diemCao += listSinhVien.get(i).getInfomation() +"\n";
            }
        }
        System.out.println("Các sinh viên điểm cao nhất:\n" + diemCao);
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên cần tìm: ");
            String name = scanner.nextLine();
            String ketQua = new String();
            for (int i = 0; i < listSinhVien.size(); i++) {
                if (Objects.equals(listSinhVien.get(i).getName(), name)) {
                    ketQua += (listSinhVien.get(i).getInfomation() + "\n");
                }
            }
            System.out.println(ketQua);
        }
    }
}
