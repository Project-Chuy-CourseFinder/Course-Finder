
package Finals;

public class RecommendationTestFrame extends javax.swing.JFrame {

    private final String fullName;
    private final String studentID;
    private final String email;
    private final String username;

    public RecommendationTestFrame(String fullName, String studentID, String email, String username) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        QuestionsPanel = new javax.swing.JPanel();
        lblQ1 = new javax.swing.JLabel();
        rbTech = new javax.swing.JRadioButton();
        rbBusiness = new javax.swing.JRadioButton();
        rbHumanities = new javax.swing.JRadioButton();
        lblQ2 = new javax.swing.JLabel();
        cbMath = new javax.swing.JCheckBox();
        cbEnglish = new javax.swing.JCheckBox();
        cbICT = new javax.swing.JCheckBox();
        cbResearch = new javax.swing.JCheckBox();
        cbSocialScience = new javax.swing.JCheckBox();
        lblQ3 = new javax.swing.JLabel();
        rbBeginner = new javax.swing.JRadioButton();
        rbIntermediate = new javax.swing.JRadioButton();
        rbAdvanced = new javax.swing.JRadioButton();
        lblQ4 = new javax.swing.JLabel();
        rbLight = new javax.swing.JRadioButton();
        rbModerate = new javax.swing.JRadioButton();
        rbFullLoad = new javax.swing.JRadioButton();
        ButtonPanel = new javax.swing.JPanel();
        btnGenerateRecommendation = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(0, 102, 204));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(900, 115));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Academic Recommendation Assessment");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N
        lblLogo.setText("jLabel1");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle)
                .addContainerGap(97, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        QuestionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        QuestionsPanel.setPreferredSize(new java.awt.Dimension(900, 450));

        lblQ1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ1.setForeground(new java.awt.Color(0, 102, 204));
        lblQ1.setText("1. What field are you most interested in?");

        rbTech.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbTech.setForeground(new java.awt.Color(0, 102, 204));
        rbTech.setText("Technology");
        rbTech.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbBusiness.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbBusiness.setForeground(new java.awt.Color(0, 102, 204));
        rbBusiness.setText("Business");
        rbBusiness.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbHumanities.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbHumanities.setForeground(new java.awt.Color(0, 102, 204));
        rbHumanities.setText("Humanities");
        rbHumanities.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblQ2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ2.setForeground(new java.awt.Color(0, 102, 204));
        lblQ2.setText("2. Which subjects do you excel at?");

        cbMath.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbMath.setForeground(new java.awt.Color(0, 102, 204));
        cbMath.setText("Math");
        cbMath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMathActionPerformed(evt);
            }
        });

        cbEnglish.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbEnglish.setForeground(new java.awt.Color(0, 102, 204));
        cbEnglish.setText("English");
        cbEnglish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbICT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbICT.setForeground(new java.awt.Color(0, 102, 204));
        cbICT.setText("ICT");
        cbICT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbResearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbResearch.setForeground(new java.awt.Color(0, 102, 204));
        cbResearch.setText("Research");
        cbResearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbResearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbResearchActionPerformed(evt);
            }
        });

        cbSocialScience.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbSocialScience.setForeground(new java.awt.Color(0, 102, 204));
        cbSocialScience.setText("Social Science");
        cbSocialScience.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblQ3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ3.setForeground(new java.awt.Color(0, 102, 204));
        lblQ3.setText("3. Preferred course difficulty:");

        rbBeginner.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbBeginner.setForeground(new java.awt.Color(0, 102, 204));
        rbBeginner.setText("Beginner");
        rbBeginner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbIntermediate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbIntermediate.setForeground(new java.awt.Color(0, 102, 204));
        rbIntermediate.setText("Intermediate");
        rbIntermediate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIntermediateActionPerformed(evt);
            }
        });

        rbAdvanced.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbAdvanced.setForeground(new java.awt.Color(0, 102, 204));
        rbAdvanced.setText("Advanced");
        rbAdvanced.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblQ4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ4.setForeground(new java.awt.Color(0, 102, 204));
        lblQ4.setText("4. Preferred credit load per semester:");

        rbLight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbLight.setForeground(new java.awt.Color(0, 102, 204));
        rbLight.setText("Light (9-12 units)");
        rbLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLightActionPerformed(evt);
            }
        });

        rbModerate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbModerate.setForeground(new java.awt.Color(0, 102, 204));
        rbModerate.setText("Moderate (12-18 units)");
        rbModerate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbModerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbModerateActionPerformed(evt);
            }
        });

        rbFullLoad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbFullLoad.setForeground(new java.awt.Color(0, 102, 204));
        rbFullLoad.setText("Full Load (18-24 units)");
        rbFullLoad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout QuestionsPanelLayout = new javax.swing.GroupLayout(QuestionsPanel);
        QuestionsPanel.setLayout(QuestionsPanelLayout);
        QuestionsPanelLayout.setHorizontalGroup(
            QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(cbICT)
                .addGap(45, 45, 45)
                .addComponent(cbMath)
                .addGap(84, 84, 84)
                .addComponent(cbEnglish)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(cbSocialScience)
                .addGap(112, 112, 112))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(cbResearch))
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQ3)
                            .addComponent(lblQ4)
                            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                                        .addComponent(lblQ2)
                                        .addGap(49, 49, 49))
                                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                                        .addComponent(rbTech)
                                        .addGap(34, 34, 34)
                                        .addComponent(rbBusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)))
                                .addComponent(rbHumanities))
                            .addComponent(lblQ1)))
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(rbAdvanced)
                        .addGap(73, 73, 73)
                        .addComponent(rbBeginner)
                        .addGap(58, 58, 58)
                        .addComponent(rbIntermediate))
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbModerate)
                            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                                .addComponent(rbLight)
                                .addGap(76, 76, 76)
                                .addComponent(rbFullLoad)))))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        QuestionsPanelLayout.setVerticalGroup(
            QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblQ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTech)
                    .addComponent(rbBusiness)
                    .addComponent(rbHumanities))
                .addGap(28, 28, 28)
                .addComponent(lblQ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbICT)
                    .addComponent(cbMath)
                    .addComponent(cbEnglish)
                    .addComponent(cbResearch)
                    .addComponent(cbSocialScience))
                .addGap(29, 29, 29)
                .addComponent(lblQ3)
                .addGap(12, 12, 12)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAdvanced)
                    .addComponent(rbBeginner)
                    .addComponent(rbIntermediate))
                .addGap(29, 29, 29)
                .addComponent(lblQ4)
                .addGap(14, 14, 14)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLight)
                    .addComponent(rbFullLoad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbModerate)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(900, 123));

        btnGenerateRecommendation.setBackground(new java.awt.Color(0, 102, 204));
        btnGenerateRecommendation.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGenerateRecommendation.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateRecommendation.setText("GENERATE RECOMMENDATION");
        btnGenerateRecommendation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerateRecommendation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateRecommendationActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 255));
        btnBack.setText("BACK");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(107, 107, 107)
                .addComponent(btnGenerateRecommendation)
                .addGap(150, 150, 150))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerateRecommendation)
                    .addComponent(btnBack))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QuestionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        HeaderPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIntermediateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIntermediateActionPerformed

    private void cbResearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbResearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbResearchActionPerformed

    private void rbModerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbModerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbModerateActionPerformed

    private void cbMathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMathActionPerformed

    private void rbLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLightActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       new DashboardFrame(fullName, studentID, email, username).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGenerateRecommendationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRecommendationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateRecommendationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel QuestionsPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateRecommendation;
    private javax.swing.JCheckBox cbEnglish;
    private javax.swing.JCheckBox cbICT;
    private javax.swing.JCheckBox cbMath;
    private javax.swing.JCheckBox cbResearch;
    private javax.swing.JCheckBox cbSocialScience;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQ4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbAdvanced;
    private javax.swing.JRadioButton rbBeginner;
    private javax.swing.JRadioButton rbBusiness;
    private javax.swing.JRadioButton rbFullLoad;
    private javax.swing.JRadioButton rbHumanities;
    private javax.swing.JRadioButton rbIntermediate;
    private javax.swing.JRadioButton rbLight;
    private javax.swing.JRadioButton rbModerate;
    private javax.swing.JRadioButton rbTech;
    // End of variables declaration//GEN-END:variables
}
