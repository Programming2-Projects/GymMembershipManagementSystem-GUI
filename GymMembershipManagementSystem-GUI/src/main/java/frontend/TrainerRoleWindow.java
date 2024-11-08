package frontend;
import backend.TrainerRole;
import java.awt.event.*;
import javax.swing.*;

public class TrainerRoleWindow extends javax.swing.JFrame {
    TrainerRole trainer;
    MainWindow parent;
    public TrainerRoleWindow(MainWindow parent) {
        this.parent = parent;
        initComponents();
        trainer = new TrainerRole();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                        TrainerRoleWindow.this,
                        "Are you sure you want to exit? Changes Won't be saved.",
                        "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    parent.setVisible(true);
                    dispose();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trainerRolePanel = new javax.swing.JPanel();
        addMemberButton = new javax.swing.JButton();
        viewMembersButton = new javax.swing.JButton();
        addClassButton = new javax.swing.JButton();
        viewClassesButton = new javax.swing.JButton();
        registerMemberforClassButton = new javax.swing.JButton();
        cancelRegistrationButton = new javax.swing.JButton();
        viewRegistrationsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trainer Role");
        setBackground(new java.awt.Color(153, 153, 153));
        setLocation(new java.awt.Point(500, 150));

        trainerRolePanel.setBackground(new java.awt.Color(204, 204, 204));
        trainerRolePanel.setToolTipText("");
        trainerRolePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addMemberButton.setBackground(new java.awt.Color(0, 0, 0));
        addMemberButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addMemberButton.setForeground(new java.awt.Color(255, 255, 255));
        addMemberButton.setText("Add Member");
        addMemberButton.setBorder(null);
        addMemberButton.setBorderPainted(false);
        addMemberButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonActionPerformed(evt);
            }
        });

        viewMembersButton.setBackground(new java.awt.Color(0, 0, 0));
        viewMembersButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewMembersButton.setForeground(new java.awt.Color(255, 255, 255));
        viewMembersButton.setText("View Members");
        viewMembersButton.setBorder(null);
        viewMembersButton.setBorderPainted(false);
        viewMembersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMembersButtonActionPerformed(evt);
            }
        });

        addClassButton.setBackground(new java.awt.Color(0, 0, 0));
        addClassButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addClassButton.setForeground(new java.awt.Color(255, 255, 255));
        addClassButton.setText("Add Class");
        addClassButton.setBorder(null);
        addClassButton.setBorderPainted(false);
        addClassButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        viewClassesButton.setBackground(new java.awt.Color(0, 0, 0));
        viewClassesButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewClassesButton.setForeground(new java.awt.Color(255, 255, 255));
        viewClassesButton.setText("View Classes");
        viewClassesButton.setBorder(null);
        viewClassesButton.setBorderPainted(false);
        viewClassesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassesButtonActionPerformed(evt);
            }
        });

        registerMemberforClassButton.setBackground(new java.awt.Color(0, 0, 0));
        registerMemberforClassButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerMemberforClassButton.setForeground(new java.awt.Color(255, 255, 255));
        registerMemberforClassButton.setText("Register Member for Class");
        registerMemberforClassButton.setBorder(null);
        registerMemberforClassButton.setBorderPainted(false);
        registerMemberforClassButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registerMemberforClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMemberforClassButtonActionPerformed(evt);
            }
        });

        cancelRegistrationButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelRegistrationButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelRegistrationButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelRegistrationButton.setText("Cancel Registration");
        cancelRegistrationButton.setBorder(null);
        cancelRegistrationButton.setBorderPainted(false);
        cancelRegistrationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelRegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegistrationButtonActionPerformed(evt);
            }
        });

        viewRegistrationsButton.setBackground(new java.awt.Color(0, 0, 0));
        viewRegistrationsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewRegistrationsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewRegistrationsButton.setText("View Registrations");
        viewRegistrationsButton.setBorder(null);
        viewRegistrationsButton.setBorderPainted(false);
        viewRegistrationsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewRegistrationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationsButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout trainerRolePanelLayout = new javax.swing.GroupLayout(trainerRolePanel);
        trainerRolePanel.setLayout(trainerRolePanelLayout);
        trainerRolePanelLayout.setHorizontalGroup(
            trainerRolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainerRolePanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(trainerRolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerMemberforClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelRegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRegistrationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        trainerRolePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addClassButton, addMemberButton, cancelRegistrationButton, logoutButton, registerMemberforClassButton, viewClassesButton, viewMembersButton, viewRegistrationsButton});

        trainerRolePanelLayout.setVerticalGroup(
            trainerRolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainerRolePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(addMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerMemberforClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelRegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewRegistrationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        trainerRolePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addClassButton, addMemberButton, cancelRegistrationButton, logoutButton, registerMemberforClassButton, viewClassesButton, viewMembersButton, viewRegistrationsButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trainerRolePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trainerRolePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        trainerRolePanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonActionPerformed
        new AddMemberWindow(trainer);
    }//GEN-LAST:event_addMemberButtonActionPerformed

    private void viewMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMembersButtonActionPerformed
        new ViewMembersWindow(trainer);
    }//GEN-LAST:event_viewMembersButtonActionPerformed

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        new AddClassWindow(trainer);
    }//GEN-LAST:event_addClassButtonActionPerformed

    private void viewClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassesButtonActionPerformed
        new ViewClassesWindow(trainer);
    }//GEN-LAST:event_viewClassesButtonActionPerformed

    private void registerMemberforClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMemberforClassButtonActionPerformed
        new RegisterMemberForClassWindow(trainer);
    }//GEN-LAST:event_registerMemberforClassButtonActionPerformed

    private void cancelRegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegistrationButtonActionPerformed
         new CancelRegistrationWindow(trainer);
    }//GEN-LAST:event_cancelRegistrationButtonActionPerformed

    private void viewRegistrationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationsButtonActionPerformed
        new ViewRegistrationsWindow(trainer);
    }//GEN-LAST:event_viewRegistrationsButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        trainer.logout();
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassButton;
    private javax.swing.JButton addMemberButton;
    private javax.swing.JButton cancelRegistrationButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton registerMemberforClassButton;
    private javax.swing.JPanel trainerRolePanel;
    private javax.swing.JButton viewClassesButton;
    private javax.swing.JButton viewMembersButton;
    private javax.swing.JButton viewRegistrationsButton;
    // End of variables declaration//GEN-END:variables
}
