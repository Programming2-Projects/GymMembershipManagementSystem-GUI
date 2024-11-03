
package frontend;
import backend.*;
import javax.swing.JOptionPane;

public class CancelRegistrationWindow extends javax.swing.JDialog {
    TrainerRole trainer;
    
    public CancelRegistrationWindow(TrainerRole trainer) {
        this.trainer = trainer;
        initComponents();
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
        MemberIDLabel = new javax.swing.JLabel();
        memberIDTextField = new javax.swing.JTextField();
        classIDLabel = new javax.swing.JLabel();
        classIDTextField = new javax.swing.JTextField();
        cancelMemberButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancel Registration");
        setLocation(new java.awt.Point(500, 150));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        MemberIDLabel.setBackground(new java.awt.Color(0, 204, 51));
        MemberIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MemberIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MemberIDLabel.setText("Member ID");

        classIDLabel.setBackground(new java.awt.Color(0, 204, 51));
        classIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        classIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classIDLabel.setText("Class ID");

        cancelMemberButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelMemberButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelMemberButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelMemberButton.setText("Cancel Registration");
        cancelMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMemberButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MemberIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(classIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memberIDTextField)
                    .addComponent(classIDTextField))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cancelMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cancelMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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
    private javax.swing.JLabel MemberIDLabel;
    private javax.swing.JButton cancelMemberButton;
    private javax.swing.JLabel classIDLabel;
    private javax.swing.JTextField classIDTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField memberIDTextField;
    // End of variables declaration//GEN-END:variables
}
