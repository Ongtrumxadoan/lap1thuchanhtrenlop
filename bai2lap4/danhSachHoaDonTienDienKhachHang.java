package bai2lap4;

import java.time.LocalDate;

public class danhSachHoaDonTienDienKhachHang {

    int makhachHang;
    String hoTen;
    LocalDate loCalNgayRaHosDon;
    int soLuong_SoKwTieuThu;
    double donGia;

    public danhSachHoaDonTienDienKhachHang() {
    }

    public danhSachHoaDonTienDienKhachHang(int makhachHang, String hoTen, LocalDate loCalNgayRaHosDon, int soLuong_SoKwTieuThu, double donGia) {
        this.makhachHang = makhachHang;
        this.hoTen = hoTen;
        this.loCalNgayRaHosDon = loCalNgayRaHosDon;
        this.soLuong_SoKwTieuThu = soLuong_SoKwTieuThu;
        this.donGia = donGia;
    }

    public int getmaKhachHang() {
        return makhachHang;
    }

    public void setKhachHang(int makhachHang) {
        this.makhachHang = makhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getLoCalNgayRaHosDon() {
        return loCalNgayRaHosDon;
    }

    public void setLoCalNgayRaHosDon(LocalDate loCalNgayRaHosDon) {
        this.loCalNgayRaHosDon = loCalNgayRaHosDon;
    }

    public double getSoLuong_SoKwTieuThu() {
        return soLuong_SoKwTieuThu;
    }

    public void setSoLuong_SoKwTieuThu(int soLuong_SoKwTieuThu) {
        this.soLuong_SoKwTieuThu = soLuong_SoKwTieuThu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "danhSachHoaDonTienDienKhachHang{" + "khachHang=" + makhachHang + ", hoTen=" + hoTen + ", loCalNgayRaHosDon=" + loCalNgayRaHosDon + ", soLuong_SoKwTieuThu=" + soLuong_SoKwTieuThu + ", donGia=" + donGia + '}';
    }

    public void thanhTienHoaDonTienDienVietNam(){
        
    }
    public void thanhTienHoaDonTienDienNuocNgoai(){
        
    }

     
    
    
}
