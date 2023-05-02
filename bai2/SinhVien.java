/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Admin
 */
public class SinhVien {
    public  String masinhvien;
    public String hoTen;

    public SinhVien(String masinhvien, String hoTen) {
        this.masinhvien = masinhvien;
        this.hoTen = hoTen;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return 
                "\t         "+"\n     "+"ma sinh vien=" + masinhvien +" hoTen=" + hoTen +"\n";
    }
    
    
}
