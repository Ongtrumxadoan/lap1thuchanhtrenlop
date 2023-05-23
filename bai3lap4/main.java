/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lap4;

 
public class main {
    public static void main(String[] args) {
        DiemHocVien dhv = new DiemHocVien("vu trong phuong", 2003, 7, 3, 6, 7, 8);
        System.out.println(dhv.toString());
        dhv.diemTrungBinh();
        dhv.dieuKienLamLuanVan();
        dhv.dieuKienThiLai();
        dhv.dieuKienThiTotNghiep();
    }
}
