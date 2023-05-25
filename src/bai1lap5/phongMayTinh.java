 
package bai1lap5;
 
public class phongMayTinh extends phongHocSinhVien{
    private int mayTinh;

    public phongMayTinh(int mayTinh) {
        this.mayTinh = mayTinh;
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
        return "phongMayTinh{" + "mayTinh=" + mayTinh + '}';
    }
    
    
    
    
   
   
}
