package bai1lap4;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.text.DateFormatter;

public class giaoDichDat extends quanLyDanhSachNhaDat {

    private String loaiDat;

    public giaoDichDat() {
    }

    public giaoDichDat(int maGiaoDich, LocalDate localDate, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, localDate, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          return "giaoDichDat: " + "\n" + "{" + "loaiDat = " + loaiDat + "\n" + "maGiaoDich = " + maGiaoDich + "\n" + "ngay giao dich = " +  localDate.format(dt)  + "\n" + "donGia = " + donGia + "\n" + "dienTich = " + dienTich + '}';

    }

    @Override
    public void loaiDatBandC() {
        DecimalFormat dcmfm = new DecimalFormat("#,### VND");
        double thanhTien = this.donGia * this.dienTich;
        System.out.println("thanh tien cua loai dat b va c la: " + dcmfm.format(thanhTien));
    }

    @Override
    public void loaiDatA() {
        DecimalFormat dcmfm = new DecimalFormat("#,### VND");
        double thanhTien1 = this.donGia * this.dienTich * 1.5;
        System.out.println("thanh tien cua loai dat A la: " + dcmfm.format(thanhTien1));
    }
}
