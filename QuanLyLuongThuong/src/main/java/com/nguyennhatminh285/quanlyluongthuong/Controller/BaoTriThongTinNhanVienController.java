/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.Controller;

import com.nguyennhatminh285.quanlyluongthuong.Model.NhanVien;
import com.nguyennhatminh285.quanlyluongthuong.util.KetNoiCSDL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BaoTriThongTinNhanVienController {
    private static final String SELECT_ALL_NHANVIEN = "select * from NhanVien";
    private static final String SELECT_ALL_PHONGBAN = "select * from PhongBan";
    
    private static final String INSERT_NEW_NHANVIEN = "insert into NHANVIEN(TENNHANVIEN, GIOITINH, NGAYSINH, DIACHI, CHUCVU, TRINHDO) values(?, ?, ?, ?, ?, ?)";
    public ArrayList<NhanVien> onQueryAllNhanVien() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_NHANVIEN);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<NhanVien> answer = new ArrayList<>();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNhanVien(resultSet.getLong(1));
                nhanVien.setTenNhanVien(resultSet.getString(2));
                nhanVien.setGioiTinh(resultSet.getInt(3));
                nhanVien.setNgaySinh(resultSet.getString(4));
                nhanVien.setDiaChi(resultSet.getString(5));
                nhanVien.setChucVu(resultSet.getString(6));
                nhanVien.setTrinhDo(resultSet.getString(7));
                answer.add(nhanVien);
            }
            
            return answer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void addNhanVien(NhanVien nhanVien) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_NHANVIEN);
            preparedStatement.setString(1, nhanVien.getTenNhanVien());
            preparedStatement.setInt(2, nhanVien.getGioiTinh());
            preparedStatement.setString(3, nhanVien.getNgaySinh());
            preparedStatement.setString(4, nhanVien.getDiaChi());
            preparedStatement.setString(5, nhanVien.getChucVu());
            preparedStatement.setString(6, nhanVien.getTrinhDo());
            preparedStatement.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void modifyNhanVienByID(int ID){
    
    }
    
    public void deleteNhanVienByID(int ID){
    
    }
}
