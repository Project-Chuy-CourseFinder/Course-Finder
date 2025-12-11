
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
        lblQ3 = new javax.swing.JLabel();
        rbBeginner = new javax.swing.JRadioButton();
        rbIntermediate = new javax.swing.JRadioButton();
        rbAdvanced = new javax.swing.JRadioButton();
        cbICT_Coding = new javax.swing.JCheckBox();
        lblQ4 = new javax.swing.JLabel();
        rbLight = new javax.swing.JRadioButton();
        rbModerate = new javax.swing.JRadioButton();
        rbFullLoad = new javax.swing.JRadioButton();
        ButtonPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnGenerateRecommendation = new javax.swing.JButton();

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

        rbTechnology_IT_CS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbTechnology_IT_CS.setForeground(new java.awt.Color(0, 102, 204));
        rbTechnology_IT_CS.setText("Technology / IT / CS");
        rbTechnology_IT_CS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbTechnology_IT_CS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTechnology_IT_CSActionPerformed(evt);
            }
        });

        rbBusiness_Management_Marketing.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbBusiness_Management_Marketing.setForeground(new java.awt.Color(0, 102, 204));
        rbBusiness_Management_Marketing.setText("Business / Management / Marketing");
        rbBusiness_Management_Marketing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbBusiness_Management_Marketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBusiness_Management_MarketingActionPerformed(evt);
            }
        });

        rbEducation_Teaching.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbEducation_Teaching.setForeground(new java.awt.Color(0, 102, 204));
        rbEducation_Teaching.setText("Education / Teaching");
        rbEducation_Teaching.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbEducation_Teaching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEducation_TeachingActionPerformed(evt);
            }
        });

        rbHospitality_Tourism.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbHospitality_Tourism.setForeground(new java.awt.Color(0, 102, 204));
        rbHospitality_Tourism.setText("Hospitality / Tourism");
        rbHospitality_Tourism.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbHospitality_Tourism.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHospitality_TourismActionPerformed(evt);
            }
        });

        rbCriminology.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbCriminology.setForeground(new java.awt.Color(0, 102, 204));
        rbCriminology.setText("Criminology");
        rbCriminology.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbCriminology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCriminologyActionPerformed(evt);
            }
        });

        rbEngineering_Architecture_Mechanical.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbEngineering_Architecture_Mechanical.setForeground(new java.awt.Color(0, 102, 204));
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

        cbMath.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbMath.setForeground(new java.awt.Color(0, 102, 204));
        cbMath.setText("Math");
        cbMath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMathActionPerformed(evt);
            }
        });

        cbResearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbResearch.setForeground(new java.awt.Color(0, 102, 204));
        cbResearch.setText("Research");
        cbResearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbResearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbResearchActionPerformed(evt);
            }
        });

        cbManagement_Marketing.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbManagement_Marketing.setForeground(new java.awt.Color(0, 102, 204));
        cbManagement_Marketing.setText("Management / Marketing");
        cbManagement_Marketing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbManagement_Marketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbManagement_MarketingActionPerformed(evt);
            }
        });

        cbHospitality_FoodServices.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbHospitality_FoodServices.setForeground(new java.awt.Color(0, 102, 204));
        cbHospitality_FoodServices.setText("Hospitality / Food Services");
        cbHospitality_FoodServices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbHospitality_FoodServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHospitality_FoodServicesActionPerformed(evt);
            }
        });

        cbPhysics_EngineeringConcepts.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbPhysics_EngineeringConcepts.setForeground(new java.awt.Color(0, 102, 204));
        cbPhysics_EngineeringConcepts.setText("Physics / Engineering Concepts");
        cbPhysics_EngineeringConcepts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPhysics_EngineeringConcepts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPhysics_EngineeringConceptsActionPerformed(evt);
            }
        });

        cbEnglish.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbEnglish.setForeground(new java.awt.Color(0, 102, 204));
        cbEnglish.setText("English");
        cbEnglish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnglishActionPerformed(evt);
            }
        });

        cbSocialScience.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbSocialScience.setForeground(new java.awt.Color(0, 102, 204));
        cbSocialScience.setText("Social Science");
        cbSocialScience.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSocialScience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSocialScienceActionPerformed(evt);
            }
        });

        lblQ3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQ3.setForeground(new java.awt.Color(0, 102, 204));
        lblQ3.setText("3. Preferred course difficulty:");

        rbBeginner.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbBeginner.setForeground(new java.awt.Color(0, 102, 204));
        rbBeginner.setText("Intermediate");
        rbBeginner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbBeginner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBeginnerActionPerformed(evt);
            }
        });

        rbIntermediate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbIntermediate.setForeground(new java.awt.Color(0, 102, 204));
        rbIntermediate.setText("Advanced");
        rbIntermediate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIntermediateActionPerformed(evt);
            }
        });

        rbAdvanced.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbAdvanced.setForeground(new java.awt.Color(0, 102, 204));
        rbAdvanced.setText("Beginner");
        rbAdvanced.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdvancedActionPerformed(evt);
            }
        });

        cbICT_Coding.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbICT_Coding.setForeground(new java.awt.Color(0, 102, 204));
        cbICT_Coding.setText("ICT / Coding");
        cbICT_Coding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbICT_Coding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbICT_CodingActionPerformed(evt);
            }
        });

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
        rbFullLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFullLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QuestionsPanelLayout = new javax.swing.GroupLayout(QuestionsPanel);
        QuestionsPanel.setLayout(QuestionsPanelLayout);
        QuestionsPanelLayout.setHorizontalGroup(
            QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(rbTechnology_IT_CS, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178)
                .addComponent(rbHospitality_Tourism, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(rbBusiness_Management_Marketing, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rbCriminology, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(rbEducation_Teaching, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(rbEngineering_Architecture_Mechanical, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(cbMath, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(cbHospitality_FoodServices, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(cbEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(cbResearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(cbPhysics_EngineeringConcepts, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(cbSocialScience, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(cbManagement_Marketing, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280)
                .addComponent(cbICT_Coding))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(rbAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(rbBeginner)
                .addGap(57, 57, 57)
                .addComponent(rbIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblQ4))
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(rbLight, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(rbModerate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(rbFullLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        QuestionsPanelLayout.setVerticalGroup(
            QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblQ1)
                .addGap(7, 7, 7)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbTechnology_IT_CS)
                    .addComponent(rbHospitality_Tourism))
                .addGap(10, 10, 10)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbBusiness_Management_Marketing)
                    .addComponent(rbCriminology))
                .addGap(10, 10, 10)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEducation_Teaching)
                    .addComponent(rbEngineering_Architecture_Mechanical))
                .addGap(20, 20, 20)
                .addComponent(lblQ2)
                .addGap(15, 15, 15)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMath)
                    .addComponent(cbHospitality_FoodServices)
                    .addComponent(cbEnglish))
                .addGap(11, 11, 11)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbResearch)
                    .addComponent(cbPhysics_EngineeringConcepts)
                    .addComponent(cbSocialScience))
                .addGap(11, 11, 11)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbManagement_Marketing)
                    .addComponent(cbICT_Coding))
                .addGap(31, 31, 31)
                .addComponent(lblQ3)
                .addGap(15, 15, 15)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAdvanced)
                    .addComponent(rbBeginner)
                    .addComponent(rbIntermediate))
                .addGap(30, 30, 30)
                .addComponent(lblQ4)
                .addGap(15, 15, 15)
                .addGroup(QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbLight)
                    .addComponent(rbModerate)
                    .addComponent(rbFullLoad)))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(900, 123));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 255));
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
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(120, 120, 120)
                .addComponent(btnGenerateRecommendation)
                .addGap(132, 132, 132))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnGenerateRecommendation))
                .addContainerGap(53, Short.MAX_VALUE))
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
                .addComponent(QuestionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        HeaderPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIntermediateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIntermediateActionPerformed

    private void cbHospitality_FoodServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHospitality_FoodServicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHospitality_FoodServicesActionPerformed

    private void rbModerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbModerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbModerateActionPerformed

    private void cbResearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbResearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbResearchActionPerformed

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

    private void rbHospitality_TourismActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHospitality_TourismActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbHospitality_TourismActionPerformed

    private void rbCriminologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCriminologyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCriminologyActionPerformed

    private void rbEngineering_Architecture_MechanicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEngineering_Architecture_MechanicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEngineering_Architecture_MechanicalActionPerformed

    private void cbEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEnglishActionPerformed

    private void cbSocialScienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSocialScienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSocialScienceActionPerformed

    private void cbICT_CodingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbICT_CodingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbICT_CodingActionPerformed


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
