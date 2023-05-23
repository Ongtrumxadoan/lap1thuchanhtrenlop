package bai1lap4;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class quanLyDanhSachNhaDat {
    
    int maGiaoDich;
    LocalDate localDate;
    double donGia;
    double dienTich;

    public quanLyDanhSachNhaDat() {
    }

    public quanLyDanhSachNhaDat(int maGiaoDich, LocalDate localDate, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.localDate = localDate;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getDonGia() {
        return donGia;
        
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "quanLyDanhSachNhaDat{" + "maGiaoDich=" + maGiaoDich + ", localDate=" + localDate + ", donGia=" + donGia + ", dienTich=" + dienTich + '}';
    }

    public void loaiDatBandC() {

    }

    public void loaiDatA() {
        
        

    }

    public void loaiNhaCaoCap() {

    }

    public void loaiNhaThuong() {

    }

}
