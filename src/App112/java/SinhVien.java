package App112.java;

public class SinhVien {
    private String name;
    private double point;

    public SinhVien(String name, double point) {
        this.name = name;
        this.point = point;
    }

    public SinhVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    public String getInfomation() {
        return "Tên sinh viên: " + getName() + ". Điểm: " + getPoint() + ".";
    }
}
