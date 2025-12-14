
package Finals;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class DashboardFrame extends javax.swing.JFrame {

   // =========================
    // User info variables
    // =========================
    private final String fullName;
    private final String studentID;
    private final String email;
    private final String username;

    // =========================
    // Constructor
    // =========================
     public DashboardFrame(String fullName, String studentID, String email, String username) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;

        initComponents();         
        this.setLocationRelativeTo(null);

        // Set greeting label
        lblGreeting.setText("Hello, " + fullName + " (ID: " + studentID + ")");

        // Buttons styling with subtext
        String mainFont = "Segoe UI Light";
        String subTextSize = "14px";

        btnCourseCatalog.setText("<html><center>COURSE<br>CATALOG<br>"
                + "<small style='font-family:" + mainFont + "; font-size:" + subTextSize + "; color:#007BFF;'>Explore Saved →</small></center></html>");

        btnRecommendationTest.setText("<html><center>RECOMMENDATION<br>TEST<br>"
                + "<small style='font-family:" + mainFont + "; font-size:" + subTextSize + "; color:#28A745;'>Start Assessment →</small></center></html>");

        btnSavedSubjects.setText("<html><center>SAVED<br>SUBJECTS<br>"
                + "<small style='font-family:" + mainFont + "; font-size:" + subTextSize + "; color:#6F42C1;'>View Saved →</small></center></html>");

        btnProfile.setText("<html><center>MY<br>PROFILE<br>"
                + "<small style='font-family:" + mainFont + "; font-size:" + subTextSize + "; color:#FD7E14;'>View Profile →</small></center></html>");

        jLabel2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 30));
        jLabel2.setForeground(new Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("<html><center>"
                + "<font size='10'><b>Welcome to Your Learning PATH</b></font><br>"
                + "<font size='5' color='#505050'>Explore courses, track your progress, and discover new academic opportunities tailored just for you</font>"
                + "</center></html>");
}
    // =========================
    // Load saved subjects from file
    // =========================


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblGreeting = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Signout = new javax.swing.JButton();
        ButtonPanel = new javax.swing.JPanel();
        btnCourseCatalog = new javax.swing.JButton();
        btnRecommendationTest = new javax.swing.JButton();
        btnSavedSubjects = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        InfoPanel = new javax.swing.JPanel();
        lblTips = new javax.swing.JLabel();
        lbl2Tips = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        HeaderPanel.setBackground(new java.awt.Color(0, 102, 204));

        lblGreeting.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblGreeting.setForeground(new java.awt.Color(255, 255, 255));
        lblGreeting.setText("Hello, <StudentName> (ID: <StudentID>)");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Academic Portal");

        Signout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Signout.setForeground(new java.awt.Color(0, 102, 204));
        Signout.setText("Sign Out");
        Signout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblGreeting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(Signout)
                .addGap(46, 46, 46))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Signout)
                .addGap(52, 52, 52))
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGreeting))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnCourseCatalog.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnCourseCatalog.setForeground(new java.awt.Color(51, 51, 51));
        btnCourseCatalog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course.png"))); // NOI18N
        btnCourseCatalog.setText("Course Catalog");
        btnCourseCatalog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCourseCatalog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCourseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseCatalogActionPerformed(evt);
            }
        });

        btnRecommendationTest.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnRecommendationTest.setForeground(new java.awt.Color(51, 51, 51));
        btnRecommendationTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/test.png"))); // NOI18N
        btnRecommendationTest.setText("Recommendation Test");
        btnRecommendationTest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRecommendationTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecommendationTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecommendationTestActionPerformed(evt);
            }
        });

        btnSavedSubjects.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnSavedSubjects.setForeground(new java.awt.Color(51, 51, 51));
        btnSavedSubjects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/saved.png"))); // NOI18N
        btnSavedSubjects.setText("Saved Subjects");
        btnSavedSubjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSavedSubjects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSavedSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavedSubjectsActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(51, 51, 51));
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/profile.png"))); // NOI18N
        btnProfile.setText("My Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Welcome to Your Learning PATH");

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCourseCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSavedSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRecommendationTest, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCourseCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecommendationTest, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavedSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        InfoPanel.setBackground(new java.awt.Color(0, 102, 204));

        lblTips.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTips.setForeground(new java.awt.Color(255, 255, 255));
        lblTips.setText("Tips: Complete the Recommendation Test to generate");

        lbl2Tips.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl2Tips.setForeground(new java.awt.Color(255, 255, 255));
        lbl2Tips.setText("       personalized course suggestions.");

        javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(InfoPanel);
        InfoPanel.setLayout(InfoPanelLayout);
        InfoPanelLayout.setHorizontalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(lbl2Tips)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTips)
                .addGap(154, 154, 154))
        );
        InfoPanelLayout.setVerticalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTips)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2Tips)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseCatalogActionPerformed
       new CatalogFrame(fullName, studentID, email, username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCourseCatalogActionPerformed

    private void btnRecommendationTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecommendationTestActionPerformed
         new RecommendationTestFrame(fullName, studentID, email, username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRecommendationTestActionPerformed

    private void btnSavedSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavedSubjectsActionPerformed
        new SavedSubjectsFrame(
        fullName, 
        studentID, 
        email, 
        username, 
        CurrentUser.savedCourses
    ).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnSavedSubjectsActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        new ProfileFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProfileActionPerformed

    private void SignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoutActionPerformed
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_SignoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Example usage:
        java.awt.EventQueue.invokeLater(() -> new DashboardFrame("John Mark","2025001","john@example.com","johnmark").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JButton Signout;
    private javax.swing.JButton btnCourseCatalog;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRecommendationTest;
    private javax.swing.JButton btnSavedSubjects;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl2Tips;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblTips;
    // End of variables declaration//GEN-END:variables

    private void setButtonIcon(JButton btnCourseCatalog, String iconcoursepng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
