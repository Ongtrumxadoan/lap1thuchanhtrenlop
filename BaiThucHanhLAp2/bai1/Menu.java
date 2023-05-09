
package bai1;
 
import java.util.Scanner;

public class Menu {
    public static void main(String[] args ){
        AccountLIst a = new AccountLIst();
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        int luachon = 0 ;
        do{
            a.menu();
            System.out.println("Nhap lua chon cua ban: ");
            luachon = sc.nextInt();
            if (luachon == 1){
                a.ThemTk(ac);
            }
            if (luachon == 2 ){
                System.out.printf("So tai khoan hien co: " + a.DemTK());
                
            }
            if ( luachon == 3){
                a.inTK();
            }
            if (luachon == 4){
               a.naptien();
            }
            if (luachon == 5){
                a.ruttien();
            }
            if (luachon == 6){
               a.chuyentien();
            }
        } while (luachon != 0);
        

    }
}

