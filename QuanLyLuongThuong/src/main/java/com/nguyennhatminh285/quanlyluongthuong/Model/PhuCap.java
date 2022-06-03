/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.Model;

/**
 *
 * @author Admin
 */
public class PhuCap {
    private String tenPhuCap;
    private long tienPhuCap;

    public PhuCap() {
    }

    public PhuCap(String tenPhuCap, long tienPhuCap) {
        this.tenPhuCap = tenPhuCap;
        this.tienPhuCap = tienPhuCap;
    }

    public String getTenPhuCap() {
        return tenPhuCap;
    }

    public void setTenPhuCap(String tenPhuCap) {
        this.tenPhuCap = tenPhuCap;
    }

    public long getTienPhuCap() {
        return tienPhuCap;
    }

    public void setTienPhuCap(long tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }
    
    
}
