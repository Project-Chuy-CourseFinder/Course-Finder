
package Finals;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class SavedSubjectsFrame extends javax.swing.JFrame {

    private final String fullName;
    private final String studentID;
    private final String email;
    private final String username;

    /**
     * Constructor with user info only
     */
    public SavedSubjectsFrame(String fullName, String studentID, String email, String username) {
        this(fullName, studentID, email, username, new ArrayList<>()); // call main constructor with empty list
    }

    /**
     * Constructor with user info + saved courses
     */
    public SavedSubjectsFrame(String fullName, String studentID, String email, String username, ArrayList<String> savedCourses) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;

        initComponents();
        this.setLocationRelativeTo(null);

        populateTable(savedCourses);
    }

    /**
     * Populates the JTable with saved courses
     */
    private void populateTable(ArrayList<String> courses) {
        DefaultTableModel model = (DefaultTableModel) tblSavedSubjects.getModel();
        model.setRowCount(0); // clear existing rows

        int colCount = model.getColumnCount();
        int rowCount = (int) Math.ceil((double) courses.size() / colCount);

        for (int i = 0; i < rowCount; i++) {
            Object[] row = new Object[colCount];
            for (int j = 0; j < colCount; j++) {
                int index = i * colCount + j;
                if (index < courses.size()) {
                    row[j] = courses.get(index);
                } else {
                    row[j] = "";
                }
            }
            model.addRow(row);
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
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(0, 204, 255));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(900, 130));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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
        btnReturn.setText("RETURN");
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
                .addGap(373, 373, 373)
                .addComponent(btnReturn)
                .addGap(0, 0, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        new DashboardFrame(fullName, studentID, email, username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new SavedSubjectsFrame("John Mark","2025001","john@example.com","johnmark", new ArrayList<>()).setVisible(true));
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
