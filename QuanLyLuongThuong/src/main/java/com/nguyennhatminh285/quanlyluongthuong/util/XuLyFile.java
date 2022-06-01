package com.nguyennhatminh285.quanlyluongthuong.util;


import com.nguyennhatminh285.quanlyluongthuong.Model.TaiKhoan;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class XuLyFile {
    private static final String DUONG_DAN_FILE = "C:\\saveData.dat";
    
    public static void luuTaiKhoan(TaiKhoan taiKhoan) throws IOException{
        ObjectOutputStream objectOutputStream = null;
        
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(DUONG_DAN_FILE));
            objectOutputStream.writeObject(taiKhoan);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream != null){
                objectOutputStream.close();
            }
        }
    }
    
    public static TaiKhoan layTaiKhoan() throws IOException{
        ObjectInputStream objectInputStream = null;
        
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(DUONG_DAN_FILE));
            return (TaiKhoan) objectInputStream.readObject();
        } catch (Exception e) {
            return null;
        } finally { 
            if(objectInputStream != null){
                objectInputStream.close();
            }
        }
    }
}
