package bai1lap5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quanLyPhongHoc {

    Scanner sc = new Scanner(System.in);

    private ArrayList<phongHocSinhVien> danhsach;

    public quanLyPhongHoc() {
        this.danhsach = new ArrayList<phongHocSinhVien>();
    }

    public quanLyPhongHoc(ArrayList<phongHocSinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    public void themPhongHoc(phongHocSinhVien phsv) {
        this.danhsach.add(phsv);
    }

    public void timKiemPhongHoc(String phong) {
        for (phongHocSinhVien phsv : danhsach) {
            if (phsv.getMaPhong().indexOf(phong) >= 0) {
                System.out.println(phsv);
            }
        }
    }

    public void inDanhSachPhongHoc() {
        for (phongHocSinhVien phsv : danhsach) {
            System.out.println(phsv);
        }
    }
    
    public void xoaMaPhong(){
        System.out.println("==========XOA PHONG HOC============");
        System.out.println("nhap ma phong can xoa: ");
        int maPhongHoc = sc.nextInt();
        
        for(phongHocSinhVien phsv : danhsach){
            if(phsv.getMaPhong().equals(maPhongHoc)){
                danhsach.remove(phsv);
            }
        }
    }
    public void sapXepDanhSachCotDayNha() {
        System.out.println("SAP XEP DANH COT DAY NHA TANG DAN");
        Collections.sort(danhsach, new Comparator<phongHocSinhVien>() {

            @Override
            public int compare(phongHocSinhVien s1, phongHocSinhVien s2) {
                return s1.getDayNha().compareTo(s2.getDayNha());
            }
        });
        inDanhSachPhongHoc();
    }

    public void sapXepDanhSachGiamDanDienTich() {
        System.out.println("SAP XEP DANH SACH GIM DAN THEO DIEN TICH");
        Collections.sort(danhsach, new Comparator<phongHocSinhVien>() {

            @Override
            public int compare(phongHocSinhVien s1, phongHocSinhVien s2) {
                return Double.compare(s2.getDienTich(), s1.getDienTich());
            }
        });
        inDanhSachPhongHoc();
    }

    public void sapXepDanhSachTangDanSoBongDen() {
        System.out.println("SAP XEP DANH SACH TANG DAN SO BONG DEN");
        Collections.sort(danhsach, new Comparator<phongHocSinhVien>() {

            @Override
            public int compare(phongHocSinhVien s1, phongHocSinhVien s2) {
                return Integer.compare(s1.getSoBongDen(), s2.getSoBongDen());
            }
        });

    }

    public void tongDanhSachCacMayTrongPhong() {
        System.out.println("TONG DANH SACH TONG CAS CAC MAY TRONG PHONG");
        this.danhsach.size();
    }

    public void kiemTraSoMayTrongPhong() {

    }
}
