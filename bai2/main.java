/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Admin
 */
public class main {

 
     public static void main(String[] args) {
         SinhVien[] sv = {new SinhVien("123", "nguyen van a "),
                          new SinhVien("456", "le thi b"),
                          new SinhVien("321", "luong van c")
                                    };
         LopHocPhan lhp = new LopHocPhan("123456", "LT huong doi tuong", "nguyen van a", "thu 7, tiet 4-6,phong a1.1",sv);
        System.out.println(lhp);
                

    }
}
