package bai1lap4;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {

    public static void main(String[] args) {
        DateTimeFormatter dtfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        quanLyDanhSachNhaDat qld = new giaoDichDat(0001, LocalDate.parse("23/05/2023", dtfmt), 20000, 300000, "A");
        System.out.println(qld.toString());
        qld.loaiDatA();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        quanLyDanhSachNhaDat qld1 = new giaoDichDat(0002, LocalDate.parse("23/05/2023", dtfmt), 30000, 10000, "B");
        System.out.println(qld1.toString());
        qld1.loaiDatBandC();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        quanLyDanhSachNhaDat gdd = new giaoDichNha(3, LocalDate.parse("23/05/2023",dtfmt), 20000, 120000,"Ho Chi Minh","Cao Cap");
        System.out.println(gdd.toString());
        gdd.loaiNhaCaoCap();
    }

}
