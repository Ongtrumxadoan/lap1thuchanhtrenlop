package bai1;
public class Account {
 public long sotaikhoan;
 public String tentaikhoan;
 public double sotien;
 public String trangthai;
 public double laisuat = 0.035;

    public Account() {
        this.sotaikhoan  =99999999;
        this.sotien      = 50;
        this.tentaikhoan = null; 
        this.trangthai = "";
    }

   
    public Account(long sotaikhoan, String tentaikhoan, double sotien, String trangthai) {
        this.sotaikhoan     = sotaikhoan;
        this.tentaikhoan    = tentaikhoan;
        this.sotien         = sotien;
        this.trangthai      = trangthai;
    }

    public Account(long sotaikhoan, String tentaikhoan) {
        this.sotaikhoan = sotaikhoan;
        this.tentaikhoan = tentaikhoan;
        this.sotien = 50;
    }

    public long getSotaikhoan() {
        return sotaikhoan;
    }
    public String getTentaikhoan() {
        return tentaikhoan;
    }
    public double getSotien() {
        return sotien;
    }
    
    public void setSotaikhoan(long sotaikhoan) {
        if(sotaikhoan>0 && sotaikhoan!=0){        
            this.sotaikhoan = sotaikhoan;
    }
        else{
            this.sotaikhoan = 0;
        }
    }
    public void setTentaikhoan(String tentaikhoan) {
        if(tentaikhoan != null){
            this.tentaikhoan = tentaikhoan;
        }
        else{
            this.tentaikhoan = "ten tai khoan loi";
        }
    }
    public void setSotien(double sotien) {
        if(sotien>=50){
            this.sotien = sotien;
        }
        else{
            this.sotien = 0;
        }
    } 
    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
   if(sotaikhoan >0&&sotaikhoan!=0&&tentaikhoan !=null &&sotien>=50){
         this.trangthai = "hop le";
   }  else{
       this.trangthai = "khong hop le";
        }
    }
     
    @Override
    public String toString() {
        return "Account{" + "sotaikhoan=" + sotaikhoan + ", tentaikhoan=" + tentaikhoan + ", sotien=" + sotien + '}';
    }
 
 public void naptienvaotaikhoan(double sotiennapvao){
     double tiennapvao = this.sotien +sotiennapvao;
     System.out.println("So Tien Nap Vao La:"+tiennapvao);
 }
    public void ruttien (double sotienmuonrut){
     double tienrut = this.sotien -sotienmuonrut;
     System.out.println("So Tien Nap Vao La:"+tienrut);
 }
    public void chuyenkhoan(String taikhoanchuyen, String taikhoanmuonchuyen,double sotiencanchuyen){
        double sotientaikhoanchuyen = this.sotien - sotiencanchuyen;
        System.out.println("So tien cua tai khoan"+taikhoanchuyen +"la"+sotientaikhoanchuyen);
        double sotienduochuong = this.sotien + sotiencanchuyen;
        System.out.println("So tien cua tai khoan "+taikhoanmuonchuyen+"la "+sotienduochuong);
    }
    public void daohan(){
        double sodu = this.sotien + this.sotien*laisuat;
        System.out.println("dao han la: "+sodu);
    }
}
