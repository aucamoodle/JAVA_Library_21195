/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unused;

import Controller.HibernateTest;
import Model.Book;
import Model.Client_M;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author milly g
 */
public class Operations extends javax.swing.JInternalFrame {

    /**
     * Creates new form Operations
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Check_In_Form = new javax.swing.JPanel();
        clientcombo1 = new javax.swing.JComboBox<>();
        bookcombo1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkInTable = new javax.swing.JTable();
        checkInBtn = new javax.swing.JButton();
        CHECK_OUT_form = new javax.swing.JPanel();
        clientcombo2 = new javax.swing.JComboBox<>();
        bookcombo2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkOutTable = new javax.swing.JTable();
        checkOutBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        Check_In_Form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_In_FormMouseClicked(evt);
            }
        });

        clientcombo1.setBackground(new java.awt.Color(204, 0, 255));

        bookcombo1.setBackground(new java.awt.Color(204, 0, 255));
        bookcombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookcombo1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Client");

        jLabel2.setText("Book");

        checkInTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FullName", "Book", "Status"
            }
        ));
        jScrollPane1.setViewportView(checkInTable);

        checkInBtn.setBackground(new java.awt.Color(204, 0, 204));
        checkInBtn.setText("CHECK_IN");
        checkInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Check_In_FormLayout = new javax.swing.GroupLayout(Check_In_Form);
        Check_In_Form.setLayout(Check_In_FormLayout);
        Check_In_FormLayout.setHorizontalGroup(
            Check_In_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Check_In_FormLayout.createSequentialGroup()
                .addGroup(Check_In_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Check_In_FormLayout.createSequentialGroup()
                        .addGroup(Check_In_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Check_In_FormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(218, 218, 218)
                                .addComponent(jLabel2))
                            .addGroup(Check_In_FormLayout.createSequentialGroup()
                                .addComponent(clientcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(bookcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Check_In_FormLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(checkInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
        );
        Check_In_FormLayout.setVerticalGroup(
            Check_In_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Check_In_FormLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(Check_In_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Check_In_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
            .addComponent(checkInBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CHECK_IN", Check_In_Form);

        CHECK_OUT_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHECK_OUT_formMouseClicked(evt);
            }
        });

        clientcombo2.setBackground(new java.awt.Color(204, 0, 255));

        bookcombo2.setBackground(new java.awt.Color(204, 0, 255));

        jLabel3.setText("Book");

        jLabel4.setText("Client");

        checkOutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FullName", "Book", "Status"
            }
        ));
        jScrollPane2.setViewportView(checkOutTable);

        checkOutBtn.setBackground(new java.awt.Color(204, 0, 255));
        checkOutBtn.setText("CHECK_OUT");
        checkOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CHECK_OUT_formLayout = new javax.swing.GroupLayout(CHECK_OUT_form);
        CHECK_OUT_form.setLayout(CHECK_OUT_formLayout);
        CHECK_OUT_formLayout.setHorizontalGroup(
            CHECK_OUT_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHECK_OUT_formLayout.createSequentialGroup()
                .addGroup(CHECK_OUT_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CHECK_OUT_formLayout.createSequentialGroup()
                        .addGroup(CHECK_OUT_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clientcombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(CHECK_OUT_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookcombo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkOutBtn))
        );
        CHECK_OUT_formLayout.setVerticalGroup(
            CHECK_OUT_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHECK_OUT_formLayout.createSequentialGroup()
                .addGroup(CHECK_OUT_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CHECK_OUT_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bookcombo2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(clientcombo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
            .addComponent(checkOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CHECK_OUT", CHECK_OUT_form);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookcombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookcombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookcombo1ActionPerformed
    DefaultTableModel dm=null;
    private void Check_In_FormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_In_FormMouseClicked
   
    }//GEN-LAST:event_Check_In_FormMouseClicked

    private void CHECK_OUT_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHECK_OUT_formMouseClicked

    }//GEN-LAST:event_CHECK_OUT_formMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formInternalFrameOpened

    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBtnActionPerformed
//            new HibernateTest().insertOp(Integer.parseInt(clientcombo1.getSelectedItem().toString()), Integer.parseInt(bookcombo1.getSelectedItem().toString()));
        
    }//GEN-LAST:event_checkOutBtnActionPerformed

    private void checkInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInBtnActionPerformed
        new HibernateTest().deleteOp(Integer.parseInt(clientcombo1.getSelectedItem().toString()), Integer.parseInt(bookcombo1.getSelectedItem().toString()));
        
    }//GEN-LAST:event_checkInBtnActionPerformed
public void populateClientCombo(){
    dmm=(DefaultComboBoxModel) clientcombo1.getModel();
List<Client_M>lscli=new HibernateTest().AllClient();
lscli.forEach(Client->{
dmm.addElement(Client.getId());
});

}
public void populateBookCombo(){
    dmb=(DefaultComboBoxModel) bookcombo1.getModel();
List<Book>lsboo=new HibernateTest().AllBooks();
lsboo.forEach(Book->{
dmb.addElement(Book.getBookNum());
});

}
    DefaultComboBoxModel dmb=null;
    DefaultComboBoxModel dmm= null;
int RowCount=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CHECK_OUT_form;
    private javax.swing.JPanel Check_In_Form;
    private javax.swing.JComboBox<String> bookcombo1;
    private javax.swing.JComboBox<String> bookcombo2;
    private javax.swing.JButton checkInBtn;
    private javax.swing.JTable checkInTable;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JTable checkOutTable;
    private javax.swing.JComboBox<String> clientcombo1;
    private javax.swing.JComboBox<String> clientcombo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
