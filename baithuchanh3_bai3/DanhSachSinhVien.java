/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3_bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSachSinhVien {

    Scanner sc = new Scanner(System.in);

    private ArrayList<SinhVien> danhsach;

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    public void themSinhVien(SinhVien sv) {
        this.danhsach.add(sv);
    }

    public void layDanhSachSinhVien() {
        for (SinhVien sinhvien : danhsach) {
            System.out.println(sinhvien);
        }
    }

    public void xoaSinhVien() {
        System.out.println("===== XOA SINH VIÊN =====");
        System.out.print("Nhap ma sinh vien can xoa: ");
        String maSinhVien = sc.nextLine();

        // Tìm sinh viên theo mã và xóa
        for (SinhVien sv : danhsach) {
            if (sv.getMaSinhVien().equals(maSinhVien)) {
                danhsach.remove(sv);
                return;
            }
        }

        System.out.println("Không tìm thấy sinh viên với mã " + maSinhVien);
    }

    public void timSinhVien(String ten) {
        for (SinhVien sv : danhsach) {
            if (sv.getHoTenSinhVien().indexOf(ten) >= 0) {
                System.out.println(sv);
            }
        }
    }

    public void suaThongTinSinhVien() {
        System.out.println("Nhap ma sinh vien can sua: ");
        String maSinhVien = sc.nextLine();

        for (SinhVien sv : danhsach) {
            if (sv.getMaSinhVien().equals(maSinhVien)) {
                System.out.print("Nhập họ tên mới: ");
                String name = sc.nextLine();
                System.out.print("Nhập năm sinh mới: ");
                int birthYear = sc.nextInt();
                sc.nextLine(); // Đọc bỏ ký tự xuống dòng

                sv.setHoTenSinhVien(name);
                sv.setNamSinhSinhVien(birthYear);
                System.out.println("Sửa thông tin sinh viên thành công!");
                return;
            } else {
                System.out.println("Không tìm thấy sinh viên với mã " + maSinhVien);
            }

        }
    }

    public void sapXepSinhVienTheoMa() {
        System.out.println("===== SAP XEP SINH VIEN THEO MA TANG DAN =====");
        Collections.sort(danhsach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien s1, SinhVien s2) {
                return s1.getMaSinhVien().compareTo(s2.getMaSinhVien());
            
            }
        });
        layDanhSachSinhVien();
    }
}
