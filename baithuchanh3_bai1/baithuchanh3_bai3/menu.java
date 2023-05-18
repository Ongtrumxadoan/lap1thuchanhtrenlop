/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3_bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class menu {

 public void TT(){
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choice;
        Scanner sc = new Scanner(System.in);
         

        do {
            System.out.println("--------------Menu---------------");
        System.out.println("1.Them Sinh Vien Vao Danh Sach" + "\n"
                + "2.Lay Danh Sach Sinh Vien" + "\n"
                + "3.Xoa Sinh Vien" + "\n"
                + "4.Sua Thong Tin Sinh Vien" + "\n"
                + "5.Tim Kiem Thong Tin Sinh Vien" + "\n"
                + "6.Sap Xep Thong Tin Sinh Vien" + "\n"
                + "0.Thoat Khoi Chuong Trinh");

        System.out.print("Vui long chon chuc nang ");
        choice = sc.nextInt();
        sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Nhap ma sinh Vien: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhap Ho Ten sinh Vien: ");
                    String hoTenSinhVien = sc.nextLine();
                    System.out.println("Nhap Nam Sinh Sinh Vien: ");
                    int namSinhSinhVien = sc.nextInt();
                    SinhVien sv = new SinhVien(maSinhVien, hoTenSinhVien, namSinhSinhVien);
                    dssv.themSinhVien(sv);
                    break;
                }
                case 2:
                    System.out.println("In ra danh sach");
                    dssv.layDanhSachSinhVien();
                    break;
                case 3: {
                     
                    dssv.xoaSinhVien();
                    System.out.println("Da xoa thanh cong");
                    break;
                }
                case 4: {
                    
                    dssv.suaThongTinSinhVien();
                    break;
                }
                case 5:{ 
                    System.out.println("Nhap ten sinh vien can tim: ");
                    String hoTenSinhVien = sc.nextLine();
                    dssv.timSinhVien(hoTenSinhVien);
                    break;
                }
                case 6:{
                    dssv.sapXepSinhVienTheoMa();
                    break;
                }
                case 0:{
                    System.out.println("Chuong trinh ket thuc");
                }
                    default:
                    System.out.println("Lua chon khong hoop thu lai");
                    break;
            }
        }while (choice != 0);

    }
}



