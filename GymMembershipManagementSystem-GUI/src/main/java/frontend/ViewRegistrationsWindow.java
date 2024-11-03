package frontend;
import backend.TrainerRole;
import backend.MemberClassRegistration;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ViewRegistrationsWindow extends javax.swing.JDialog {
    TrainerRole trainer;

    public ViewRegistrationsWindow(TrainerRole trainer) {
        this.trainer = trainer;
        initComponents();
        setVisible(true);
        displayTable();
    }
    
    private void displayTable () {
        ArrayList<MemberClassRegistration> registrations = trainer.getListOfRegistrations();
        DefaultTableModel model = (DefaultTableModel) viewClassesTable.getModel();
        for(MemberClassRegistration registration : registrations)
            model.addRow(new Object[]{
                registration.getMemberID(),
                registration.getClassID(),
                registration.getRegistrationDate()});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewClassesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Registrations");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 150));

        viewClassesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Class ID", "Registration Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        viewClassesTable.setRowSelectionAllowed(false);
        viewClassesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        viewClassesTable.setShowGrid(true);
        jScrollPane1.setViewportView(viewClassesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewClassesTable;
    // End of variables declaration//GEN-END:variables
}
