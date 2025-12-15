
package Finals;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class SavedSubjectsFrame extends javax.swing.JFrame {

    // Default constructor uses CurrentUser
    public SavedSubjectsFrame() {

        initComponents();
        this.setLocationRelativeTo(null);

        tblSavedSubjects.setModel(new DefaultTableModel(new Object[]{"Course"}, 0));
        populateTable(CurrentUser.savedCourses);
    }

    // Constructor with parameters
    public SavedSubjectsFrame(String fullName, String studentID, String email, String username, ArrayList<String> courses) {

        initComponents();
        this.setLocationRelativeTo(null);

        tblSavedSubjects.setModel(new DefaultTableModel(new Object[]{"Course"}, 0));
        populateTable(courses);
    }


    // Populate JTable from a list
    private void populateTable(ArrayList<String> courses) {
        DefaultTableModel model = (DefaultTableModel) tblSavedSubjects.getModel();
        model.setRowCount(0); // clear existing rows

        if (courses == null || courses.isEmpty()) {
            model.addRow(new Object[]{"No saved courses"});
            return;
        }

        for (String course : courses) {
            model.addRow(new Object[]{course});
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        SavedPanel = new javax.swing.JPanel();
        scrollPaneSaved = new javax.swing.JScrollPane();
        tblSavedSubjects = new javax.swing.JTable();
        ButtonPanel = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 646));
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(0, 102, 204));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(900, 130));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Saved Recommendations");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblLogo)
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblTitle))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        SavedPanel.setBackground(new java.awt.Color(255, 255, 255));
        SavedPanel.setPreferredSize(new java.awt.Dimension(900, 390));

        tblSavedSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        scrollPaneSaved.setViewportView(tblSavedSubjects);

        javax.swing.GroupLayout SavedPanelLayout = new javax.swing.GroupLayout(SavedPanel);
        SavedPanel.setLayout(SavedPanelLayout);
        SavedPanelLayout.setHorizontalGroup(
            SavedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SavedPanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(scrollPaneSaved, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        SavedPanelLayout.setVerticalGroup(
            SavedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SavedPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(scrollPaneSaved, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(900, 140));

        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(0, 102, 204));
        btnReturn.setText("RETURN");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(btnReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReturn)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SavedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SavedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
                                               
    DashboardFrame dashboard = new DashboardFrame();
    dashboard.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new SavedSubjectsFrame().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel SavedPanel;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollPaneSaved;
    private javax.swing.JTable tblSavedSubjects;
    // End of variables declaration//GEN-END:variables
}
