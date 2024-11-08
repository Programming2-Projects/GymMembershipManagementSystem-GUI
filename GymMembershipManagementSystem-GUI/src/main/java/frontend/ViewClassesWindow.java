package frontend;
import backend.TrainerRole;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ViewClassesWindow extends javax.swing.JDialog {
    TrainerRole trainer;
    public ViewClassesWindow(TrainerRole trainer) {
        this.trainer = trainer;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        displayTable();
    }
    
    private void displayTable () {
        ArrayList<backend.Class> classes = trainer.getListOfClasses();
        DefaultTableModel model = (DefaultTableModel) viewClassesTable.getModel();
        for(backend.Class c : classes)
            model.addRow(new Object[]{
                c.getClassID(),
                c.getClassName(),
                c.getTrainerID(),
                c.getDuration(),
                c.getAvailableSeats()});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewClassesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Classes");
        setLocation(new java.awt.Point(500, 150));

        viewClassesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class ID", "Class Name", "Trainer ID", "Duration", "Available Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewClassesTable;
    // End of variables declaration//GEN-END:variables
}
