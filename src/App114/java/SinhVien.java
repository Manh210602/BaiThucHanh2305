package App114.java;

import java.util.Scanner;

public class SinhVien {
    public String hoten;
    public int masv;
    public String lop;
    public SinhVien(){}
    public SinhVien(String ht,int masv,String lop){
        this.hoten = ht;
        this.masv = masv;
        this.lop = lop;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String ht) {
        this.hoten = ht;
    }
    public String toString() {
        return "Họ tên: "+hoten+"\t"+"Mã sinh viên: "+masv+"\t"+"Lớp: "+lop;
    }
    public int getMasv() {
        return masv;
    }
    public void setMasv(int masv) {
        this.masv = masv;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoten =sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        masv =sc.nextInt();
        System.out.println("Nhập lớp: ");
        lop = sc.nextLine();
    }
}