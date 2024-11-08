/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import javax.swing.JOptionPane;


public class AddTrainerWindow extends javax.swing.JFrame {
    AdminRole admin;
    private boolean validateTrainer(String id, String name, String email, String speciality, String phoneNumber) {
        if(id.isEmpty() || name.isEmpty() || email.isEmpty() || speciality.isEmpty() || phoneNumber.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Some Fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidID(id, 'T'))
        {
            JOptionPane.showMessageDialog(null, "Invalid ID", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
         if(!Validator.isValidName(name))
        {
            JOptionPane.showMessageDialog(null, "Invalid Name", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidEmail(email))
        {
            JOptionPane.showMessageDialog(null, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
        if(!Validator.isValidPhoneNumber(phoneNumber))
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    public AddTrainerWindow(AdminRole admin) {
        this.admin = admin;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NameLabel = new java.awt.Label();
        EmailLabel = new java.awt.Label();
        SpecialityLabel = new java.awt.Label();
        IDLabel = new java.awt.Label();
        PhonenumberLabel = new java.awt.Label();
        AddButton = new javax.swing.JButton();
        NameTextField = new javax.swing.JTextField();
        IDTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        SpecialityTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Trainer");
        setLocation(new java.awt.Point(500, 150));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        NameLabel.setAlignment(java.awt.Label.CENTER);
        NameLabel.setBackground(new java.awt.Color(204, 255, 204));
        NameLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        NameLabel.setText("Name");

        EmailLabel.setAlignment(java.awt.Label.CENTER);
        EmailLabel.setBackground(new java.awt.Color(204, 255, 204));
        EmailLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EmailLabel.setText("Email");

        SpecialityLabel.setAlignment(java.awt.Label.CENTER);
        SpecialityLabel.setBackground(new java.awt.Color(204, 255, 204));
        SpecialityLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        SpecialityLabel.setText("Speciality");

        IDLabel.setAlignment(java.awt.Label.CENTER);
        IDLabel.setBackground(new java.awt.Color(204, 255, 204));
        IDLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        IDLabel.setText("ID");

        PhonenumberLabel.setAlignment(java.awt.Label.CENTER);
        PhonenumberLabel.setBackground(new java.awt.Color(204, 255, 204));
        PhonenumberLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PhonenumberLabel.setText("Phone Number");

        AddButton.setBackground(new java.awt.Color(0, 0, 0));
        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        SpecialityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialityTextFieldActionPerformed(evt);
            }
        });

        PhoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpecialityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PhonenumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SpecialityTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDTextField))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpecialityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpecialityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(PhonenumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void SpecialityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpecialityTextFieldActionPerformed

    private void PhoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTextFieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String trainerName = NameTextField.getText();
        String trainerID = IDTextField.getText();
        String email = EmailTextField.getText();
        String speciality = SpecialityTextField.getText();
        String phoneNumber = PhoneNumberTextField.getText();
        
        boolean  flag = validateTrainer(trainerID, trainerName, email, speciality, phoneNumber);
        if(!flag)
            return;
        
        flag = admin.addTrainer(trainerID, trainerName, email, speciality, phoneNumber);
        
        if(flag)
        {
            JOptionPane.showMessageDialog(null, "The trainer with ID = " + trainerID + " has been successfuly added", "Information", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "The trainer with ID = " + trainerID + " already exists", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_AddButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private java.awt.Label EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private java.awt.Label IDLabel;
    private javax.swing.JTextField IDTextField;
    private java.awt.Label NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PhoneNumberTextField;
    private java.awt.Label PhonenumberLabel;
    private java.awt.Label SpecialityLabel;
    private javax.swing.JTextField SpecialityTextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
