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
        memberIDTextField = new javax.swing.JTextField();
        classIDTextField = new javax.swing.JTextField();
        registrationDateTextField = new javax.swing.JTextField();
        registerMemberButton = new javax.swing.JButton();
        memberIDlabel = new java.awt.Label();
        classIDlabel = new java.awt.Label();
        registrationDatelabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register Member");
        setLocation(new java.awt.Point(500, 150));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        registerMemberButton.setBackground(new java.awt.Color(0, 0, 0));
        registerMemberButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerMemberButton.setForeground(new java.awt.Color(255, 255, 255));
        registerMemberButton.setText("Add");
        registerMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMemberButtonActionPerformed(evt);
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

        registrationDatelabel.setAlignment(java.awt.Label.CENTER);
        registrationDatelabel.setBackground(new java.awt.Color(204, 255, 204));
        registrationDatelabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        registrationDatelabel.setText("Registration Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(memberIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrationDatelabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memberIDTextField)
                            .addComponent(classIDTextField)
                            .addComponent(registrationDateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(memberIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(classIDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrationDateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(registrationDatelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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
    private javax.swing.JTextField classIDTextField;
    private java.awt.Label classIDlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField memberIDTextField;
    private java.awt.Label memberIDlabel;
    private javax.swing.JButton registerMemberButton;
    private javax.swing.JTextField registrationDateTextField;
    private java.awt.Label registrationDatelabel;
    // End of variables declaration//GEN-END:variables
}
