/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapmysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Son tit
 */
public class KhachHangForm extends javax.swing.JFrame {

    /**
     * Creates new form KhachHangForm
     */
    public KhachHangForm() {
        initComponents();
        hienthi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableKH = new javax.swing.JTable();
        btnHienThi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        txtDC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ma KH", "Ten KH", "So DT", "Dia Chi"
            }
        ));
        tableKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableKHMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tableKH);

        btnHienThi.setText("Hiển Thị");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã KH");

        jLabel2.setText("Tên KH");

        jLabel3.setText("Số DT");

        jLabel4.setText("Địa Chỉ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCapNhat)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHienThi)
                    .addComponent(btnThem)
                    .addComponent(jLabel1)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel2)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed
        // TODO add your handling code here:
        // get model table;
        hienthi();

    }//GEN-LAST:event_btnHienThiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String makh = txtMaKH.getText().trim();
        String tenkh = txtTenKH.getText().trim();
        String sdt = txtSoDT.getText().trim();
        String dc = txtDC.getText().trim();
        if (makh.equals("") || tenkh.equals("") || sdt.equals("") || dc.equals("")) {
            JOptionPane.showMessageDialog(rootPane, " Ko dc bỏ trống");
        } else {
            String sqlAdd = "insert into khachhang(makh,tenkh,sdt,dc) values(" + makh + ",'" + tenkh + "','" + sdt + "','" + dc + "')";
            int status = Connect.getInstance().updateData(sqlAdd);
            if (status == 1) {
                JOptionPane.showMessageDialog(rootPane, " Thêm Thành Công!");
                hienthi();
            } else {
                JOptionPane.showMessageDialog(rootPane, " Thêm không Thành Công!");
            }
            clearForm();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        String makh = txtMaKH.getText().trim();
        String tenkh = txtTenKH.getText().trim();
        String sdt = txtSoDT.getText().trim();
        String dc = txtDC.getText().trim();
        if (makh.equals("") || tenkh.equals("") || sdt.equals("") || dc.equals("")) {
            JOptionPane.showMessageDialog(rootPane, " Ko dc bỏ trống");
        } else {
            ResultSet result = Connect.getInstance().queryData("select * from khachhang where makh = " + makh);
            if (result != null) {
                String sqlUpdate = "UPDATE khachhang SET tenkh = '" + tenkh + "' , sdt = '" + sdt + "',dc = '" + dc + "' where makh =" + makh;
                int status = Connect.getInstance().updateData(sqlUpdate);
                if (status == 1) {
                    JOptionPane.showMessageDialog(rootPane, " Cập nhật Thành Công!");
                    hienthi();
                } else {
                    JOptionPane.showMessageDialog(rootPane, " Cập nhật không Thành Công!");
                }
                clearForm();
            } else {
                JOptionPane.showMessageDialog(rootPane, " Không tìm thấy  KH có mã" + makh);
            }

        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String makh = txtMaKH.getText().trim();

        if (makh.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Mã KH Ko dc bỏ trống");
        } else {
            ResultSet result = Connect.getInstance().queryData("select * from khachhang where makh = " + makh);
            DefaultTableModel model = (DefaultTableModel) tableKH.getModel();
             model.setRowCount(0);
            
                    try {
                        while (result.next()) {
                           
                            int mkh = result.getInt("makh");
                            String tenkh = result.getString("tenkh");
                            String sdt = result.getString("sdt");
                            String dc = result.getString("dc");
                            Object[] kh = {makh, tenkh, sdt, dc};
                            model.addRow(kh);
                           
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(KhachHangForm.class.getName()).log(Level.SEVERE, null, ex);
                    }

        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         String makh = txtMaKH.getText().trim();

        if (makh.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Mã KH Ko dc bỏ trống");
        } else {
            String sqldelete = "delete from khachhang where makh = " + makh;
            if(Connect.getInstance().updateData(sqldelete)==1){
                JOptionPane.showMessageDialog(rootPane, "Đã xóa thành công");
                hienthi();
                clearForm();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Xóa không thành công");
            }

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tableKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKHMouseEntered
        // TODO add your handling code here:
       //JOptionPane.showMessageDialog(rootPane, "click " + tableKH.getSelectedRow());
    }//GEN-LAST:event_tableKHMouseEntered

    private void tableKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKHMouseClicked
        // TODO add your handling code here:
       int row =  tableKH.getSelectedRow();
       txtMaKH.setText(tableKH.getModel().getValueAt(row, 0) + "");
       txtTenKH.setText(tableKH.getModel().getValueAt(row, 1) + "");
       txtSoDT.setText(tableKH.getModel().getValueAt(row, 2) + "");
       txtDC.setText(tableKH.getModel().getValueAt(row, 3) + "");
    }//GEN-LAST:event_tableKHMouseClicked
    public void hienthi() {
        DefaultTableModel model = (DefaultTableModel) tableKH.getModel();
        model.setRowCount(0);
        ResultSet result = Connect.getInstance().queryData("select * from khachhang");
        if (result != null) {
            try {
                while (result.next()) {
                    int makh = result.getInt("makh");
                    String tenkh = result.getString("tenkh");
                    String sdt = result.getString("sdt");
                    String dc = result.getString("dc");
                    Object[] kh = {makh, tenkh, sdt, dc};
                    model.addRow(kh);
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhachHangForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Truy vấn ko thành công!");
        }
    }

    public void clearForm() {
        txtMaKH.setText("");
        txtTenKH.setText("");
        txtSoDT.setText("");
        txtDC.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(KhachHangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKH;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
