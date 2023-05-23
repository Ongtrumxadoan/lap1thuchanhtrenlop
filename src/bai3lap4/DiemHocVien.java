/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lap4;

/**
 *
 * @author Admin
 */
public class DiemHocVien {

    private String hoTen;
    private int namSinh;
    private double monToan;
    private double monVan;
    private double monLy;
    private double monHoa;
    private double monSinh;

    public DiemHocVien() {
    }

    public DiemHocVien(String hoTen, int namSinh, double monToan, double monVan, double monLy, double monHoa, double monSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.monToan = monToan;
        this.monVan = monVan;
        this.monLy = monLy;
        this.monHoa = monHoa;
        this.monSinh = monSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getMonToan() {
        return monToan;
    }

    public void setMonToan(double monToan) {
        this.monToan = monToan;
    }

    public double getMonVan() {
        return monVan;
    }

    public void setMonVan(double monVan) {
        this.monVan = monVan;
    }

    public double getMonLy() {
        return monLy;
    }

    public void setMonLy(double monLy) {
        this.monLy = monLy;
    }

    public double getMonHoa() {
        return monHoa;
    }

    public void setMonHoa(double monHoa) {
        this.monHoa = monHoa;
    }

    public double getMonSinh() {
        return monSinh;
    }

    public void setMonSinh(double monSinh) {
        this.monSinh = monSinh;
    }

    @Override
    public String toString() {
        return "DiemHocVien{" + "\thoTen=" + hoTen + "\n"
                + "\t\t\tnamSinh =" + namSinh + "\n"
                + "\t\t\tmonToan =" + monToan + "\n"
                + "\t\t\tmonVan  =" + monVan + "\n"
                + "\t\t\tmonLy   =" + monLy + "\n"
                + "\t\t\tmonHoa  =" + monHoa + "\n"
                + "\t\t\tmonSinh =" + monSinh + '}';
    }

    public double diemTrungBinh() {
        return (monHoa + monLy + monSinh + monToan + monVan) / 5;
    }

    public void dieuKienLamLuanVan() {
        if (diemTrungBinh() > 7 || this.monHoa > 5 || this.monLy > 5 || this.monSinh > 5 || this.monToan > 5 || this.monVan > 5) {
            System.out.println("\t\tSinh vien du dieu kien lam luan van");
        } else {
            System.out.println("\t\tSinh vien khong du dieu kien lam luan van");
        }

    }

    public void dieuKienThiTotNghiep() {
        if (diemTrungBinh() < 7 || this.monHoa > 5 || this.monLy > 5 || this.monSinh > 5 || this.monToan > 5 || this.monVan > 5) {
            System.out.println("\t\tSinh vien du dieu kien thi tot nghiep");
        } else {
            System.out.println("\t\tSinh vien khong du diue kien thi tot nghiep");
        }
    }

    public void dieuKienThiLai() {
        if (this.monHoa < 5) {
            System.out.println("\t\t\tthi Lai mon Hoa");
        }
        if (this.monLy < 5) {
            System.out.println("\t\t\tthi lai mon ly");
        }
        if (this.monSinh < 5) {
            System.out.println("\t\t\tthi lai mon Sinh");
        }
        if (this.monToan < 5) {
            System.out.println("\t\t\tthi lai mon Toan");
        }
        if (this.monVan < 5) {
            System.out.println("\t\t\tthi lai mon VAn");
        } else {
            System.out.println("\t\t\tkhong co mon nao thi lai");
        }
    }

}
