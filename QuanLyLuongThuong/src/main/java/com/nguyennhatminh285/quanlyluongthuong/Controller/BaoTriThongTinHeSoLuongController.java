/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.Controller;

import com.nguyennhatminh285.quanlyluongthuong.Model.HeSoLuong;
import com.nguyennhatminh285.quanlyluongthuong.util.IUpdateTableEvent;
import com.nguyennhatminh285.quanlyluongthuong.util.KetNoiCSDL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BaoTriThongTinHeSoLuongController {
    private static IUpdateTableEvent iUpdateTableEvent;
    private static final String SELECT_ALL_HESOLUONG = "select * from HeSoLuong";
    private static final String INSERT_HESOLUONG = "insert into HeSoLuong(TenHeSoLuong, HeSoLuong) values(?, ?);";
    private static final String UPDATE_HESOLUONG = "update HeSoLuong set TenHeSoLuong = ?, HeSoLuong = ? "
            + "where MaHeSoLuong = ?";
    private static final String DELETE_HESOLUONG = "delete from HeSoLuong where MaHeSoLuong = ?";
    public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    
    public ArrayList<HeSoLuong> onQueryAllHeSoLuong(){
        try {
            Connection connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_HESOLUONG);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<HeSoLuong> answer= new ArrayList<>();
            
            while(resultSet.next()){
                HeSoLuong heSoLuong = new HeSoLuong(
                     resultSet.getLong(1),
                     resultSet.getString(2),
                     resultSet.getFloat(3)
                );
                answer.add(heSoLuong);
            }
        
            return answer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }
    
    public void addHeSoLuong(HeSoLuong heSoLuong){
        try {
            Connection connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_HESOLUONG);
            preparedStatement.setString(1, heSoLuong.getTenHeSoLuong());
            preparedStatement.setFloat(2, heSoLuong.getHeSoLuong());
            int answer = preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public void modifyHeSoLuongByID(String tenHeSoLuong, float heSoLuong, long ID){
        try {
            Connection connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_HESOLUONG);
            preparedStatement.setString(1, tenHeSoLuong);
            preparedStatement.setFloat(2, heSoLuong);
            preparedStatement.setLong(3, ID);
            
            int answer = preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteHeSoLuongByID(long ID){
        try {
            Connection connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_HESOLUONG);
            preparedStatement.setLong(1, ID);
            int answer = preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
