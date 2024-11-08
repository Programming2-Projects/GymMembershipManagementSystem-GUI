
package frontend;
import backend.*;
import javax.swing.JOptionPane;

public class CancelRegistrationWindow extends javax.swing.JDialog {
    TrainerRole trainer;
    
    public CancelRegistrationWindow(TrainerRole trainer) {
        this.trainer = trainer;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private boolean validateCancelation(String memberID, String classID) {
        if(memberID.isEmpty() || classID.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Some Fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidID(memberID, 'M'))
        {
            JOptionPane.showMessageDialog(null, "Invalid Member ID", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidID(classID, 'C'))
        {
            JOptionPane.showMessageDialog(null, "Invalid Class ID", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        memberIDTextField = new javax.swing.JTextField();
        classIDTextField = new javax.swing.JTextField();
        cancelMemberButton = new javax.swing.JButton();
        memberIDlabel = new java.awt.Label();
        classIDlabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancel Registration");
        setLocation(new java.awt.Point(500, 150));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        cancelMemberButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelMemberButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelMemberButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelMemberButton.setText("Cancel Registration");
        cancelMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMemberButtonActionPerformed(evt);
            }
        });

        memberIDlabel.setAlignment(java.awt.Label.CENTER);
        memberIDlabel.setBackground(new java.awt.Color(204, 255, 204));
        memberIDlabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        memberIDlabel.setText("Member ID");

        classIDlabel.setAlignment(java.awt.Label.CENTER);
        classIDlabel.setBackground(new java.awt.Color(204, 255, 204));
        classIDlabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        classIDlabel.setText("Class ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memberIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(classIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(memberIDTextField))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cancelMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memberIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(memberIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cancelMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMemberButtonActionPerformed
        String memberID = memberIDTextField.getText();
        String classID = classIDTextField.getText();
        
        boolean  flag = validateCancelation(memberID, classID);
        if(!flag)
            return;
        
        flag = trainer.cancelRegistration(memberID, classID);
        if(flag)
        {
            JOptionPane.showMessageDialog(null, "The member with ID = " + memberID + " has been unregisterd from class " + classID, "Information", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "Cancelation Failed", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_cancelMemberButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelMemberButton;
    private javax.swing.JTextField classIDTextField;
    private java.awt.Label classIDlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField memberIDTextField;
    private java.awt.Label memberIDlabel;
    // End of variables declaration//GEN-END:variables
}
