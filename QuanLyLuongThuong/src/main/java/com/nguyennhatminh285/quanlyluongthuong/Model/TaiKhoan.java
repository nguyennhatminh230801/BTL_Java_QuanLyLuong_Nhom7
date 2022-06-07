/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.Model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class TaiKhoan extends BaseModel implements Serializable{
    private String taiKhoan;
    private String matKhau;
    private int quyen;

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public TaiKhoan() {
    }

    public TaiKhoan(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }
    
    
    public TaiKhoan(String taiKhoan, String matKhau, int quyen) {
        this(taiKhoan, matKhau);
        this.quyen = quyen;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[3];
        answer[0] = taiKhoan;
        answer[1] = matKhau;
        answer[2] = quyen;
        return answer;
    }
    
    
}
