/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.*;

public class AdminRoleWindow extends javax.swing.JFrame {
    AdminRole admin; 
    
    public AdminRoleWindow() {
        initComponents();
        admin = new AdminRole();
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RemoveTrainerButton = new javax.swing.JButton();
        AddTrainerButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        ViewTrainersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Admin Role");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        RemoveTrainerButton.setBackground(new java.awt.Color(0, 0, 0));
        RemoveTrainerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RemoveTrainerButton.setForeground(new java.awt.Color(255, 255, 255));
        RemoveTrainerButton.setText("Remove Trainer");
        RemoveTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTrainerButtonActionPerformed(evt);
            }
        });

        AddTrainerButton.setBackground(new java.awt.Color(0, 0, 0));
        AddTrainerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddTrainerButton.setForeground(new java.awt.Color(255, 255, 255));
        AddTrainerButton.setText("Add Trainer");
        AddTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainerButtonActionPerformed(evt);
            }
        });

        LogOutButton.setBackground(new java.awt.Color(0, 0, 0));
        LogOutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        ViewTrainersButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewTrainersButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ViewTrainersButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewTrainersButton.setText("View Trainers");
        ViewTrainersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTrainersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewTrainersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(AddTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(RemoveTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ViewTrainersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void RemoveTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTrainerButtonActionPerformed
        // TODO add your handling code here:
        new RemoveTrainerWindow(admin);
    }//GEN-LAST:event_RemoveTrainerButtonActionPerformed

    private void AddTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainerButtonActionPerformed
        // TODO add your handling code here:
        new AddTrainerWindow(admin);
    }//GEN-LAST:event_AddTrainerButtonActionPerformed

    private void ViewTrainersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTrainersButtonActionPerformed
        // TODO add your handling code here:
        new ViewTrainersWindow(admin);
    }//GEN-LAST:event_ViewTrainersButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
        admin.logout();
        this.dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainerButton;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton RemoveTrainerButton;
    private javax.swing.JButton ViewTrainersButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
