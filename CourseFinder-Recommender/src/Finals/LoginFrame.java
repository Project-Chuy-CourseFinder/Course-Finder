
package Finals;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
    initComponents();
    this.setLocationRelativeTo(null);

    // Show Password checkbox styling
    showpass.setLabel("Show Password");
    showpass.setForeground(new Color(30, 30, 30));
    showpass.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    showpass.setBackground(Color.WHITE);

    jPasswordField1Password.setEchoChar('*');

    // SHOW/HIDE PASSWORD FUNCTION
    showpass.addItemListener(e -> {
        if (showpass.getState()) {
            jPasswordField1Password.setEchoChar((char) 0); // show
        } else {
            jPasswordField1Password.setEchoChar('*'); // hide
        }
    });
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FormPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        jPasswordField1Password = new javax.swing.JPasswordField();
        showpass = new java.awt.Checkbox();
        ButtonPanel = new javax.swing.JPanel();
        btnCreateAccount = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 580));

        HeaderPanel.setBackground(new java.awt.Color(0, 102, 204));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(800, 140));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("CourseFinder");

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("Academic Decision Assistant");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblTitle))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblTitle2)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );

        FormPanel.setBackground(new java.awt.Color(255, 255, 255));
        FormPanel.setPreferredSize(new java.awt.Dimension(800, 330));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 102, 204));
        lblUsername.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(50, 50, 50));
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 102, 204));
        lblPassword.setText("Password:");

        jPasswordField1Password.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPasswordField1Password.setForeground(new java.awt.Color(50, 50, 50));
        jPasswordField1Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordField1Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1PasswordActionPerformed(evt);
            }
        });

        showpass.setLabel("checkbox1");

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblUsername)
                        .addComponent(txtUsername)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1Password, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                .addGap(86, 86, 86))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(800, 70));

        btnCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnSignIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addComponent(btnSignIn)
                .addGap(27, 27, 27)
                .addComponent(btnCreateAccount)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
            .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
    String username = txtUsername.getText().trim();
    String password = jPasswordField1Password.getText().trim();

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

    String hashedInput = Utils.md5(password);
    if (!acc.password.equals(hashedInput)) {
    JOptionPane.showMessageDialog(this, "Incorrect password!");
    return;
    }

    // SUCCESS LOGIN
    JOptionPane.showMessageDialog(this, "Login successful!");
    new DashboardFrame().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
         new CreateAccountFrame().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void jPasswordField1PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1PasswordActionPerformed
        btnSignIn.doClick();
    }//GEN-LAST:event_jPasswordField1PasswordActionPerformed

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
    private javax.swing.JPasswordField jPasswordField1Password;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblUsername;
    private java.awt.Checkbox showpass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
