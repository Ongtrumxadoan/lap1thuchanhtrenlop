package BAI_THUC_HANH_LAP_5_BAI1.bai1lap5;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        quanLyPhongHoc qlph = new quanLyPhongHoc();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("------------MENU--------------");
            System.out.println("1. THEM DANH SACH PHONG HOC LY THUYET");
            System.out.println("2. THEM DANH SACH PHONG HOC MAY TINH");
            System.out.println("3. THEM DANH SACH PHONG HOC THY NGHIEM");
            System.out.println("4. IN DANH SACH CAC PHONG HOC");
            System.out.println("5. IN DANH SACH CAC PHONG HOC DAT CHUAN");
            System.out.println("6. SAP XEP DANH SACH TANG DAN THEO DAY NHA");
            System.out.println("7. SAP XEP DANH SACH GIAM DAN THEO DIEN TICH");
            System.out.println("8. SAP XEP DANH SACH TANG DAN THEO SO BONG DEN");
            System.out.println("9. CAP NHAT SO MAY TINH");
            System.out.println("10. XOA MOT PHONG HOC");
            System.out.println("11. IN RA TONG SO PHONG HOC");
            System.out.println("12. IN DANH SACH PHONG MAY CO 60 MAY");
            System.out.println("0. Thoat Chuong Trinh ");
            System.out.println("VUI LONG CHON CHUA NANG");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhap ma phong ly thuyet: ");
                    String maPhongHOcLT = sc.nextLine();
                    System.out.println("Nhap day nha ly thuyet: ");
                    String maDayNhaa = sc.nextLine();
                    System.out.println("Nhap dien tich phong: ");
                    double dienTichPhongg = sc.nextDouble();
                    System.out.println("Nhap so bong den: ");
                    int soBongDenn = sc.nextInt();
                    System.out.println("kiem tra co phong hoc co may chieu khong: ");
                    String ktramayChieu = sc.next();
                    phongHocSinhVien phlt = new phongHocLyThuyet(maPhongHOcLT, maDayNhaa, dienTichPhongg, soBongDenn, ktramayChieu);
                    qlph.themPhongHoc(phlt);

                    break;
                case 2:
                    System.out.println("Nhap ma phong ly thuyet: ");
                    String maPhongHOcLT1 = sc.nextLine();
                    System.out.println("Nhap day nha ly thuyet: ");
                    String maDayNhaa1 = sc.nextLine();
                    System.out.println("Nhap dien tich phong: ");
                    double dienTichPhongg1 = sc.nextDouble();
                    System.out.println("Nhap so bong den: ");
                    int soBongDenn1 = sc.nextInt();
                    System.out.println("nhap so may tinh: ");
                    int somaytinh = sc.nextInt();
                    phongHocSinhVien phsv1 = new phongMayTinh(somaytinh, maPhongHOcLT1, maDayNhaa1, dienTichPhongg1, soBongDenn1);
                    qlph.themPhongHoc(phsv1);
                    break;

                case 3:
                    System.out.println("Nhap ma phong ly thuyet: ");
                    String maPhongHOcLT11 = sc.nextLine();
                    System.out.println("Nhap day nha ly thuyet: ");
                    String maDayNhaa11 = sc.nextLine();
                    System.out.println("Nhap dien tich phong: ");
                    double dienTichPhongg11 = sc.nextDouble();
                    System.out.println("Nhap so bong den: ");
                    int soBongDenn11 = sc.nextInt();
                    System.out.println("thong tin chuyen nganh la: ");
                    String thongTinChuyenNganh1 = sc.nextLine();
                    sc.next();
                    System.out.println("bon rua: ");
                    String bonRua1 = sc.next();
                    System.out.println("suc chua la:");
                    int sucChua1 = sc.nextInt();

                    phongHocSinhVien phsv2 = new phongThiNghiem(thongTinChuyenNganh1, sucChua1, bonRua1, maPhongHOcLT11, maDayNhaa11, dienTichPhongg11, soBongDenn11);
                    qlph.themPhongHoc(phsv2);

                    break;
                case 4:
                    qlph.inDanhSachPhongHoc();
                    break;
                case 5:
                    qlph.inDanhSachPhongHoc();
                    break;
                case 6:
                    qlph.sapXepDanhSachCotDayNha();
                    break;
                case 7:
                    qlph.sapXepDanhSachGiamDanDienTich();
                    break;
                case 8:
                    qlph.sapXepDanhSachTangDanSoBongDen();
                    break;
                case 9:
                    qlph.CapNhapSoMAyTinhhTheoMaPhong();
                    break;
                case 10:
                    qlph.xoaMaPhong();
                    break;
                case 11:
                    System.out.println("TONG DANH SACH TONG CAS CAC MAY TRONG PHONG: "+qlph.tongDanhSachCacMayTrongPhong());
                     
                case 12:

                default:
                    System.out.println("vui long chon lai");
            }
        } while (choice != 0);

    }
}
