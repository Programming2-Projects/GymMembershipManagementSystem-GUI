package frontend;
import backend.*;
import javax.swing.JOptionPane;

public class AddMemberWindow extends javax.swing.JDialog {
    TrainerRole trainer;

    public AddMemberWindow(TrainerRole trainer) {
        this.trainer = trainer;
        initComponents();
        setVisible(true);
 
    }
    
    private boolean validateMember(String id, String name, String membershipType, String email, String phoneNumber, String status) {
        if(id.isEmpty() || name.isEmpty() || email.isEmpty() || membershipType.isEmpty() || phoneNumber.isEmpty() || status.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Some Fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidID(id, 'M'))
        {
            JOptionPane.showMessageDialog(null, "Invalid ID", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidEmail(email))
        {
            JOptionPane.showMessageDialog(null, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidName(name))
        {
            JOptionPane.showMessageDialog(null, "Invalid Name", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidMembershipType(membershipType))
        {
            JOptionPane.showMessageDialog(null, "Invalid Membership Type", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidPhoneNumber(phoneNumber))
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidMembershipStatus(status))
        {
            JOptionPane.showMessageDialog(null, "Invalid Status", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        idTextArea = new javax.swing.JTextArea();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        membershipTypeLabel = new javax.swing.JLabel();
        addMemebrButton = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        statusTextField = new javax.swing.JTextField();
        membershipTypeTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();

        idTextArea.setColumns(20);
        idTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idTextArea.setLineWrap(true);
        idTextArea.setRows(5);
        idTextArea.setToolTipText("");
        idTextArea.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(idTextArea);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Member");
        setLocation(new java.awt.Point(500, 150));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        emailLabel.setBackground(new java.awt.Color(0, 204, 51));
        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("Email");

        nameLabel.setBackground(new java.awt.Color(0, 204, 51));
        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");

        idLabel.setBackground(new java.awt.Color(153, 255, 153));
        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("ID");

        statusLabel.setBackground(new java.awt.Color(0, 204, 51));
        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText("Status");

        phoneNumberLabel.setBackground(new java.awt.Color(0, 204, 51));
        phoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneNumberLabel.setText("Phone Number");

        membershipTypeLabel.setBackground(new java.awt.Color(0, 204, 51));
        membershipTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        membershipTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        membershipTypeLabel.setText("Membership Type");

        addMemebrButton.setBackground(new java.awt.Color(0, 0, 0));
        addMemebrButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addMemebrButton.setForeground(new java.awt.Color(255, 255, 255));
        addMemebrButton.setText("Add");
        addMemebrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemebrButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(membershipTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statusTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(membershipTypeTextField)
                    .addComponent(emailTextField)
                    .addComponent(idTextField)
                    .addComponent(nameTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(addMemebrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(membershipTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membershipTypeTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusTextField))
                .addGap(18, 18, 18)
                .addComponent(addMemebrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMemebrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemebrButtonActionPerformed
        String id = idTextField.getText();
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String membershipType = membershipTypeTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();
        String status = statusTextField.getText();
        
        boolean  flag = validateMember(id, name, membershipType, email, phoneNumber, status);
        if(!flag)
            return;

        flag = trainer.addMember(id, name, membershipType, email, phoneNumber, status);
        if(flag)
        {
            JOptionPane.showMessageDialog(null, "The member with ID = " + id + " has been successfuly added", "Information", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "The member with ID = " + id + " already exists", "Error", JOptionPane.ERROR_MESSAGE);
    
    }//GEN-LAST:event_addMemebrButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemebrButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextArea idTextArea;
    private javax.swing.JTextField idTextField;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel membershipTypeLabel;
    private javax.swing.JTextField membershipTypeTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField statusTextField;
    // End of variables declaration//GEN-END:variables
}
