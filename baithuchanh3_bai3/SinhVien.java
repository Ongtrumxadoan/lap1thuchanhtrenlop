/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3_bai3;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String maSinhVien;
    private String hoTenSinhVien;
    private int namSinhSinhVien;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTenSinhVien, int namSinhSinhVien) {
        this.maSinhVien = maSinhVien;
        this.hoTenSinhVien = hoTenSinhVien;
        this.namSinhSinhVien = namSinhSinhVien;
    }

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

     

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTenSinhVien() {
        return hoTenSinhVien;
    }

    public void setHoTenSinhVien(String hoTenSinhVien) {
        this.hoTenSinhVien = hoTenSinhVien;
    }

    public int getNamSinhSinhVien() {
        return namSinhSinhVien;
    }

    public void setNamSinhSinhVien(int namSinhSinhVien) {
        this.namSinhSinhVien = namSinhSinhVien;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSinhVien=" + maSinhVien + ", hoTenSinhVien=" + hoTenSinhVien + ", namSinhSinhVien=" + namSinhSinhVien + '}';
    }
}
