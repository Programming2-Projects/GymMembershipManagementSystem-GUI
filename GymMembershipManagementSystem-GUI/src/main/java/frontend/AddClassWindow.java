package frontend;
import backend.*;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class AddClassWindow extends javax.swing.JDialog {
    TrainerRole trainer;
    
    public AddClassWindow(TrainerRole trainer) {
        this.trainer = trainer;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private boolean validateClass(String classID, String name, String trainerID, String duration, String maxPartipants) {
        if(classID.isEmpty() || name.isEmpty() || trainerID.isEmpty() || duration.isEmpty() || maxPartipants.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Some Fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidID(classID, 'C'))
        {
            JOptionPane.showMessageDialog(null, "Invalid Class ID", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidID(trainerID, 'T'))
        {
            JOptionPane.showMessageDialog(null, "Invalid Trainer ID", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(!Validator.isValidName(name))
        {
            JOptionPane.showMessageDialog(null, "Invalid Name", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try {
            if(Integer.parseInt(duration) < 5)
                throw new NumberFormatException();
        } catch (NumberFormatException  e) {
            JOptionPane.showMessageDialog(null, "Invalid Duration", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try {
            if(Integer.parseInt(maxPartipants) < 1)
                throw new NumberFormatException ();
        } catch (NumberFormatException  e) {
            JOptionPane.showMessageDialog(null, "Invalid Max. Participants", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        classIDTextField = new javax.swing.JTextField();
        classNameTextField = new javax.swing.JTextField();
        trainerIDTextField = new javax.swing.JTextField();
        durationTextField = new javax.swing.JTextField();
        maxParticipantsTextField = new javax.swing.JTextField();
        addClassButton = new javax.swing.JButton();
        ClassIDLabel = new java.awt.Label();
        ClassNameLabel = new java.awt.Label();
        TrainerIDLabel = new java.awt.Label();
        DurationLabel = new java.awt.Label();
        MaxParticipantsLabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Class");
        setLocation(new java.awt.Point(500, 150));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        addClassButton.setBackground(new java.awt.Color(0, 0, 0));
        addClassButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addClassButton.setForeground(new java.awt.Color(255, 255, 255));
        addClassButton.setText("Add");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        ClassIDLabel.setAlignment(java.awt.Label.CENTER);
        ClassIDLabel.setBackground(new java.awt.Color(204, 255, 204));
        ClassIDLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ClassIDLabel.setText("Class ID");

        ClassNameLabel.setAlignment(java.awt.Label.CENTER);
        ClassNameLabel.setBackground(new java.awt.Color(204, 255, 204));
        ClassNameLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ClassNameLabel.setText("Class Name");

        TrainerIDLabel.setAlignment(java.awt.Label.CENTER);
        TrainerIDLabel.setBackground(new java.awt.Color(204, 255, 204));
        TrainerIDLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TrainerIDLabel.setText("Trainer ID");

        DurationLabel.setAlignment(java.awt.Label.CENTER);
        DurationLabel.setBackground(new java.awt.Color(204, 255, 204));
        DurationLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DurationLabel.setText("Duration");

        MaxParticipantsLabel.setAlignment(java.awt.Label.CENTER);
        MaxParticipantsLabel.setBackground(new java.awt.Color(204, 255, 204));
        MaxParticipantsLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MaxParticipantsLabel.setText("Max. Participants");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClassIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClassNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TrainerIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DurationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaxParticipantsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classIDTextField)
                    .addComponent(classNameTextField)
                    .addComponent(trainerIDTextField)
                    .addComponent(durationTextField)
                    .addComponent(maxParticipantsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(classIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ClassIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trainerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrainerIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DurationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maxParticipantsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaxParticipantsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        String classID = classIDTextField.getText();
        String className = classNameTextField.getText();
        String trainerID = trainerIDTextField.getText();
        String duration = durationTextField.getText();
        String maxParticipants = maxParticipantsTextField.getText();
        
        boolean  flag = validateClass(classID, className, trainerID, duration, maxParticipants);
        if(!flag)
            return;
                    
        flag = trainer.addClass(classID, className, trainerID, Integer.parseInt(duration), Integer.parseInt(maxParticipants));
        if(flag)
        {
            JOptionPane.showMessageDialog(null, "The Class with ID = " + classID + " has been successfuly added", "Information", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "The Class with ID = " + classID + " already exists", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_addClassButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label ClassIDLabel;
    private java.awt.Label ClassNameLabel;
    private java.awt.Label DurationLabel;
    private java.awt.Label MaxParticipantsLabel;
    private java.awt.Label TrainerIDLabel;
    private javax.swing.JButton addClassButton;
    private javax.swing.JTextField classIDTextField;
    private javax.swing.JTextField classNameTextField;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField maxParticipantsTextField;
    private javax.swing.JTextField trainerIDTextField;
    // End of variables declaration//GEN-END:variables
}
