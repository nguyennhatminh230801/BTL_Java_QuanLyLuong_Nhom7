/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.util;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class KetNoiCSDL {
    private static final String SERVER = "DESKTOP-GNLFKS4\\SQLEXPRESS";
    private static final String DATABASE = "QuanLyLuongThuong";
    private static final String PORT = "1433";
    
    private static final String URL = "jdbc:sqlserver://" + SERVER
            + ":" + PORT + ";"
            + "databasename=" + DATABASE + ";"
            + "integratedsecurity=true";
    
    public static Connection getConnection() {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            DriverManager.registerDriver(new SQLServerDriver());
            System.out.println("Ket noi CSDL thanh cong");
            return DriverManager.getConnection(URL);
        }
        catch(Exception e){
            System.out.println("Ket noi CSDL that bai");
            
        }
        
        return null;
    }
}
