 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.luongthixuanmai_th04;

import Proccess.LoaiSP;
import Proccess.LoaiSanPham;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author AD
 */
public class frmQLSP extends javax.swing.JFrame {
    
    private final LoaiSP lsp = new LoaiSP();
    private boolean cothem=true;
    private final DefaultTableModel tableModel = new DefaultTableModel();
    public void ClearData() throws SQLException{
        //Lay chi so dong cuoi cung
        int n=tableModel.getRowCount()-1;
        for(int i=n;i>=0;i--)
            tableModel.removeRow(i);//Remove tung dong
    }
    
    private void setNull()
    {
        //Xoa trang cac JtextField
        this.txtMaLoai.setText(null);
        this.txtTenLoai.setText(null);
        this.txtMaLoai.requestFocus();
    }
    
    private void setKhoa(boolean a)
    {
        //Khoa hoac mo khoa cho Cac JTextField
        this.txtMaLoai.setEnabled (!a);
        this.txtTenLoai.setEnabled (!a);
    }
    
    private void setButton(boolean a)
    {
        //Vo hieu hoac co hieu luc cho cac JButton
        this.btnThem.setEnabled (a);
        this.btnXoa.setEnabled (a);
        this.btnSua.setEnabled (a);
        this.btnLuu.setEnabled (!a);
        this.btnKLuu.setEnabled (!a);
        this.btnThoat.setEnabled (a);
    }
    public frmQLSP() {
        initComponents();
        String [] col_Name = {"Ma loai" , "Ten loai"};
        tableModel.setColumnIdentifiers(col_Name);
        tbLoaiSanPham.setModel(tableModel);
        //gọi hàm ShowData để đưa dữ liệu vào tableModel
        ShowData();
        //goi Ham xoa trang cac TextField
        setNull();
        //Goi ham Khoa cac TextField
        setKhoa(true);
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao
        setButton(true);
    }
    public void ShowData() {
        List<LoaiSanPham> lst;
        try {
            lst = lsp.getLoaiSP();
            for(int i=0;i<lst.size();i++){
            String [] row = {lst.get(i).getMaLoai(), lst.get(i).getTenLoai()};
            tableModel.addRow(row);
        }
        } catch (SQLException ex) {
            Logger.getLogger(frmQLSP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * Creates new form frmQLSP
     */
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        txtTenLoai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnKLuu = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLoaiSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Danh mục sản phẩm");

        jLabel2.setText("Mã loại:");

        jLabel3.setText("Tên loại:");

        txtMaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLoaiActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnKLuu.setText("K. Lưu");
        btnKLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKLuuMouseClicked(evt);
            }
        });
        btnKLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKLuuActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuMouseClicked(evt);
            }
        });
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tbLoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã loại", "Tên loại"
            }
        ));
        tbLoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoaiSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLoaiSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaLoai)
                            .addComponent(txtTenLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btnKLuu)
                        .addGap(12, 12, 12)
                        .addComponent(btnThoat)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnLuu)
                    .addComponent(btnThoat)
                    .addComponent(btnKLuu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLoaiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnKLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKLuuActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tbLoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiSanPhamMouseClicked
        // TODO add your handling code here:
        //Doc du lieu dong nguoi dung chon len cac texfield
        try{
            int row = tbLoaiSanPham.getSelectedRow();
            String ml = tbLoaiSanPham.getModel().getValueAt(row, 0).toString();
            String tl = tbLoaiSanPham.getModel().getValueAt(row, 1).toString();
            txtMaLoai.setText(ml);
            txtTenLoai.setText(tl);
        }catch (Exception ex){
            System.out.println("Loi:" +ex.getMessage());
        }
    }//GEN-LAST:event_tbLoaiSanPhamMouseClicked
    
    
    
    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        String ml=txtMaLoai.getText();
        try {
            if(ml.length()==0)
                JOptionPane.showMessageDialog(null,"Chon 1 loai SP de xoa", "Thongbao",1);
            else
            {
                if(JOptionPane.showConfirmDialog(null, "Ban muon xoa loai " + ml + " nay hay khong?","Thong bao",2)==0)
                {
                    lsp.DeleteData(ml);//goi ham xoa du lieu theo ma loai
                    ClearData();//Xoa du lieu trong tableModel
                    ShowData();//Do du lieu vao table Model
                    setNull();//Xoa trang Textfield
                }
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Xóa thất bại","Thong bao",1);
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        setNull();//Xoa trang TextField
        setKhoa(false);//Mo khoa TextField
        setButton(false);//Goi ham khoa cac Button
        cothem=true;//Gan cothem = true de ghi nhan trang thai them moi
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        String ml=txtMaLoai.getText();
        if(ml.length()==0) //Chua chon Ma loai
            JOptionPane.showMessageDialog(null,"Vui long chon loi can sua","Thong bao",1);
        else
        {
            setKhoa(false);//Mo khoa cac TextField
            this.txtMaLoai.enable(false);
            setButton(false); //Khoa cac Button
            cothem=false; //Gan cothem=false de ghi nhan trang thai la sua
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        // TODO add your handling code here:
        String ml=txtMaLoai.getText();
        String tl=txtTenLoai.getText();
        if(ml.length()==0 || tl.length()==0)
            JOptionPane.showMessageDialog(null, "Vui long nhap Ma loai va ten loai","Thong bao",1);
        else
            if(ml.length()>2 || tl.length()>30)
            JOptionPane.showMessageDialog(null,"Ma loai chi 2 ky tu, ten loai la 20","Thong bao",1);
        else
        {
        try {
            // đọc dữ liệu vào LoaiSP
            LoaiSanPham obj = new LoaiSanPham();
            obj.setMaLoai(txtMaLoai.getText());
            obj.setTenLoai(txtTenLoai.getText());
            if(cothem==true) //Luu cho them moi
                lsp.InsertData(obj);
            else //Luu cho sua
                lsp.EditData(obj);
            ClearData(); //goi ham xoa du lieu tron tableModel
            ShowData(); //Do lai du lieu vao Table Model
        }
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Cap nhat that bai", "Thong bao",1);
        }
        setKhoa(false);
        setButton(true);
        }
    }//GEN-LAST:event_btnLuuMouseClicked

    private void btnKLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKLuuMouseClicked
        // TODO add your handling code here:
        setNull();
        setKhoa(true);
        setButton(true);
    }//GEN-LAST:event_btnKLuuMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(frmQLSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQLSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQLSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQLSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmQLSP().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKLuu;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLoaiSanPham;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
