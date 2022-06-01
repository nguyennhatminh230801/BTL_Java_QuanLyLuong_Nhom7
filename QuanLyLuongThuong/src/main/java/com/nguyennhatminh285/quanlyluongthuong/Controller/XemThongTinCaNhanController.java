/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.Controller;

import com.nguyennhatminh285.quanlyluongthuong.Model.NhanVien;
import com.nguyennhatminh285.quanlyluongthuong.util.KetNoiCSDL;
import com.nguyennhatminh285.quanlyluongthuong.util.XuLyFile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class XemThongTinCaNhanController {
    private static final String GET_USER_INFO = "select TenNhanVien, GioiTinh, NgaySinh,"
    + " DiaChi, ChucVu, TrinhDo from NhanVien" +
    "where MaTaiKhoan = ?";
    
    public static NhanVien onCallUserData(){
        try {
            Connection connection = KetNoiCSDL.getConnection();
           
            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_INFO);
            preparedStatement.setInt(1, XuLyFile.layIDTaiKhoan());
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            
            NhanVien nhanVien = new NhanVien(
                    resultSet.getString("TenNhanVien"),
                    resultSet.getInt("GioiTinh"),
                    resultSet.getString("NgaySinh"),
                    resultSet.getString("DiaChi"),
                    resultSet.getString("ChucVu"),
                    resultSet.getString("TrinhDo")
            );
            
            return nhanVien;
        } 
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
