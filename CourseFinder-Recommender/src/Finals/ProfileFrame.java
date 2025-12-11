
package Finals;

public class ProfileFrame extends javax.swing.JFrame {

    // ============================
    // 1. VARIABLES TO HOLD DATA
    // ============================
    private final String fullName;
    private final String studentID;
    private final String email;
    private final String username;

    // ============================
    // 2. CONSTRUCTOR WITH USER DATA
    // ============================
    public ProfileFrame(String fullName, String studentID, String email, String username) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;

        initComponents();
        this.setLocationRelativeTo(null);

        // Display user info
        lblFullNameValue.setText(fullName);
        lblStudentIDValue.setText(studentID);
        lblEmailValue.setText(email);
        lblUsernameValue.setText(username);
    }

    // Optional default constructor for design preview
    public ProfileFrame() {
        this("Student Name", "ID0000", "email@example.com", "username");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        ProfileInfoPanel = new javax.swing.JPanel();
        lblFullName = new javax.swing.JLabel();
        lblFullNameValue = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblStudentIDValue = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEmailValue = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUsernameValue = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnBackToDasboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(0, 204, 255));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(800, 125));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setText("Profile");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N
        lblLogo.setText("jLabel1");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addContainerGap(552, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblLogo)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(33, 33, 33))
        );

        ProfileInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        ProfileInfoPanel.setPreferredSize(new java.awt.Dimension(800, 380));

        lblFullName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFullName.setText("Full Name:");

        lblFullNameValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFullNameValue.setText("<Name>");

        lblStudentID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblStudentID.setText("Student ID:");

        lblStudentIDValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblStudentIDValue.setText("<ID>");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEmail.setText("Email:");

        lblEmailValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEmailValue.setText("<Email>");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsername.setText("Username:");

        lblUsernameValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsernameValue.setText("<Username>");

        javax.swing.GroupLayout ProfileInfoPanelLayout = new javax.swing.GroupLayout(ProfileInfoPanel);
        ProfileInfoPanel.setLayout(ProfileInfoPanelLayout);
        ProfileInfoPanelLayout.setHorizontalGroup(
            ProfileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileInfoPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(ProfileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFullName)
                    .addComponent(lblStudentID)
                    .addComponent(lblEmail)
                    .addComponent(lblUsername))
                .addGap(36, 36, 36)
                .addGroup(ProfileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentIDValue)
                    .addComponent(lblFullNameValue)
                    .addComponent(lblEmailValue)
                    .addComponent(lblUsernameValue))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        ProfileInfoPanelLayout.setVerticalGroup(
            ProfileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileInfoPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(ProfileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullName)
                    .addComponent(lblFullNameValue))
                .addGap(28, 28, 28)
                .addGroup(ProfileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(lblStudentIDValue))
                .addGap(28, 28, 28)
                .addGroup(ProfileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblEmailValue))
                .addGap(28, 28, 28)
                .addGroup(ProfileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(lblUsernameValue))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(800, 116));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBackToDasboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBackToDasboard.setText("BACK TO DASHBOARD");
        btnBackToDasboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToDasboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnBackToDasboard)
                .addGap(108, 108, 108)
                .addComponent(btnLogout)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnBackToDasboard))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ProfileInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ProfileInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToDasboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDasboardActionPerformed
        new DashboardFrame(fullName, studentID, email, username).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnBackToDasboardActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel ProfileInfoPanel;
    private javax.swing.JButton btnBackToDasboard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailValue;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblFullNameValue;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblStudentIDValue;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameValue;
    // End of variables declaration//GEN-END:variables
}
