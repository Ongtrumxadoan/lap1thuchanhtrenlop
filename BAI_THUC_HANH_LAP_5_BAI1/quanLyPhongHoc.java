package BAI_THUC_HANH_LAP_5_BAI1.bai1lap5;

import java.util.ArrayList;
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

    public void xoaMaPhong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma can xoa: ");
        String id = sc.nextLine();
        int d = -1;
        boolean vitri = false;
        for (int i = 0; i < danhsach.size(); i++) {
            if (id.equals(danhsach.get(i).getMaPhong())) {
                vitri = true;
                d = i;
                break;
            }
        }

        if (vitri == false) {
            System.out.println("---Khong tim thay san pham nao---");
        } else {
            danhsach.remove(d);
            System.out.println("----Xoa thanh cong---");
        }

    }

    public void CapNhapSoMAyTinhhTheoMaPhong() {
        System.out.println("Nhap ma phong can sua: ");
        String maPhong = sc.nextLine();

        for (phongHocSinhVien phsv : danhsach) {
            if (phsv.getMaPhong().equals(maPhong)) {
                System.out.print("Nhập bong den moi: ");
                int bongDenNew = sc.nextInt();

                sc.nextLine(); // Đọc bỏ ký tự xuống dòng

                phsv.setSoBongDen(bongDenNew);
                System.out.println("Sửa thông tin sinh viên thành công!");
                return;
            } else {
                System.out.println("Không tìm thấy sinh viên với mã " + maPhong);
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

    public int tongDanhSachCacMayTrongPhong() {
        return this.danhsach.size();
    }

    public void kiemTraSoMayTrongPhong() {

    }
}
