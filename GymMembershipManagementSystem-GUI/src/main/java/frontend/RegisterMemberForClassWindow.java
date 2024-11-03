package frontend;
import backend.*;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegisterMemberForClassWindow extends javax.swing.JDialog {
    TrainerRole trainer;

    public RegisterMemberForClassWindow(TrainerRole trainer) {
        this.trainer = trainer;
        initComponents();
        setVisible(true);
    }
    
    private boolean validateRegistration(String memberID, String classID, String date) {
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
        
        if(date.isEmpty())
            return true;

        try {
            LocalDate.parse(date.trim());
        } catch (DateTimeParseException  e) {
            JOptionPane.showMessageDialog(null, "Invalid Date", "Error", JOptionPane.ERROR_MESSAGE);
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
        registrationDateLabel = new javax.swing.JLabel();
        registrationDateTextField = new javax.swing.JTextField();
        registerMemberButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register Member");
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

        registrationDateLabel.setBackground(new java.awt.Color(0, 204, 51));
        registrationDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrationDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationDateLabel.setText("Registration Date");

        registerMemberButton.setBackground(new java.awt.Color(0, 0, 0));
        registerMemberButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerMemberButton.setForeground(new java.awt.Color(255, 255, 255));
        registerMemberButton.setText("Add");
        registerMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMemberButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(classIDLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MemberIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrationDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memberIDTextField)
                            .addComponent(classIDTextField)
                            .addComponent(registrationDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(registerMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memberIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(MemberIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(classIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrationDateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(registrationDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(registerMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMemberButtonActionPerformed
        String memberID = memberIDTextField.getText();
        String classID = classIDTextField.getText();
        String date = registrationDateTextField.getText();
        LocalDate registartionDate;
        
        boolean  flag = validateRegistration(memberID, classID, date);
        if(!flag)
            return;
        
        if(date.isEmpty())
            registartionDate = LocalDate.now();
        else
            registartionDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        
        flag = trainer.registerMemberForClass(memberID, classID, registartionDate);
        if(flag)
        {
            JOptionPane.showMessageDialog(null, "The member with ID = " + memberID + " has been successfuly registerd to class " + classID, "Information", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "The Class has no available seats", "Error", JOptionPane.ERROR_MESSAGE);
     
    }//GEN-LAST:event_registerMemberButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MemberIDLabel;
    private javax.swing.JLabel classIDLabel;
    private javax.swing.JTextField classIDTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField memberIDTextField;
    private javax.swing.JButton registerMemberButton;
    private javax.swing.JLabel registrationDateLabel;
    private javax.swing.JTextField registrationDateTextField;
    // End of variables declaration//GEN-END:variables
}
