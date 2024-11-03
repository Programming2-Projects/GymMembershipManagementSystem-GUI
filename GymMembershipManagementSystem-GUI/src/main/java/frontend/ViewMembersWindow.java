package frontend;
import backend.TrainerRole;
import backend.Member;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class ViewMembersWindow extends javax.swing.JDialog {
    TrainerRole trainer;
    
    public ViewMembersWindow(TrainerRole trainer) {
        this.trainer = trainer;
        initComponents();
        setVisible(true);
        displayTable();
    }
    
    private void displayTable () {
        ArrayList<Member> members = trainer.getListOfMembers();
        DefaultTableModel model = (DefaultTableModel) viewMembersTable.getModel();
        for(Member member : members)
            model.addRow(new Object[]{
                member.getMemberId(),
                member.getName(),
                member.getEmail(),
                member.getMembershipType(),
                member.getPhoneNumber(),
                member.getStatus()});
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewMembersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Members");
        setLocation(new java.awt.Point(500, 150));

        viewMembersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Membership Type", "Phone Number", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        viewMembersTable.setRowSelectionAllowed(false);
        viewMembersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        viewMembersTable.setShowGrid(true);
        jScrollPane1.setViewportView(viewMembersTable);
        if (viewMembersTable.getColumnModel().getColumnCount() > 0) {
            viewMembersTable.getColumnModel().getColumn(2).setMinWidth(120);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewMembersTable;
    // End of variables declaration//GEN-END:variables
}
