package bai1lap4;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class giaoDichNha extends quanLyDanhSachNhaDat {

    private String loaiNha;
    private String diaChi;

    public giaoDichNha() {
    }

    public giaoDichNha(int maGiaoDich, LocalDate localDate, double donGia, double dienTich, String diaChi, String loaiNha) {
        super(maGiaoDich, localDate, donGia, dienTich);
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "giaoDichNha{" + "loaiNha=" + loaiNha + "\n"+
                "diaChi=" + diaChi +"\n"+ 
                '}'+"quanLyDanhSachNhaDat{" + "maGiaoDich=" + maGiaoDich + "\n"+
                "localDate=" + localDate +"\n"+
                "donGia=" + donGia +"\n"+
                "dienTich=" + dienTich + '}';
    }

    @Override
    public void loaiNhaCaoCap() {
        DecimalFormat dcmfm = new DecimalFormat("#,### VND");

        double thanhTienNhaCaoCap = this.dienTich * this.donGia;
        System.out.println("thanh tien nha cao cap la: " + dcmfm.format(thanhTienNhaCaoCap));
    }

    @Override
    public void loaiNhaThuong() {
        DecimalFormat dcmfm = new DecimalFormat("#,### VND");

        double thanhTienNhaThuong = this.dienTich * this.donGia * 0.9;
        System.out.println("thanh tien nha thuong la: " + dcmfm.format(thanhTienNhaThuong));
    }

}
