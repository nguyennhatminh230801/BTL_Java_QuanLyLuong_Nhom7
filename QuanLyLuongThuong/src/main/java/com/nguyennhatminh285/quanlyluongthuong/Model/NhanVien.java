/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.Model;

/**
 *
 * @author Admin
 */
public class NhanVien extends BaseModel{
    private long maNhanVien;
    private String tenNhanVien;
    private int gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String chucVu;
    private String trinhDo;
    private String tenTaiKhoan;
    private String tenPhongBan;
    private int heSoLuong;
    
    public NhanVien() {
    }

    public NhanVien(String tenNhanVien, int gioiTinh, String ngaySinh, String diaChi, String chucVu, String trinhDo) {
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.trinhDo = trinhDo;
    }

    public NhanVien(long maNhanVien, String tenNhanVien, int gioiTinh, String ngaySinh, String diaChi, String chucVu, String trinhDo) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.trinhDo = trinhDo;
    }
    
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public long getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(long maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[10];
        answer[0] = maNhanVien;
        answer[1] = tenNhanVien;
        answer[2] = (gioiTinh == 0) ? "Nam" : "Nữ";
        answer[3] = ngaySinh;
        answer[4] = diaChi;
        answer[5] = chucVu;
        answer[6] = trinhDo;
        answer[7] = tenTaiKhoan;
        answer[8] = heSoLuong;
        answer[9] = tenPhongBan;
        return answer;
    }
}
