/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GymManagement;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Randika
 */
public class NavigateData extends javax.swing.JFrame {

    /**
     * Creates new form NavigateData
     */
    private ArrayList<DefaultMember> arrayList;
    private ListIterator<DefaultMember> listIterator;
    int size;
    
    public NavigateData() {
        initComponents();
        arrayList = new ArrayList<>();
        size = 0;
        arrayList.add(new DefaultMember("Kamal", 001, "No-12, Loatus Rd", 0771111113));
        arrayList.add(new DefaultMember("Nimal", 002, "Avenue Rd, Colombo", 0112342341));
        arrayList.add(new DefaultMember("Sunmal", 003, "N-078, Mathara", 0771111113));
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtuserName = new javax.swing.JTextField();
        txtuserId = new javax.swing.JTextField();
        txtuserAddress = new javax.swing.JTextField();
        txtuserPhone = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFirstUser = new javax.swing.JButton();
        btnNextUser = new javax.swing.JButton();
        btnPreviuosUser = new javax.swing.JButton();
        btnLastUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Gym Management");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Address ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Phone No");

        txtuserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserIdActionPerformed(evt);
            }
        });

        btnAddUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateUser.setText("Update User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteUser.setText("Delete User");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFirstUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFirstUser.setText("First User");
        btnFirstUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstUserActionPerformed(evt);
            }
        });

        btnNextUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNextUser.setText("Next User");
        btnNextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextUserActionPerformed(evt);
            }
        });

        btnPreviuosUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPreviuosUser.setText("Previuos User");
        btnPreviuosUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviuosUserActionPerformed(evt);
            }
        });

        btnLastUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLastUser.setText("Last User");
        btnLastUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuserAddress)
                            .addComponent(txtuserPhone)
                            .addComponent(txtuserName)
                            .addComponent(txtuserId)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFirstUser)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNextUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAddUser)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdateUser)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPreviuosUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLastUser, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(txtuserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txtuserId, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtuserAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtuserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreviuosUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserIdActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        
        if(txtuserName.getText().equals("") || txtuserId.getText().equals("") || txtuserAddress.getText().equals("") || txtuserPhone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Some Fields are Empty!");
        }else{
            String name = txtuserName.getText();
            int id = Integer.parseInt(txtuserId.getText());
            String address = txtuserAddress.getText();
            int phoneNo = Integer.parseInt(txtuserPhone.getText());
            for(DefaultMember d:arrayList){
                if(id == d.getId()){
                    arrayList.remove(d);
                    listIterator = arrayList.listIterator();
                    clearFields();
                    JOptionPane.showMessageDialog(null, "Changes have been done!");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFirstUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstUserActionPerformed
       
        size = arrayList.size();
        listIterator = arrayList.listIterator();
        DefaultMember df;
        df = listIterator.next();
        txtuserName.setText(df.getName());
        txtuserId.setText(""+df.getId());
        txtuserAddress.setText(df.getAddress());
        txtuserPhone.setText(""+df.getPhoneNo());
        
    }//GEN-LAST:event_btnFirstUserActionPerformed

    private void btnNextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextUserActionPerformed
        
        if(txtuserName.getText().equals("") || txtuserId.getText().equals("") || txtuserAddress.getText().equals("") || txtuserPhone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Some Fields are Empty!");
        }else{
            if(listIterator.hasNext()){
                DefaultMember df;
                df = listIterator.next();
                txtuserName.setText(df.getName());
                txtuserId.setText(""+df.getId());
                txtuserAddress.setText(df.getAddress());
                txtuserPhone.setText(""+df.getPhoneNo());
            }else{
                JOptionPane.showMessageDialog(null, "You Reached the End!");
            }
        }
    }//GEN-LAST:event_btnNextUserActionPerformed

    private void btnPreviuosUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviuosUserActionPerformed
        
        if(txtuserName.getText().equals("") || txtuserId.getText().equals("") || txtuserAddress.getText().equals("") || txtuserPhone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Some Fields are Empty!");
        }else{
            if(listIterator.hasPrevious()){
                DefaultMember df;
                df = listIterator.previous();
                txtuserName.setText(df.getName());
                txtuserId.setText(""+df.getId());
                txtuserAddress.setText(df.getAddress());
                txtuserPhone.setText(""+df.getPhoneNo());
            }else{
                JOptionPane.showMessageDialog(null, "You Reached the Start!");
            }
        }
    }//GEN-LAST:event_btnPreviuosUserActionPerformed

    private void btnLastUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastUserActionPerformed
      
      size = arrayList.size();
      listIterator = arrayList.listIterator(arrayList.size());
      if(listIterator.hasPrevious()){
                DefaultMember df;
                df = listIterator.previous();
                txtuserName.setText(df.getName());
                txtuserId.setText(""+df.getId());
                txtuserAddress.setText(df.getAddress());
                txtuserPhone.setText(""+df.getPhoneNo());
      }
    }//GEN-LAST:event_btnLastUserActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
       
          if(txtuserName.getText().equals("") || txtuserId.getText().equals("") || txtuserAddress.getText().equals("") || txtuserPhone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Some Fields are Empty!");
        }else{
            String name = txtuserName.getText();
            int id = Integer.parseInt(txtuserId.getText());
            String address = txtuserAddress.getText();
            int phoneNo = Integer.parseInt(txtuserPhone.getText());
            arrayList.add(new DefaultMember(name, id, address, phoneNo));
            size = arrayList.size();
            clearFields();
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        
         if(txtuserName.getText().equals("") || txtuserId.getText().equals("") || txtuserAddress.getText().equals("") || txtuserPhone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Some Fields are Empty!");
        }else{
            String name = txtuserName.getText();
            int id = Integer.parseInt(txtuserId.getText());
            String address = txtuserAddress.getText();
            int phoneNo = Integer.parseInt(txtuserPhone.getText());
            for(DefaultMember d:arrayList){
                if(id == d.getId()){
                    d.setName(name);
                    d.setId(id);
                    d.setAddress(address);
                    d.setPhoneNo(phoneNo);
                    JOptionPane.showMessageDialog(null, "Changes have been done!");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    void clearFields(){
        txtuserName.setText("");
        txtuserId.setText("");
        txtuserAddress.setText("");
        txtuserPhone.setText("");
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
            java.util.logging.Logger.getLogger(NavigateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NavigateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NavigateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NavigateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NavigateData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirstUser;
    private javax.swing.JButton btnLastUser;
    private javax.swing.JButton btnNextUser;
    private javax.swing.JButton btnPreviuosUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtuserAddress;
    private javax.swing.JTextField txtuserId;
    private javax.swing.JTextField txtuserName;
    private javax.swing.JTextField txtuserPhone;
    // End of variables declaration//GEN-END:variables
}