/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.View.TrangChu.TrangChuAdmin;

import com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinHeSoLuong.BaoTriThongTinHeSoLuongUI;
import com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinHocPhan.BaoTriThongTinHocPhanUI;
import com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinNhanVien.BaoTriThongTinNhanVienUI;
import com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinPhongBan.BaoTriThongTinPhongBanUI;
import com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinPhuCap.BaoTriThongTinPhuCapUI;
import com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinTaiKhoan.BaoTriThongTinTaiKhoanUI;
import com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinTienThuong.BaoTriThongTinTienThuongUI;
import com.nguyennhatminh285.quanlyluongthuong.View.QuanLyThongTinCaNhan.QuanLyThongTinCaNhanUI;
import com.nguyennhatminh285.quanlyluongthuong.View.TuyChonUI;
import com.nguyennhatminh285.quanlyluongthuong.View.XemChiTietLuongCaNhan.XemChiTietLuongCaNhanUI;
import com.nguyennhatminh285.quanlyluongthuong.util.IOptionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class TrangChuAdminUI extends javax.swing.JFrame implements ActionListener{
    private HashMap<String, Object> data;
    
    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
    /**
     * Creates new form TrangChuAdminUI
     * @param data
     */
    public TrangChuAdminUI(HashMap<String, Object> data) {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
    }

    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnHeSoLuong = new javax.swing.JButton();
        btnPhuCap = new javax.swing.JButton();
        btnTienThuong = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnChamCong = new javax.swing.JButton();
        btnHocPhan = new javax.swing.JButton();
        btnPhongBan = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnXemChiTietLuongCaNhan = new javax.swing.JButton();
        btnQuanLyThongTinCaNhan = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang Ch??? Qu???n Tr???");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Trang Ch??? Qu???n Tr???");

        btnHeSoLuong.setFont(btnHeSoLuong.getFont().deriveFont(btnHeSoLuong.getFont().getSize()+3f));
        btnHeSoLuong.setText("H??? S??? L????ng");

        btnPhuCap.setFont(btnPhuCap.getFont().deriveFont(btnPhuCap.getFont().getSize()+3f));
        btnPhuCap.setText("Ph??? C???p");

        btnTienThuong.setFont(btnTienThuong.getFont().deriveFont(btnTienThuong.getFont().getSize()+3f));
        btnTienThuong.setText("Ti???n Th?????ng");

        btnNhanVien.setFont(btnNhanVien.getFont().deriveFont(btnNhanVien.getFont().getSize()+3f));
        btnNhanVien.setText("Nh??n Vi??n");

        btnChamCong.setFont(btnChamCong.getFont().deriveFont(btnChamCong.getFont().getSize()+3f));
        btnChamCong.setText("Ch???m C??ng");

        btnHocPhan.setFont(btnHocPhan.getFont().deriveFont(btnHocPhan.getFont().getSize()+3f));
        btnHocPhan.setText("H???c Ph???n");

        btnPhongBan.setFont(btnPhongBan.getFont().deriveFont(btnPhongBan.getFont().getSize()+3f));
        btnPhongBan.setText("Ph??ng Ban");

        btnTaiKhoan.setFont(btnTaiKhoan.getFont().deriveFont(btnTaiKhoan.getFont().getSize()+3f));
        btnTaiKhoan.setText("T??i Kho???n");

        btnThoat.setFont(btnThoat.getFont().deriveFont(btnThoat.getFont().getSize()+3f));
        btnThoat.setText("Tho??t");

        btnDangXuat.setText("????ng Xu???t");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnXemChiTietLuongCaNhan.setFont(btnXemChiTietLuongCaNhan.getFont().deriveFont(btnXemChiTietLuongCaNhan.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan.setText("Xem Chi Ti???t L????ng C?? Nh??n");

        btnQuanLyThongTinCaNhan.setFont(btnQuanLyThongTinCaNhan.getFont().deriveFont(btnQuanLyThongTinCaNhan.getFont().getSize()+3f));
        btnQuanLyThongTinCaNhan.setText("Qu???n L?? Th??ng Tin C?? Nh??n");

        lblUsername.setText("Xin ch??o, Minh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(85, 85, 85)
                                .addComponent(btnDangXuat))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHeSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTienThuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnChamCong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnXemChiTietLuongCaNhan)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuanLyThongTinCaNhan)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblUsername))
                    .addComponent(btnDangXuat))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemChiTietLuongCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangXuatActionPerformed

    public void onStartGUI() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        lblUsername.setText("Xin ch??o," + data.get("TenTaiKhoan"));
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuAdminUI(data).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChamCong;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHeSoLuong;
    private javax.swing.JButton btnHocPhan;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhongBan;
    private javax.swing.JButton btnPhuCap;
    private javax.swing.JButton btnQuanLyThongTinCaNhan;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTienThuong;
    private javax.swing.JButton btnXemChiTietLuongCaNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        
        //Button Xem Chi Tiet Luong Ca Nhan
        if(jButton.equals(btnXemChiTietLuongCaNhan)){
            XemChiTietLuongCaNhanUI xemChiTietLuongCaNhanUI = new XemChiTietLuongCaNhanUI();
            xemChiTietLuongCaNhanUI.setData(data);
            xemChiTietLuongCaNhanUI.onStartGUI();
            dispose();
            return;
        }
        
        //Button Tai Khoan
        if(jButton.equals(btnTaiKhoan)){
            try {
                BaoTriThongTinTaiKhoanUI baoTriThongTinTaiKhoanUI = new BaoTriThongTinTaiKhoanUI();
                baoTriThongTinTaiKhoanUI.setData(data);
                baoTriThongTinTaiKhoanUI.onStartGUI();
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            return;
        }
        
        //Button He So Luong
        if(jButton.equals(btnHeSoLuong)){
            try {
                BaoTriThongTinHeSoLuongUI baoTriThongTinHeSoLuongUI = new BaoTriThongTinHeSoLuongUI();
                baoTriThongTinHeSoLuongUI.setData(data);
                baoTriThongTinHeSoLuongUI.onStartGUI();
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            return;
        }
        
        //Button Hoc Phan
        if(jButton.equals(btnHocPhan)){
            try {
                BaoTriThongTinHocPhanUI baoTriThongTinHocPhanUI = new BaoTriThongTinHocPhanUI();
                baoTriThongTinHocPhanUI.setData(data);
                baoTriThongTinHocPhanUI.onStartGUI();
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            return;
        }
        
        //Button Nhan Vien
        if(jButton.equals(btnNhanVien)){
            try {
               BaoTriThongTinNhanVienUI baoTriThongTinNhanVienUI = new BaoTriThongTinNhanVienUI();
               baoTriThongTinNhanVienUI.setData(data);
               baoTriThongTinNhanVienUI.onStartGUI();
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            return;
        }
        
        //Button Phong Ban
        if(jButton.equals(btnPhongBan)){
            try {
                BaoTriThongTinPhongBanUI baoTriThongTinPhongBanUI = new BaoTriThongTinPhongBanUI();
                baoTriThongTinPhongBanUI.setData(data);
                baoTriThongTinPhongBanUI.onStartGUI();
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            return;
        }
        
        //Button Phu Cap
        if(jButton.equals(btnPhuCap)){
            try {
                BaoTriThongTinPhuCapUI baoTriThongTinPhuCapUI = new BaoTriThongTinPhuCapUI();
                baoTriThongTinPhuCapUI.setData(data);
                baoTriThongTinPhuCapUI.onStartGUI();
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            return;
        }
        
        //Button Cham Cong
        if(jButton.equals(btnChamCong)){
            
        }
        
        //Button Tien Thuong
        if(jButton.equals(btnTienThuong)){
            try {
                BaoTriThongTinTienThuongUI baoTriThongTinTienThuongUI = new BaoTriThongTinTienThuongUI();
                baoTriThongTinTienThuongUI.setData(data);
                baoTriThongTinTienThuongUI.onStartGUI();
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            return;
        }
        
        //Button Xem Chi Tiet Luong Ca Nhan
        if(jButton.equals(btnXemChiTietLuongCaNhan)){
            XemChiTietLuongCaNhanUI xemChiTietLuongCaNhanUI = new XemChiTietLuongCaNhanUI();
            xemChiTietLuongCaNhanUI.setData(data);
            xemChiTietLuongCaNhanUI.onStartGUI();
            dispose();
            return;
        }
        
        //Button Quan Ly Thong Tin Ca Nhan
        if(jButton.equals(btnQuanLyThongTinCaNhan)){
            try {
                QuanLyThongTinCaNhanUI quanLyThongTinCaNhanUI = new QuanLyThongTinCaNhanUI(data);
                quanLyThongTinCaNhanUI.onStartGUI();
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
            return;
        }
        
        //Button Thoat
        if(jButton.equals(btnThoat)){
            TuyChonUI tuyChonUI = new TuyChonUI();
            
            tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
                @Override
                public void onAcceptEvent() {
                    dispose();
                }

                @Override
                public void onCancelEvent() {
                    
                }
            });
            
            tuyChonUI.onCallGUI(this.getContentPane(), "B???n c?? mu???n tho??t ch????ng tr??nh", "Th??ng B??o");
        }
    }
}
