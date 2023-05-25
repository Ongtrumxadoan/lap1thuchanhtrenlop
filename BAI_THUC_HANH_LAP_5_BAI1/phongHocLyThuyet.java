/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_THUC_HANH_LAP_5_BAI1.bai1lap5;

/**
 *
 * @author Admin
 */
public class phongHocLyThuyet extends phongHocSinhVien{
    private  String mayChieu;

    public phongHocLyThuyet() {
    }

    
    public phongHocLyThuyet( String maPhong, String dayNha, double dienTich, int soBongDen,String mayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayChieu = mayChieu;
    }

     

    public String isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(String mayChieu) {
        this.mayChieu = mayChieu;
    }

    @Override
    public String toString() {
        return "phongHocLyThuyet{" +"MaPhong = "+this.maPhong+
                "\n"+"Day Nha = "+this.dayNha+
                "\n"+"dien Tich = "+this.dienTich+
                "\n"+"so bong den = "+this.soBongDen+
                "\n"+ "mayChieu=" + mayChieu + '}';
    }
    
     public void kiemTraPhongMayTinhDTC(){
         
    }
}
