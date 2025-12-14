
package Finals;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);

        // Show password checkbox styling
        showpass.setLabel("Show Password");
        showpass.setForeground(new Color(50, 50, 50));
        showpass.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        showpass.setBackground(Color.WHITE);


        // SHOW / HIDE PASSWORD FUNCTION
        showpass.addItemListener(e -> {
            if (showpass.getState()) {
                jPasswordField1Password.setEchoChar((char) 0);
            } else {
                if (!String.valueOf(jPasswordField1Password.getPassword())
                        .equals("Enter Password")) {
                    jPasswordField1Password.setEchoChar('*');
                }
              }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBackgroundImage = new javax.swing.JLabel();
        FormPanel = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        jPasswordField1Password = new javax.swing.JPasswordField();
        showpass = new java.awt.Checkbox();
        usericon = new javax.swing.JLabel();
        passwordicon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        btnCreateAccount = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 580));

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(800, 140));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("CourseFinder");

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("Academic Decision Assistant");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N

        lblBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-background.jpg"))); // NOI18N
        lblBackgroundImage.setText("jLabel2");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lblTitle))
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lblTitle2))
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblLogo))
            .addComponent(lblBackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(lblLogo))
            .addComponent(lblBackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        FormPanel.setBackground(new java.awt.Color(255, 255, 255));
        FormPanel.setPreferredSize(new java.awt.Dimension(800, 330));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(50, 50, 50));
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        txtUsername.setCaretColor(new java.awt.Color(0, 102, 204));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jPasswordField1Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1Password.setForeground(new java.awt.Color(50, 50, 50));
        jPasswordField1Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordField1Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1PasswordActionPerformed(evt);
            }
        });

        showpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpass.setForeground(new java.awt.Color(255, 255, 255));
        showpass.setLabel("checkbox1");

        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        usericon.setText("jLabel3");

        passwordicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N
        passwordicon.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Password");

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usericon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordicon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername)
                                .addComponent(jPasswordField1Password, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(146, 146, 146))))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usericon, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(txtUsername))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordicon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(800, 70));

        btnCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(0, 102, 204));
        btnCreateAccount.setText("CREATE ACCOUNT");
        btnCreateAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 3));
        btnCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnSignIn.setBackground(new java.awt.Color(0, 102, 204));
        btnSignIn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("SIGN IN");
        btnSignIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                        .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addComponent(btnSignIn)
                .addGap(32, 32, 32)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String username = txtUsername.getText().trim();
        String password = new String(jPasswordField1Password.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both username and password!");
            return;
        }

        if (!UserData.accounts.containsKey(username)) {
            JOptionPane.showMessageDialog(this, "Account not found!");
            return;
        }

        Account acc = UserData.accounts.get(username);
        if (acc == null) {
            JOptionPane.showMessageDialog(this, "Account not found!");
            return;
        }

        // Use Caesar Cipher for password check
        if (!acc.checkPassword(password)) {
            JOptionPane.showMessageDialog(this, "Incorrect password!");
            return;
        }

        // SUCCESS LOGIN
        JOptionPane.showMessageDialog(this, "Login successful!");

        // Save current user info
        CurrentUser.setUser(acc.fullName, acc.studentID, acc.email, username);

        // Open dashboard
        new DashboardFrame(acc.fullName, acc.studentID, acc.email, username).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
         new CreateAccountFrame().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void jPasswordField1PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1PasswordActionPerformed
        btnSignIn.doClick();
    }//GEN-LAST:event_jPasswordField1PasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new LoginFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1Password;
    private javax.swing.JLabel lblBackgroundImage;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel passwordicon;
    private java.awt.Checkbox showpass;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel usericon;
    // End of variables declaration//GEN-END:variables
}