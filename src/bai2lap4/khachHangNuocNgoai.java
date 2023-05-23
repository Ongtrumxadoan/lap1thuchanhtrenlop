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
public class khachHangNuocNgoai extends danhSachHoaDonTienDienKhachHang {

    private String quocTich;

    public khachHangNuocNgoai() {
    }

    public khachHangNuocNgoai(int makhachHang, String hoTen, LocalDate loCalNgayRaHosDon, int soLuong_SoKwTieuThu, double donGia, String quocTich) {
        super(makhachHang, hoTen, loCalNgayRaHosDon, soLuong_SoKwTieuThu, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

   

    @Override
    public String toString() {
        DateTimeFormatter dtfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "danhSachHoaDonTienDienKhachHang{"+"\n"
                + "khachHang = " + makhachHang+"\n"
                + "hoTen = " + hoTen+"\n"
                + "loCalNgayRaHosDon = " + loCalNgayRaHosDon.format(dtfmt)+"\n"
                + "soLuong_SoKwTieuThu = " + soLuong_SoKwTieuThu+"\n"
                + "donGia = " + donGia + '}'+"\n"
                + "khachHangNuocNgoai{" +"\n"
                + "quocTich = " + quocTich + '}';
    }
 @Override
    public void thanhTienHoaDonTienDienNuocNgoai() {
        DecimalFormat dcmfm = new DecimalFormat("#,### VND");

        double thanhtien;
        thanhtien = donGia * soLuong_SoKwTieuThu;
        System.out.println("thanh tien dien la: " + dcmfm.format(thanhtien));
    }
}
