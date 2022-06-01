/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBCalculateUtil {
    public static int countRow(ResultSet resultSet) throws SQLException{
        int size = 0;
        
        while (resultSet.next()) {
            size++;
        }
        
        return size;
    }
}
