/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_view;

import Model.ClientCategory;
import Model.Client_M;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author milly g
 */
public class Client extends javax.swing.JInternalFrame {

    /**
     * Creates new form Client
     */
    
    public Client() {
        initComponents();
    }
     DefaultTableModel dm=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        clientIdTxt = new javax.swing.JTextField();
        FirstnameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PhoneTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LastnameTxt = new javax.swing.JTextField();
        addClientBtn = new javax.swing.JButton();
        ClientCatCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JPasswordField();
        photolabel = new javax.swing.JLabel();
        choosebtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        addclientBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        jLabel1.setText("Client_ID");

        FirstnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameTxtActionPerformed(evt);
            }
        });
        FirstnameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FirstnameTxtKeyReleased(evt);
            }
        });

        jLabel2.setText("FirstName");

        jLabel3.setText("Client_Category");

        jLabel4.setText("Email");

        EmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone");

        jLabel6.setText("LastName");

        addClientBtn.setBackground(new java.awt.Color(204, 102, 255));
        addClientBtn.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        addClientBtn.setText("ADD NEW CLIENT");
        addClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientBtnActionPerformed(evt);
            }
        });

        ClientCatCombo.setBackground(new java.awt.Color(204, 51, 255));
        ClientCatCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STUDENT", "STAFF", "EXTERNAL" }));

        jLabel7.setText("Password");

        choosebtn.setText("Choose");
        choosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Photo");

        addclientBtn.setBackground(new java.awt.Color(204, 0, 255));
        addclientBtn.setText("ADD NEW CLIENT");
        addclientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclientBtnActionPerformed(evt);
            }
        });

        resultTable.setBackground(new java.awt.Color(204, 153, 255));
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "lastname", "email", "phone", "photo", "category"
            }
        ));
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resultTable);

        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addClientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(106, 106, 106))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(FirstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(LastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(70, 70, 70)
                                .addComponent(clientIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PhoneTxt)
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ClientCatCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PasswordTxt)
                                        .addComponent(EmailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(176, 176, 176)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choosebtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(photolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(update)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete))
                                    .addComponent(addclientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addClientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(clientIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientCatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordTxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choosebtn))
                    .addComponent(photolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addclientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(update))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(delete)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameTxtActionPerformed

    private void EmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTxtActionPerformed

    private void choosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtnActionPerformed
        // TODO add your handling code here:
        JFileChooser jc =new JFileChooser();
        int i = jc.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            f=jc.getSelectedFile();
            BufferedImage img = null;
            try {
                img = ImageIO.read(f);
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image dimg = img.getScaledInstance(photolabel.getWidth(), photolabel.getHeight(), Image.SCALE_AREA_AVERAGING);
            ImageIcon ic = new ImageIcon(dimg);
            photolabel.setIcon(ic);
        }
    }//GEN-LAST:event_choosebtnActionPerformed

    private void addclientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclientBtnActionPerformed
       Client_M b= new Client_M();
        b.setClient((ClientCategory) ClientCatCombo.getSelectedItem());
        b.setLastName(LastnameTxt.getText());
        b.setFirstName(FirstnameTxt.getText());
        b.setEmailAddress(EmailTxt.getText());
        b.setPhoneNumber(PhoneTxt.getText());
        b.setPhoto(f.getAbsolutePath());
        new Controller.HibernateTest().insertClient(b);
        
    }//GEN-LAST:event_addclientBtnActionPerformed

    private void addClientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientBtnActionPerformed
   Client_M b= new Client_M();
        b.setClient((ClientCategory) ClientCatCombo.getSelectedItem());
        b.setLastName(LastnameTxt.getText());
        b.setFirstName(FirstnameTxt.getText());
        b.setEmailAddress(EmailTxt.getText());
        b.setPhoneNumber(PhoneTxt.getText());
        b.setPhoto(f.getAbsolutePath());
        new Controller.HibernateTest().insertClient(b);
    }//GEN-LAST:event_addClientBtnActionPerformed

    private void FirstnameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstnameTxtKeyReleased
        // TODO add your handling code here:
        LastnameTxt.setText(FirstnameTxt.getText());
    }//GEN-LAST:event_FirstnameTxtKeyReleased

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(ClientCatCombo.getSelectedItem().toString().equalsIgnoreCase("Student")){
            Client_M m= new Client_M(Integer.parseInt(clientIdTxt.getText()), FirstnameTxt.getText(), LastnameTxt.getText(), EmailTxt.getText(), PhoneTxt.getText(), f.getAbsolutePath(), ClientCategory.STUDENT);
        }else if(ClientCatCombo.getSelectedItem().toString().equalsIgnoreCase("Staff")){
        Client_M m= new Client_M(Integer.parseInt(clientIdTxt.getText()), FirstnameTxt.getText(), LastnameTxt.getText(), EmailTxt.getText(), PhoneTxt.getText(), f.getAbsolutePath(), ClientCategory.STAFF);
        }else{
        Client_M m= new Client_M(Integer.parseInt(clientIdTxt.getText()), FirstnameTxt.getText(), LastnameTxt.getText(), EmailTxt.getText(), PhoneTxt.getText(), f.getAbsolutePath(), ClientCategory.STAFF);
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void resultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseClicked
        // TODO add your handling code here:
        dm=(DefaultTableModel) resultTable.getModel();
        resultTable.getSelectedRow();
        dm.getValueAt(ERROR, WIDTH);      
    }//GEN-LAST:event_resultTableMouseClicked
File f;
ImageIcon ic ;
JFileChooser jc;
int RowCount=0;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ClientCatCombo;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JTextField FirstnameTxt;
    private javax.swing.JTextField LastnameTxt;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JButton addClientBtn;
    private javax.swing.JButton addclientBtn;
    private javax.swing.JButton choosebtn;
    private javax.swing.JTextField clientIdTxt;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel photolabel;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
