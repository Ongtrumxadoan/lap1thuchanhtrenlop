/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lap4;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class khachHangVietNam extends danhSachHoaDonTienDienKhachHang {

    private String doiTuongKhachHang;
    private double dinhMuc;

    public khachHangVietNam() {
    }

    public khachHangVietNam(int makhachHang, String hoTen, LocalDate loCalNgayRaHosDon, int soLuong_SoKwTieuThu, double donGia, String doiTuongKhachHang, double dinhMuc) {
        super(makhachHang, hoTen, loCalNgayRaHosDon, soLuong_SoKwTieuThu, donGia);
        this.dinhMuc = dinhMuc;
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "danhSachHoaDonTienDienKhachHang{"+"\n" 
                +"ma khach Hang = " + makhachHang+"\n"
                +"ho Ten = " + hoTen +"\n"+
                "loCalNgay Ra Ho sDon = "+ loCalNgayRaHosDon.format(dtfmt) +"\n"+
                "so Luong_SoKwTieuThu = "+ soLuong_SoKwTieuThu +"\n"+
                "don Gia = " + donGia+"\n"
                + '}' +"\n"
                +"khach Hang Viet Nam{" +"\n"+
                "doi Tuong Khach Hang = "+ doiTuongKhachHang +"\n"+
                "dinh Muc = " + dinhMuc + '}';
    }

    @Override
    public void thanhTienHoaDonTienDienVietNam() {
        DecimalFormat dcmfm = new DecimalFormat("#,### VND");
        double thanhtien;
        if (this.soLuong_SoKwTieuThu <= dinhMuc) {
            thanhtien = soLuong_SoKwTieuThu * donGia;
            System.out.println("thanh tien dien Viet Nam la: " + dcmfm.format(thanhtien));
        } else {
            thanhtien = soLuong_SoKwTieuThu * donGia * dinhMuc + (soLuong_SoKwTieuThu - dinhMuc) * donGia * 2.5;
            System.out.println("thanh tien dien Viet Nam la: " + dcmfm.format(thanhtien));
        }
    }

}
