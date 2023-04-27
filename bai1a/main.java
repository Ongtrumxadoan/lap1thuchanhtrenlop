/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1a;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String [] args){
        System.out.println("=================================thong tin dang ki xe==========================================");
        System.out.println("===============================================================================================");
        System.out.println("""
                           ten chu xe: \t            loai xe:\t      dung tich: \t   tri gia:\t     thue phai nop 
                           """);
        Vehicle vh  = new Vehicle   ("Nguyen Thu Loan  ", "Future neo   ",  100  ,        35000000);
        Vehicle vh1 = new Vehicle   ("Le Minh Tinh     ", "Ford Ranger ",3000,250000000);
        Vehicle vh2 = new Vehicle   ("Nguyen Minh Triet","Lanscape    ",1500,1000000000);
        System.out.println(vh );
        System.out.println( vh1);
        System.out.println( vh2);

    }
}
