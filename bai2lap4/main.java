/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lap4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {

        DateTimeFormatter dtfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        danhSachHoaDonTienDienKhachHang dshdtd = new khachHangVietNam(1050080071, "Vu trong phuong", LocalDate.parse("23/05/2023", dtfmt), 300, 3800, "SinhHoat", 700);
        System.out.println("thong tin khach hang" + dshdtd.toString());
        dshdtd.thanhTienHoaDonTienDienVietNam();
        
        
        System.out.println("--------------------------------------------------------------------------------------");
        danhSachHoaDonTienDienKhachHang dshdtd1 = new khachHangNuocNgoai(1050080071, "Hoang Van Thai", LocalDate.parse("23/05/2023",dtfmt), 200, 3800, "italya");
        System.out.println("thanh tien dien la: "+dshdtd1.toString());
        dshdtd1.thanhTienHoaDonTienDienNuocNgoai();
    }
}
