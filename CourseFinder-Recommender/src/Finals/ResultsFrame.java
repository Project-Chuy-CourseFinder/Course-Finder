
package Finals;


import javax.swing.DefaultListModel;
import java.io.*;
import java.util.ArrayList;

public class ResultsFrame extends javax.swing.JFrame {
    
    private String fullName;
    private String studentID;
    private String email;
    private String username;

    public ResultsFrame(String fullName, String studentID, String email, String username) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;

        // Make sure savedCourses is initialized
        if (CurrentUser.savedCourses == null) {
            CurrentUser.savedCourses = new ArrayList<>();
        }

        // Load saved courses from file into CurrentUser
        CurrentUser.savedCourses = loadSavedResultsFromTxt();
    }

    public ResultsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        if (CurrentUser.savedCourses == null) {
            CurrentUser.savedCourses = new ArrayList<>();
        }
    }

    // Set recommended courses passed from RecommendationTestFrame
    public void setRecommendations(ArrayList<String> courses) {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String course : courses) {
            model.addElement(course);
        }
        listRecommendedCourses.setModel(model);
    }

    // Save recommended courses to TXT and memory
    private void saveToTxt() {
        try {
            File file = new File("src/Finals/saved_courses.txt");
            if (!file.exists()) file.createNewFile();

            try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
                for (int i = 0; i < listRecommendedCourses.getModel().getSize(); i++) {
                    String course = listRecommendedCourses.getModel().getElementAt(i);

                    // Save only if not already saved
                    if (!CurrentUser.savedCourses.contains(course)) {
                        writer.println(course);
                        CurrentUser.savedCourses.add(course);
                    }
                }
                writer.println("-----------------------------------");
            }
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error saving to file: " + e.getMessage());
        }
    }

    // Load saved courses from TXT into ArrayList
    private ArrayList<String> loadSavedResultsFromTxt() {
        ArrayList<String> list = new ArrayList<>();
        try {
            File file = new File("src/Finals/saved_courses.txt"); // correct path
            if (!file.exists()) return list;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (!line.trim().equals("-----------------------------------") && !line.trim().isEmpty())
                        list.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading saved subjects: " + e.getMessage());
        }
        return list;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        ListPanel = new javax.swing.JPanel();
        scrollPaneResults = new javax.swing.JScrollPane();
        listRecommendedCourses = new javax.swing.JList<>();
        ButtonPanel = new javax.swing.JPanel();
        btnSaveResults = new javax.swing.JButton();
        btnBackToDashboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(0, 102, 204));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(900, 130));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Your Recommended Courses");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N
        lblLogo.setText("jLabel1");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(16, 16, 16))
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ListPanel.setBackground(new java.awt.Color(255, 255, 255));
        ListPanel.setPreferredSize(new java.awt.Dimension(900, 400));
        ListPanel.setVerifyInputWhenFocusTarget(false);

        listRecommendedCourses.setModel(new javax.swing.DefaultListModel<>()
        );
        scrollPaneResults.setViewportView(listRecommendedCourses);

        javax.swing.GroupLayout ListPanelLayout = new javax.swing.GroupLayout(ListPanel);
        ListPanel.setLayout(ListPanelLayout);
        ListPanelLayout.setHorizontalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListPanelLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(scrollPaneResults, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        ListPanelLayout.setVerticalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(scrollPaneResults, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(900, 120));

        btnSaveResults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSaveResults.setForeground(new java.awt.Color(0, 102, 204));
        btnSaveResults.setText("SAVE RESULTS");
        btnSaveResults.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveResultsActionPerformed(evt);
            }
        });

        btnBackToDashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBackToDashboard.setForeground(new java.awt.Color(0, 102, 204));
        btnBackToDashboard.setText("BACK TO DASHBOARD");
        btnBackToDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(btnSaveResults)
                .addGap(97, 97, 97)
                .addComponent(btnBackToDashboard)
                .addGap(138, 138, 138))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveResults)
                    .addComponent(btnBackToDashboard))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveResultsActionPerformed
       saveToTxt();

        // Open SavedSubjectsFrame with current saved courses
        SavedSubjectsFrame savedFrame = new SavedSubjectsFrame(
                fullName,
                studentID,
                email,
                username,
                CurrentUser.savedCourses
        );
        savedFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSaveResultsActionPerformed

    
    
    private void btnBackToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDashboardActionPerformed
        new DashboardFrame().setVisible(true);
    }//GEN-LAST:event_btnBackToDashboardActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() ->
                new ResultsFrame("John Mark", "2025001", "john@example.com", "johnmark").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel ListPanel;
    private javax.swing.JButton btnBackToDashboard;
    private javax.swing.JButton btnSaveResults;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> listRecommendedCourses;
    private javax.swing.JScrollPane scrollPaneResults;
    // End of variables declaration//GEN-END:variables
}
