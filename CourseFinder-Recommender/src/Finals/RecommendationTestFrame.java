
package Finals;

import javax.swing.*;
import java.util.ArrayList;

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
        rbTechnology_IT_CS = new javax.swing.JRadioButton();
        rbBusiness_Management_Marketing = new javax.swing.JRadioButton();
        rbEducation_Teaching = new javax.swing.JRadioButton();
        rbHospitality_Tourism = new javax.swing.JRadioButton();
        rbCriminology = new javax.swing.JRadioButton();
        rbEngineering_Architecture_Mechanical = new javax.swing.JRadioButton();
        lblQ2 = new javax.swing.JLabel();
        cbMath = new javax.swing.JCheckBox();
        cbResearch = new javax.swing.JCheckBox();
        cbManagement_Marketing = new javax.swing.JCheckBox();
        cbHospitality_FoodServices = new javax.swing.JCheckBox();
        cbPhysics_EngineeringConcepts = new javax.swing.JCheckBox();
        cbEnglish = new javax.swing.JCheckBox();
        cbSocialScience = new javax.swing.JCheckBox();
        cbICT_Coding = new javax.swing.JCheckBox();
        lblQ3 = new javax.swing.JLabel();
        rbBeginner = new javax.swing.JRadioButton();
        rbIntermediate = new javax.swing.JRadioButton();
        rbAdvanced = new javax.swing.JRadioButton();
        lblQ4 = new javax.swing.JLabel();
        rbLight = new javax.swing.JRadioButton();
        rbModerate = new javax.swing.JRadioButton();
        rbFullLoad = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        ButtonPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnGenerateRecommendation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 850));
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
                .addGap(0, 4, Short.MAX_VALUE))
        );

        QuestionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        QuestionsPanel.setPreferredSize(new java.awt.Dimension(900, 500));

        lblQ1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ1.setForeground(new java.awt.Color(0, 102, 204));
        lblQ1.setText("1. What field are you most interested in?");

        rbTechnology_IT_CS.setBackground(new java.awt.Color(255, 255, 255));
        rbTechnology_IT_CS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbTechnology_IT_CS.setText("Technology / IT / CS");
        rbTechnology_IT_CS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbBusiness_Management_Marketing.setBackground(new java.awt.Color(255, 255, 255));
        rbBusiness_Management_Marketing.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbBusiness_Management_Marketing.setText("Business / Management / Marketing");
        rbBusiness_Management_Marketing.setBorderPainted(true);
        rbBusiness_Management_Marketing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbEducation_Teaching.setBackground(new java.awt.Color(255, 255, 255));
        rbEducation_Teaching.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbEducation_Teaching.setText("Education / Teaching");
        rbEducation_Teaching.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbHospitality_Tourism.setBackground(new java.awt.Color(255, 255, 255));
        rbHospitality_Tourism.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbHospitality_Tourism.setText("Hospitality / Tourism");
        rbHospitality_Tourism.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbCriminology.setBackground(new java.awt.Color(255, 255, 255));
        rbCriminology.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbCriminology.setText("Criminology");
        rbCriminology.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbEngineering_Architecture_Mechanical.setBackground(new java.awt.Color(255, 255, 255));
        rbEngineering_Architecture_Mechanical.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbEngineering_Architecture_Mechanical.setText("Engineering / Architecture / Mechanical");
        rbEngineering_Architecture_Mechanical.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbEngineering_Architecture_Mechanical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEngineering_Architecture_MechanicalActionPerformed(evt);
            }
        });

        lblQ2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ2.setForeground(new java.awt.Color(0, 102, 204));
        lblQ2.setText("2. Which subjects do you excel at?");

        cbMath.setBackground(new java.awt.Color(255, 255, 255));
        cbMath.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbMath.setText("Math");
        cbMath.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbMath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMathActionPerformed(evt);
            }
        });

        cbResearch.setBackground(new java.awt.Color(255, 255, 255));
        cbResearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbResearch.setText("Research");
        cbResearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbResearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbManagement_Marketing.setBackground(new java.awt.Color(255, 255, 255));
        cbManagement_Marketing.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbManagement_Marketing.setText("Management / Marketing");
        cbManagement_Marketing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbManagement_Marketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbManagement_MarketingActionPerformed(evt);
            }
        });

        cbHospitality_FoodServices.setBackground(new java.awt.Color(255, 255, 255));
        cbHospitality_FoodServices.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbHospitality_FoodServices.setText("Hospitality / Food Services");
        cbHospitality_FoodServices.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbHospitality_FoodServices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbPhysics_EngineeringConcepts.setBackground(new java.awt.Color(255, 255, 255));
        cbPhysics_EngineeringConcepts.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbPhysics_EngineeringConcepts.setText("Physics / Engineering Concepts");
        cbPhysics_EngineeringConcepts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbPhysics_EngineeringConcepts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbEnglish.setBackground(new java.awt.Color(255, 255, 255));
        cbEnglish.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbEnglish.setText("English");
        cbEnglish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnglishActionPerformed(evt);
            }
        });

        cbSocialScience.setBackground(new java.awt.Color(255, 255, 255));
        cbSocialScience.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbSocialScience.setText("Social Science");
        cbSocialScience.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbICT_Coding.setBackground(new java.awt.Color(255, 255, 255));
        cbICT_Coding.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbICT_Coding.setText("ICT / Coding");
        cbICT_Coding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblQ3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ3.setForeground(new java.awt.Color(0, 102, 204));
        lblQ3.setText("3. Preferred course difficulty:");

        rbBeginner.setBackground(new java.awt.Color(255, 255, 255));
        rbBeginner.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbBeginner.setText("Beginner");
        rbBeginner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbIntermediate.setBackground(new java.awt.Color(255, 255, 255));
        rbIntermediate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbIntermediate.setText("Intermediate");
        rbIntermediate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbAdvanced.setBackground(new java.awt.Color(255, 255, 255));
        rbAdvanced.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbAdvanced.setText("Advanced");
        rbAdvanced.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblQ4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ4.setForeground(new java.awt.Color(0, 102, 204));
        lblQ4.setText("4. Preferred credit load per semester:");

        rbLight.setBackground(new java.awt.Color(255, 255, 255));
        rbLight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbLight.setText("Light (9-12 units)");
        rbLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLightActionPerformed(evt);
            }
        });

        rbModerate.setBackground(new java.awt.Color(255, 255, 255));
        rbModerate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbModerate.setText("Moderate (12-18 units)");
        rbModerate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbModerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbModerateActionPerformed(evt);
            }
        });

        rbFullLoad.setBackground(new java.awt.Color(255, 255, 255));
        rbFullLoad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbFullLoad.setText("Full Load (18-24 units)");
        rbFullLoad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox1.setText("Arts / Creative Design");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QuestionsPanelLayout = new javax.swing.GroupLayout(QuestionsPanel);
        QuestionsPanel.setLayout(QuestionsPanelLayout);
        QuestionsPanelLayout.setHorizontalGroup(
            QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addComponent(rbEducation_Teaching, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(rbEngineering_Architecture_Mechanical, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTechnology_IT_CS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbBusiness_Management_Marketing, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbCriminology, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbHospitality_Tourism, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
                    .addComponent(lblQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbResearch, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMath, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbHospitality_FoodServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbPhysics_EngineeringConcepts, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbManagement_Marketing, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbICT_Coding)
                            .addComponent(jCheckBox1)
                            .addComponent(cbSocialScience, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                                .addComponent(rbBeginner, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(rbIntermediate)))
                        .addGap(43, 43, 43)
                        .addComponent(rbAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblQ4)
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addComponent(rbLight, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(rbModerate)
                        .addGap(30, 30, 30)
                        .addComponent(rbFullLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuestionsPanelLayout.setVerticalGroup(
            QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblQ1)
                .addGap(10, 10, 10)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTechnology_IT_CS)
                    .addComponent(rbHospitality_Tourism))
                .addGap(20, 20, 20)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCriminology)
                    .addComponent(rbBusiness_Management_Marketing))
                .addGap(20, 20, 20)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEducation_Teaching)
                    .addComponent(rbEngineering_Architecture_Mechanical))
                .addGap(30, 30, 30)
                .addComponent(lblQ2)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMath)
                            .addComponent(cbManagement_Marketing)))
                    .addGroup(QuestionsPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cbICT_Coding)))
                .addGap(20, 20, 20)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbResearch)
                    .addComponent(cbSocialScience)
                    .addComponent(cbHospitality_FoodServices))
                .addGap(20, 20, 20)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbEnglish)
                        .addComponent(cbPhysics_EngineeringConcepts)))
                .addGap(30, 30, 30)
                .addComponent(lblQ3)
                .addGap(20, 20, 20)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbIntermediate)
                        .addComponent(rbAdvanced))
                    .addComponent(rbBeginner))
                .addGap(30, 30, 30)
                .addComponent(lblQ4)
                .addGap(20, 20, 20)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLight)
                    .addComponent(rbModerate)
                    .addComponent(rbFullLoad))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(900, 123));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 204));
        btnBack.setText("BACK");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerateRecommendation)
                .addGap(100, 100, 100))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerateRecommendation)
                    .addComponent(btnBack))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuestionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QuestionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        HeaderPanel.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       new DashboardFrame(fullName, studentID, email, username).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGenerateRecommendationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRecommendationActionPerformed
        
        // Q1 – Field of Interest
    if (!rbTechnology_IT_CS.isSelected() &&
        !rbBusiness_Management_Marketing.isSelected() &&
        !rbEducation_Teaching.isSelected() &&
        !rbHospitality_Tourism.isSelected() &&
        !rbCriminology.isSelected() &&
        !rbEngineering_Architecture_Mechanical.isSelected()) {

        JOptionPane.showMessageDialog(this,
            "Please select your field of interest (Question 1).",
            "Missing Answer",
            JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Q3 – Difficulty
    if (!rbBeginner.isSelected() &&
        !rbIntermediate.isSelected() &&
        !rbAdvanced.isSelected()) {

        JOptionPane.showMessageDialog(this,
            "Please select your preferred course difficulty (Question 3).",
            "Missing Answer",
            JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Q4 – Credit Load
    if (!rbLight.isSelected() &&
        !rbModerate.isSelected() &&
        !rbFullLoad.isSelected()) {

        JOptionPane.showMessageDialog(this,
            "Please select your preferred credit load (Question 4).",
            "Missing Answer",
            JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        
        ArrayList<String> recommendations = new ArrayList<>();

    // Field-based recommendation
    if (rbTechnology_IT_CS.isSelected()) {
        recommendations.add("BSIT101 - Introduction to Computing");
        recommendations.add("BSIT102 - Computer Programming 1");
        recommendations.add("BSIT201 - Data Structures & Algorithms");
        recommendations.add("BSIT202 - Database Management Systems");
        recommendations.add("BSIT301 - Object-Oriented Programming");
        recommendations.add("BSIT302 - Web Development");
        recommendations.add("BSCS101 - Discrete Mathematics");
        recommendations.add("BSCS205 - Computer Architecture");
    }
    if (rbBusiness_Management_Marketing.isSelected()) {
        recommendations.add("BSBA101 - Principles of Management");
        recommendations.add("BSBA110 - Marketing Management");
    }
    if (rbEducation_Teaching.isSelected()) {
        recommendations.add("BSEd101 - Foundations of Education");
        recommendations.add("BSEd201 - Child & Adolescent Development");
    }
    if (rbHospitality_Tourism.isSelected()) {
        recommendations.add("BSHM101 - Front Office Procedures");
        recommendations.add("BSHM201 - Food & Beverage Services");
    }
    if (rbCriminology.isSelected()) {
        recommendations.add("CRIM101 - Introduction to Criminology");
        recommendations.add("CRIM205 - Forensic Photography");
    }
    if (rbEngineering_Architecture_Mechanical.isSelected()) {
        recommendations.add("ARCH101 - Introduction to Architecture");
        recommendations.add("MECH101 - Mechanical Engineering Basics");
    }

    // Subject-based fine-tuning
    if (cbICT_Coding.isSelected() && !recommendations.contains("BSIT102 - Computer Programming 1")) {
        recommendations.add("BSIT102 - Computer Programming 1");
    }
    if (cbMath.isSelected() && !recommendations.contains("BSCS101 - Discrete Mathematics")) {
        recommendations.add("BSCS101 - Discrete Mathematics");
    }
    if (cbManagement_Marketing.isSelected() && !recommendations.contains("BSBA110 - Marketing Management")) {
        recommendations.add("BSBA110 - Marketing Management");
    }
    
    

    // Pass recommendations to GeneratingFrame first (for animation)
        GeneratingFrame generatingFrame = new GeneratingFrame(recommendations);
        generatingFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGenerateRecommendationActionPerformed

    private void rbEngineering_Architecture_MechanicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEngineering_Architecture_MechanicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEngineering_Architecture_MechanicalActionPerformed

    private void cbEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnglishActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_cbEnglishActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void cbMathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMathActionPerformed

    private void cbManagement_MarketingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbManagement_MarketingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbManagement_MarketingActionPerformed

    private void rbModerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbModerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbModerateActionPerformed

    private void rbLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLightActionPerformed

    public static void main(String[] args) {
        // Sample data for testing
        String fullName = "John Mark Germinal";
        String studentID = "2025-00123";
        String email = "juan.delacruz@example.com";
        String username = "jdelacruz";

        java.awt.EventQueue.invokeLater(() -> {
            new RecommendationTestFrame(fullName, studentID, email, username).setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel QuestionsPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateRecommendation;
    private javax.swing.JCheckBox cbEnglish;
    private javax.swing.JCheckBox cbHospitality_FoodServices;
    private javax.swing.JCheckBox cbICT_Coding;
    private javax.swing.JCheckBox cbManagement_Marketing;
    private javax.swing.JCheckBox cbMath;
    private javax.swing.JCheckBox cbPhysics_EngineeringConcepts;
    private javax.swing.JCheckBox cbResearch;
    private javax.swing.JCheckBox cbSocialScience;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQ4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbAdvanced;
    private javax.swing.JRadioButton rbBeginner;
    private javax.swing.JRadioButton rbBusiness_Management_Marketing;
    private javax.swing.JRadioButton rbCriminology;
    private javax.swing.JRadioButton rbEducation_Teaching;
    private javax.swing.JRadioButton rbEngineering_Architecture_Mechanical;
    private javax.swing.JRadioButton rbFullLoad;
    private javax.swing.JRadioButton rbHospitality_Tourism;
    private javax.swing.JRadioButton rbIntermediate;
    private javax.swing.JRadioButton rbLight;
    private javax.swing.JRadioButton rbModerate;
    private javax.swing.JRadioButton rbTechnology_IT_CS;
    // End of variables declaration//GEN-END:variables
}
