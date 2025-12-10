
package Finals;

/**
 *
 * @author Dell
 */
public class DashboardFrame extends javax.swing.JFrame {

    /**
     * Creates new form DashboardFrame
     */
    public DashboardFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblGreeting = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        btnCourseCatalog = new javax.swing.JButton();
        btnRecommendationTest = new javax.swing.JButton();
        btnSavedSubjects = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        InfoPanel = new javax.swing.JPanel();
        lblTips = new javax.swing.JLabel();
        lbl2Tips = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        HeaderPanel.setBackground(new java.awt.Color(0, 204, 255));

        lblGreeting.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblGreeting.setText("Hello, <StudentName> (ID: <StudentID>)");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLogo)
                .addGap(39, 39, 39)
                .addComponent(lblGreeting)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblLogo))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblGreeting)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnCourseCatalog.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnCourseCatalog.setText("Course Catalog");
        btnCourseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseCatalogActionPerformed(evt);
            }
        });

        btnRecommendationTest.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnRecommendationTest.setText("Recommendation Test");
        btnRecommendationTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecommendationTestActionPerformed(evt);
            }
        });

        btnSavedSubjects.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnSavedSubjects.setText("Saved Subjects");
        btnSavedSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavedSubjectsActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnProfile.setText("My Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCourseCatalog)
                    .addComponent(btnSavedSubjects))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRecommendationTest)
                    .addComponent(btnProfile))
                .addGap(54, 54, 54))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCourseCatalog)
                    .addComponent(btnRecommendationTest))
                .addGap(60, 60, 60)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavedSubjects)
                    .addComponent(btnProfile))
                .addGap(104, 104, 104))
        );

        InfoPanel.setBackground(new java.awt.Color(51, 204, 255));

        lblTips.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTips.setText("Tips: Complete the Recommendation Test to generate");

        lbl2Tips.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl2Tips.setText("personalized course suggestions.");

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
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseCatalogActionPerformed
        new CatalogFrame().setVisible(true);
    }//GEN-LAST:event_btnCourseCatalogActionPerformed

    private void btnRecommendationTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecommendationTestActionPerformed
        new RecommendationTestFrame().setVisible(true);
    }//GEN-LAST:event_btnRecommendationTestActionPerformed

    private void btnSavedSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavedSubjectsActionPerformed
        new SavedSubjectsFrame().setVisible(true);
    }//GEN-LAST:event_btnSavedSubjectsActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        new ProfileFrame().setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new DashboardFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JButton btnCourseCatalog;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRecommendationTest;
    private javax.swing.JButton btnSavedSubjects;
    private javax.swing.JLabel lbl2Tips;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTips;
    // End of variables declaration//GEN-END:variables
}
