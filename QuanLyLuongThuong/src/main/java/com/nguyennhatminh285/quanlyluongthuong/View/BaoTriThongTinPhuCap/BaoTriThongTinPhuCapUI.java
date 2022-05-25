/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nguyennhatminh285.quanlyluongthuong.View.BaoTriThongTinPhuCap;

/**
 *
 * @author Admin
 */
public class BaoTriThongTinPhuCapUI extends javax.swing.JFrame {

    /**
     * Creates new form BaoTriThongTinPhuCapUI
     */
    public BaoTriThongTinPhuCapUI() {
        initComponents();
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
        btnThemPhuCap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhuCap = new javax.swing.JTable();
        btnXoaPhuCap = new javax.swing.JButton();
        btnSuaPhuCap = new javax.swing.JButton();
        btnXoaThongTin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaPhuCap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenPhuCap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTienPhuCap = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bảo Trì Thông Tin Phụ Cấp");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Bảo trì thông tin Phụ Cấp");

        btnThemPhuCap.setFont(btnThemPhuCap.getFont().deriveFont(btnThemPhuCap.getFont().getSize()+3f));
        btnThemPhuCap.setText("Thêm Phụ Cấp");

        tblPhuCap.setFont(tblPhuCap.getFont().deriveFont(tblPhuCap.getFont().getSize()+3f));
        tblPhuCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Phụ Cấp", "Tên Phụ Cấp", "Tiền Phụ Cấp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPhuCap.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblPhuCap);
        tblPhuCap.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnXoaPhuCap.setFont(btnXoaPhuCap.getFont().deriveFont(btnXoaPhuCap.getFont().getSize()+3f));
        btnXoaPhuCap.setText("Xóa Phụ Cấp");

        btnSuaPhuCap.setFont(btnSuaPhuCap.getFont().deriveFont(btnSuaPhuCap.getFont().getSize()+3f));
        btnSuaPhuCap.setText("Sửa Phụ Cấp");

        btnXoaThongTin.setFont(btnXoaThongTin.getFont().deriveFont(btnXoaThongTin.getFont().getSize()+3f));
        btnXoaThongTin.setText("Xóa Thông Tin");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("Mã Phụ Cấp:");

        txtMaPhuCap.setFont(txtMaPhuCap.getFont().deriveFont(txtMaPhuCap.getFont().getSize()+3f));
        txtMaPhuCap.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaPhuCap.setEnabled(false);

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+3f));
        jLabel3.setText("Tên Phụ Cấp:");

        txtTenPhuCap.setFont(txtTenPhuCap.getFont().deriveFont(txtTenPhuCap.getFont().getSize()+3f));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+3f));
        jLabel4.setText("Tiền Phụ Cấp:");

        txtTienPhuCap.setFont(txtTienPhuCap.getFont().deriveFont(txtTienPhuCap.getFont().getSize()+3f));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnThemPhuCap)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaPhuCap)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaPhuCap)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaThongTin)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(83, 83, 83)
                                .addComponent(txtTienPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(243, 243, 243))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTienPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaPhuCap)
                    .addComponent(btnThemPhuCap)
                    .addComponent(btnSuaPhuCap)
                    .addComponent(btnXoaThongTin))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaoTriThongTinPhuCapUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaPhuCap;
    private javax.swing.JButton btnThemPhuCap;
    private javax.swing.JButton btnXoaPhuCap;
    private javax.swing.JButton btnXoaThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhuCap;
    private javax.swing.JTextField txtMaPhuCap;
    private javax.swing.JTextField txtTenPhuCap;
    private javax.swing.JTextField txtTienPhuCap;
    // End of variables declaration//GEN-END:variables
}