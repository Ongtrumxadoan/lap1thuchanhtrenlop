/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_THUC_HANH_LAP_5_BAI1.bai1lap5;

/**
 *
 * @author Admin
 */
public class phongThiNghiem extends phongHocSinhVien{
    private String thongTinChuyenNganh;
    private int sucChua;
    private String bonRua;

    public phongThiNghiem(String thongTinChuyenNganh, int sucChua, String bonRua) {
        this.thongTinChuyenNganh = thongTinChuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }

    public phongThiNghiem(String thongTinChuyenNganh, int sucChua, String bonRua, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.thongTinChuyenNganh = thongTinChuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }

    public String getThongTinChuyenNganh() {
        return thongTinChuyenNganh;
    }

    public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
        this.thongTinChuyenNganh = thongTinChuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public String isBonRua() {
        return bonRua;
    }

    public void setBonRua(String bonRua) {
        this.bonRua = bonRua;
    }

    @Override
    public String toString() {
        return "phongThiNghiem{"+"MaPhong = "+this.maPhong+
                "\n"+"Day Nha = "+this.dayNha+
                "\n"+"dien Tich = "+this.dienTich+
                "\n"+"so bong den = "+this.soBongDen+"\n" +
                "thongTinChuyenNganh=" + thongTinChuyenNganh +
                "\n"+"sucChua=" + sucChua +"\n"+
                "bonRua=" + bonRua + '}';
    }
    
     public void kiemTraPhongThiNghiemDTC(){
       
    }
    
    
}
