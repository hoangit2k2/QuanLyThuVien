/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.hicode.swing;

import com.QLTV.DAO.TKtrongTuanDAO;
import com.QLTV.DAO.ThongKeDAO;
import com.QLTV.DAO.ThongKeLuotMuaDAO;
import com.QLTV.entities.TKluotMua;
import com.QLTV.entities.ThongKe;
import com.QLTV.entities.tktrongtuan;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Owner
 */
public class FormThongKe extends javax.swing.JPanel {

    /**
     * Creates new form TKTuan
     */
    public FormThongKe() {
        initComponents();
        this.filltable();
        this.filltable1();
        this.filltable2();

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
        tbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        myButton2 = new com.hicode.swing.MyButton();
        myButton3 = new com.hicode.swing.MyButton();
        myButton4 = new com.hicode.swing.MyButton();

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doanh Thu", "Ngày Tháng"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tháng", "Lượt Mua"
            }
        ));
        jScrollPane2.setViewportView(tbl1);

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tên", "Số Lượng"
            }
        ));
        jScrollPane3.setViewportView(tbl2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 155, 87));
        jLabel1.setText("Thống Kê Theo Tuấn");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 155, 87));
        jLabel2.setText("Thống Kê Theo Tháng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 155, 87));
        jLabel3.setText("Thống Kê Thể Loại");

        myButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        myButton2.setText("Chọn");
        myButton2.setColor1(new java.awt.Color(141, 227, 219));
        myButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });

        myButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        myButton3.setText("Chọn");
        myButton3.setColor1(new java.awt.Color(141, 227, 219));
        myButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });

        myButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        myButton4.setText("Chọn");
        myButton4.setColor1(new java.awt.Color(141, 227, 219));
        myButton4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        myButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(206, 206, 206)
                .addComponent(jLabel3)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237)
                .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        TK_Tuan.main();    
    }//GEN-LAST:event_myButton2ActionPerformed

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
        TK_Thang.main();
    }//GEN-LAST:event_myButton3ActionPerformed

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
        TK_TheLoai.main();
    }//GEN-LAST:event_myButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.hicode.swing.MyButton myButton2;
    private com.hicode.swing.MyButton myButton3;
    private com.hicode.swing.MyButton myButton4;
    private javax.swing.JTable tbl;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    // End of variables declaration//GEN-END:variables
        TKtrongTuanDAO dao = new TKtrongTuanDAO();

    void filltable() {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0);
        try {
            List<tktrongtuan> list = dao.selectAll();
            for (tktrongtuan TK : list) {
                Object[] row = {
                    TK.getDT() + "VND",
                    TK.getNgay()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    ThongKeLuotMuaDAO dao1 = new ThongKeLuotMuaDAO();

    void filltable1() {
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        model.setRowCount(0);
        try {
            List<TKluotMua> list = dao1.selectAll();
            for (TKluotMua TK : list) {
                Object[] row = {
                    TK.getThang(),
                    TK.getLuot()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    ThongKeDAO dao2 = new ThongKeDAO();

    void filltable2() {
        DefaultTableModel model = (DefaultTableModel) tbl2.getModel();
        model.setRowCount(0);
        try {
            List<ThongKe> list = dao2.selectAll();
            for (ThongKe TK : list) {
                Object[] row = {
                    TK.getTen(),
                    TK.getSL()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }
}
