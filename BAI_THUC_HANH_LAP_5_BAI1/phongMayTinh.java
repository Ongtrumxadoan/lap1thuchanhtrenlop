 
package BAI_THUC_HANH_LAP_5_BAI1.bai1lap5;
 
public class phongMayTinh extends phongHocSinhVien{
    private int mayTinh;

    public phongMayTinh( ) {
        
    }

    public phongMayTinh(int mayTinh, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayTinh = mayTinh;
    }

    

    public int getMayTinh() {
        return mayTinh;
    }

    public void setMayTinh(int mayTinh) {
        this.mayTinh = mayTinh;
    }

    @Override
    public String toString() {
        return "phongMayTinh{" +"MaPhong = "+this.maPhong+
                "\n"+"Day Nha = "+this.dayNha+
                "\n"+"dien Tich = "+this.dienTich+
                "\n"+"so bong den = "+this.soBongDen+
                "\n"+"mayTinh=" + mayTinh + '}';
    }
    
    
    
    
   
   
}
