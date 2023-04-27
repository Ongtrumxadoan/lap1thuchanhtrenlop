/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class LopHocPhan {
    public String maLHP;
    public String tenLHP;
    public String tenGV;
    public String thongtinlophoc;
    public SinhVien dsSv;

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongtinlophoc, SinhVien dsSv) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongtinlophoc = thongtinlophoc;
        this.dsSv = dsSv;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongtinlophoc() {
        return thongtinlophoc;
    }

    public void setThongtinlophoc(String thongtinlophoc) {
        this.thongtinlophoc = thongtinlophoc;
    }

    public SinhVien getDsSv() {
        return dsSv;
    }

    public void setDsSv(SinhVien dsSv) {
        this.dsSv = dsSv;
    }
    public int getsoluongSv(){
        return 0;
    }

    @Override
    public String toString() {
        return "LopHocPhan{" + "\n"+"maLHP=" + maLHP +"\n"+ ", tenLHP=" + tenLHP + "\n"+", tenGV=" + tenGV +"\n"+ ", thongtinlophoc=" + thongtinlophoc +"\n"+ ", dsSv=" + dsSv + '}';
    }
    
}
