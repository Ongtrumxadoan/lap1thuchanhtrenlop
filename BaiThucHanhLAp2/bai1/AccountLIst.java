package bai1;
  import java.util.Scanner;
import java.util.ArrayList;
public class AccountLIst  {
    
    public ArrayList <Account> acc;
    public int count;
    public AccountLIst(){
      acc = new ArrayList<Account>(10);
      count = 0;
    }
    
    public AccountLIst(int n){
        if(n>0){
            acc = new ArrayList<Account>(n);
        }
        else{
            acc = new ArrayList<Account>(10);
            count = 0;
        }
    }
    
    
    public void ThemTk(Account a){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong can them: ");
        int n = sc.nextInt();
        for(int i=0 ; i<=n ;i++){
            System.out.println("lan nhap thu "+i);
            a= new Account();
            Scanner b = new Scanner(System.in);
            System.out.println("nhap so tai khoan ");
            long soTk = b.nextLong();
            a.setSotaikhoan(soTk);
            b.nextLine();
            System.out.println("nhap ten tai khoan: ");
            String tenTK = b.nextLine();
            a.setTentaikhoan(tenTK);
            System.out.println("nhap so tien: ");
            double sotien = b.nextDouble();
            a.setSotien(sotien);
            acc.add(a);
        }
    }
    
    public void TimTK(long soTK){
        for(int i =0;i<=0 ; i++){
            if(acc.get(i).getSotaikhoan() == soTK){
                System.out.println(acc.get(i).toString());
            }
        }
    }
    
    
    
    
    public void xoaTK(long soTK){
        System.out.println("nhap so tai khoan can xoa: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i= 0;i<count;i++){
            if(acc.get(i).getSotaikhoan() == soTK){
                acc.remove(i);
                count--;
                System.out.println("Da xoa thanh cong");
            }
        }
    }
    
    public int DemTK(){
    return acc.size();
}
    public void inTK(){
        for(Account a  :acc){
        System.out.println(a.toString());
    }
    }
    
    public void naptien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tai khoan can nap tien: ");
        long soTK = sc.nextLong();
        System.out.println("Nhap so tien can nap: ");
        double soTien = 0;
        do{
            soTien = sc.nextDouble();
            if(soTien <=0){
                System.out.println("so tien khong hop le, vui long nhap lai");
            }
        }while(soTien <= 0);
        for(int i=0; i<acc.size();i++){
            Account a = acc.get(i);
            if(a.getSotaikhoan() == soTK){
                a.setSotien(a.getSotien()+ soTien);
                System.out.println("Da nap thanh cong");
            }
            else if(a.getSotaikhoan() != soTK){
                System.out.println("khong tim thay so tai khoan nay");
            }
        }
    }
    public void ruttien(){
        Scanner c = new Scanner(System.in);
         System.out.println("nhap so tai khoan can rut tien: ");
        long soTK = c.nextLong();
        System.out.println("Nhap so tien can rut: ");
        double soTien = 0;
        do{
            soTien = c.nextDouble();
            if(soTien <=0){
                System.out.println("so tien khong hop le, vui long nhap lai");
            }
        }while(soTien <= 0);
        for(int i=0; i<acc.size();i++){
            Account a = acc.get(i);
            if(a.getSotaikhoan() == soTK){
                a.setSotien(a.getSotien()- soTien);
                System.out.println("Da nap thanh cong");
            }
            else if(a.getSotaikhoan() != soTK){
                System.out.println("khong tim thay so tai khoan nay");
            }
    }
}
    public void chuyentien(){
        
        Scanner c = new Scanner(System.in);
         System.out.println("nhap so tai khoan can chuyen tien: ");
        long soTK = c.nextLong();
        System.out.println("Nhap so tien can chuyen: ");
        double soTien = 0;
        do{
            soTien = c.nextDouble();
            if(soTien <=0){
                System.out.println("so tien khong hop le, vui long nhap lai");
            }
        }while(soTien <= 0);
        for(int i=0; i<acc.size();i++){
            Account a = acc.get(i);
            if(a.getSotaikhoan() == soTK){
                
            if(a.getSotien() >= soTien){
                 a.setSotien(a.getSotien()- soTien);
                System.out.println("Da chuyen thanh cong");
            }
      }
        }
        for(int i =0; i<acc.size();i++){
            Account a = acc.get(i);
            if(a.getSotaikhoan() == soTK){
                a.setSotien(a.getSotien() +soTien);
                return;
            }
            else if(a.getSotaikhoan() != soTK){
                System.out.println("khong tim thay STK nay");
            }
        }
    }
    public void menu(){
        System.out.println("""
                           
                           ---------------QUAN LI TAI KHOAN-------------------
                           1.them tai khoan
                           2.so tai khoan hien co
                           3.in thong tin tai khoan
                           4.nap tien vao tai khoan
                           5.rut tien tai khoan
                           6.chuyen tien
                           7.thoat""");
    }
    
    
    
}
               
             
    
    
    
    
    
    

