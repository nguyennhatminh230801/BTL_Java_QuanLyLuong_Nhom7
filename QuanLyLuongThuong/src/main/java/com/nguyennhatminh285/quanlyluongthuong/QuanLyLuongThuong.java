/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.nguyennhatminh285.quanlyluongthuong;

import com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinHeSoLuong.BaoTriThongTinHeSoLuongUI;
import com.nguyennhatminh285.quanlyluongthuong.View.DangNhap.DangNhapUI;
import com.nguyennhatminh285.quanlyluongthuong.View.XemThongTinCaNhan.XemThongTinCaNhanUI;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class QuanLyLuongThuong {

    public static void main(String[] args) throws IOException {
        //new DangNhapUI().onStartGUI();
        new BaoTriThongTinHeSoLuongUI().onStartGUI();
    }
}
