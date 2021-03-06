/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Category;
import controller.ControllerCat;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ChiCong
 */
public class PnCat extends javax.swing.JPanel {

    private ControllerCat controller;

    /**
     * Creates new form PnCat
     */
    public PnCat() {
        initComponents();
        controller = new ControllerCat(tbMain);
        controller.loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfIdCat = new javax.swing.JTextField();
        tfNameCat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btReWrite = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfIDF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfNameF = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOneTouchExpandable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "From chức năng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 51, 0)), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 531));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID danh mục: ");

        tfIdCat.setEditable(false);
        tfIdCat.setMinimumSize(new java.awt.Dimension(6, 28));
        tfIdCat.setPreferredSize(new java.awt.Dimension(6, 28));

        tfNameCat.setMinimumSize(new java.awt.Dimension(6, 28));
        tfNameCat.setPreferredSize(new java.awt.Dimension(6, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên danh mục: ");

        btAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        btAdd.setText("Thêm");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        jPanel6.add(btAdd);

        btEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        btEdit.setText("Sửa");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        jPanel6.add(btEdit);

        btReWrite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btReWrite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        btReWrite.setText("Nhập lại");
        btReWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReWriteActionPerformed(evt);
            }
        });
        jPanel6.add(btReWrite);

        btDel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
        btDel.setText("Xóa");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });
        jPanel6.add(btDel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfIdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfNameCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIdCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNameCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tìm kiếm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ID: ");

        tfIDF.setPreferredSize(new java.awt.Dimension(59, 28));
        tfIDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tên: ");

        tfNameF.setPreferredSize(new java.awt.Dimension(59, 28));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        jButton5.setText("Tìm kiếm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tfIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 140, Short.MAX_VALUE))
                    .addComponent(tfNameF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 51, 0)), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10))); // NOI18N
        jPanel3.setMinimumSize(new java.awt.Dimension(300, 100));

        tbMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbMainMousePressed(evt);
            }
        });
        tbMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMainKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbMain);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tbMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMainMousePressed
        setForm();
    }//GEN-LAST:event_tbMainMousePressed

    private void tbMainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMainKeyReleased
        setForm();
    }//GEN-LAST:event_tbMainKeyReleased

    public boolean isValid(Category objCat, String func) {
        boolean result = true;

        switch (func) {
            case "add":
                if (objCat.getName().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Chưa nhập tên");
                    result = false;
                }
                break;
            case "del":
                if (objCat.getId_cat() <= 0) {
                    JOptionPane.showMessageDialog(null, "Chưa chọn dòng để xóa");
                    result = false;
                }
                break;
            case "edit":
                if (objCat.getId_cat() <= 0) {
                    JOptionPane.showMessageDialog(null, "Nhập id");
                    result = false;
                }
                if (objCat.getName().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nhập tên danh mục");
                    result = false;
                }
        }
        return result;
    }

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        String name = tfNameCat.getText();
        Category objCat = new Category(0, name);
        if (isValid(objCat, "add")) {
            int result = controller.addItem(objCat);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Them thanh cong");
            } else {
                JOptionPane.showMessageDialog(null, "Xay ra loi");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui long nhap ten");
        }
        
    }//GEN-LAST:event_btAddActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        int row = tbMain.getSelectedRow();
        int id_cat = 0;
        if (!tfIdCat.getText().isEmpty()) {
            id_cat = Integer.parseInt(tfIdCat.getText());
        }
        String name = "";
        Category objCat = new Category(id_cat, name);
        if (isValid(objCat, "del")) {
            int result = controller.delItem(objCat, row);
            resetForm();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Xãy ra lỗi");
            }
        }
    }//GEN-LAST:event_btDelActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        int row = tbMain.getSelectedRow();
        int id_cat = 0;
        if (!tfIdCat.getText().isEmpty()) {
            id_cat = Integer.parseInt(tfIdCat.getText());
        }
        String name = tfNameCat.getText();
        Category objCat = new Category(id_cat, name);
        if (isValid(objCat, "edit")) {
            if (controller.editItem(objCat, row) > 0) {
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Xãy ra lỗi");
            }
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btReWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReWriteActionPerformed
        resetForm();
    }//GEN-LAST:event_btReWriteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TableRowSorter sorter = new TableRowSorter(tbMain.getModel());
        tbMain.setRowSorter(sorter);
        String idF = tfIDF.getText();
        String nameF = tfNameF.getText();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tfIDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDFActionPerformed

    public void setForm() {
        int row = tbMain.getSelectedRow();
        String id_cat = tbMain.getValueAt(row, 0).toString();
        String name = tbMain.getValueAt(row, 1).toString();

        tfIdCat.setText(id_cat);
        tfNameCat.setText(name);
    }

    private void resetForm() {
        int row = -1;
        String id_cat = "";
        String name = "";

        tfIdCat.setText(id_cat);
        tfNameCat.setText(name);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btReWrite;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tbMain;
    private javax.swing.JTextField tfIDF;
    private javax.swing.JTextField tfIdCat;
    private javax.swing.JTextField tfNameCat;
    private javax.swing.JTextField tfNameF;
    // End of variables declaration//GEN-END:variables

}
