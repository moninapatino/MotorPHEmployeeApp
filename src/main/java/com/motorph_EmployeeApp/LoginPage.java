
package com.motorph_EmployeeApp;

import com.motorph_util.Postgresql;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;



public class LoginPage extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String password = "@dm1n";
   
    public LoginPage() {
        initComponents();
        setTitle ("Motor PH Employee Portal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        conn = Postgresql.java_db();
    }
    
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        motorPhTitle = new javax.swing.JLabel();
        titleUserID = new javax.swing.JLabel();
        userIDText = new javax.swing.JTextField();
        titlePassword = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        logInButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 255));

        jPanel2.setBackground(new java.awt.Color(30, 43, 93));

        motorPhTitle.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        motorPhTitle.setForeground(new java.awt.Color(250, 250, 255));
        motorPhTitle.setText("EMPLOYEE PORTAL");

        titleUserID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        titleUserID.setForeground(new java.awt.Color(250, 250, 255));
        titleUserID.setText("USERNAME");

        userIDText.setBackground(new java.awt.Color(30, 43, 93));
        userIDText.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        userIDText.setForeground(new java.awt.Color(250, 250, 255));

        titlePassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        titlePassword.setForeground(new java.awt.Color(250, 250, 255));
        titlePassword.setText("PASSWORD");

        passwordText.setBackground(new java.awt.Color(30, 43, 93));
        passwordText.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        passwordText.setForeground(new java.awt.Color(250, 250, 255));
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextKeyPressed(evt);
            }
        });

        logInButton.setBackground(new java.awt.Color(250, 250, 255));
        logInButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logInButton.setForeground(new java.awt.Color(29, 53, 87));
        logInButton.setText("LOG IN");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(titlePassword)
                                .addComponent(titleUserID))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userIDText)
                                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logInButton)
                            .addGap(77, 77, 77)))
                    .addComponent(motorPhTitle))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(motorPhTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleUserID)
                    .addComponent(userIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlePassword)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Icons\\LOGO 2.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // login action
        String username = userIDText.getText();
        String password1 = passwordText.getText();
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM public.mph_employee_data WHERE username =? and password =?";
            
            pst=conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password1);
            rs=pst.executeQuery();
                                  
            if(rs.next()){
                EmployeeAccessPortal employeeAccessPortal = new EmployeeAccessPortal (username);
                employeeAccessPortal.setVisible(true);
                
                setVisible(false);
                
            }else if(userIDText.getText().contains("Admin") && passwordText.getText().contains("123")) {
                JOptionPane.showMessageDialog(null, "Log in Successful");
                EmployeePortal employeePortal = new EmployeePortal ();
                employeePortal.show();
                
                dispose();
                
            }else if(userIDText.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Fill Out User ID");
            
            }else if(passwordText.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Please Fill Out Password");                 
               
            }else{
                JOptionPane.showMessageDialog(null, "Wrong User ID or Password");  
            } 
                    
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()); 
            }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void passwordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyPressed
        // PRESSING ENTER FUNCTION
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){ 
        
        String username = userIDText.getText();
        String password1 = passwordText.getText();
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM public.mph_employee_data WHERE username =? and password =?";
            
            pst=conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password1);
            rs=pst.executeQuery();
                                  
            if(rs.next()){
                EmployeeAccessPortal employeeAccessPortal = new EmployeeAccessPortal (username);
                employeeAccessPortal.setVisible(true);
                
                setVisible(false);
                
            }else if(userIDText.getText().contains("Admin") && passwordText.getText().contains("12345qwerty")) {
                JOptionPane.showMessageDialog(null, "Log in Successful");
                EmployeePortal employeePortal = new EmployeePortal ();
                employeePortal.show();
                
                dispose();
                
            }else if(userIDText.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Fill Out User ID");
            
            }else if(passwordText.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Please Fill Out Password");                 
               
            }else{
                JOptionPane.showMessageDialog(null, "Wrong User ID or Password");  
            } 
                    
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()); 
            }
        }
    }//GEN-LAST:event_passwordTextKeyPressed

  
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel motorPhTitle;
    public javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel titlePassword;
    private javax.swing.JLabel titleUserID;
    private javax.swing.JTextField userIDText;
    // End of variables declaration//GEN-END:variables
}
