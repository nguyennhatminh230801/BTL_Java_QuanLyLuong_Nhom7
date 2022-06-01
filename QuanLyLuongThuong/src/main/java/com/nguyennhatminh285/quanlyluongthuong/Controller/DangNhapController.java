/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.Controller;

import com.nguyennhatminh285.quanlyluongthuong.Model.TaiKhoan;
import com.nguyennhatminh285.quanlyluongthuong.View.TrangChu.TrangChuAdmin.TrangChuAdminUI;
import com.nguyennhatminh285.quanlyluongthuong.util.KetNoiCSDL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Admin
 */
public class DangNhapController {
    private static final String findExistUser = "select count(*) from TAIKHOAN where taikhoan = ? " 
    + "and matkhau = ?";
    
    private static final String quyenNguoiDung = "select quyen from taikhoan where taikhoan = ? and matkhau = ?";
    public static String onLoginEvent(TaiKhoan taiKhoan){
        try{
            Connection connection = KetNoiCSDL.getConnection();
            
            //Xử lý tìm tài khoản tồn tại
            PreparedStatement preparedStatement = connection.prepareStatement(findExistUser);
            preparedStatement.setString(1, taiKhoan.getTaiKhoan());
            preparedStatement.setString(2, taiKhoan.getMatKhau());
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();//Chuyển con trỏ về bản ghi đầu
            int countRow = resultSet.getInt(1);
            
            if(countRow != 1){
                throw new Exception("Tài Khoản Không Tồn Tại");
            }
            
            //Mở giao diện các theo quyền
            PreparedStatement preparedStatement1 = connection.prepareStatement(quyenNguoiDung); 
            preparedStatement1.setString(1, taiKhoan.getTaiKhoan());
            preparedStatement1.setString(2, taiKhoan.getMatKhau());
            
            ResultSet resultSet1 = preparedStatement1.executeQuery();
            resultSet1.next();
            
            int quyen = resultSet1.getInt(1);
            
            switch(quyen){
                case 0:
                    new TrangChuAdminUI().onStartGUI();
                    break;
            }
            
            return "Đăng Nhập Thành Công";
        }catch(Exception ex){
            return ex.toString();
        }
    }
}
