
package com.motorph_group3;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.WindowConstants;
import javax.swing.*;



public class EmployeePortal extends javax.swing.JFrame {
    //private ImageIcon img = null;
    
    public EmployeePortal() {
        initComponents();
        setTitle ("Employee Portal");
        //setSize(700, 550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        //Displaying date and Time
        time();
        date();
                
    }
    public final void time(){
    DateTimeFormatter times = DateTimeFormatter.ofPattern("hh:mm:ss a");
    LocalDateTime now =LocalDateTime.now();
    dateAndTime.setText(times.format(now));
    }
      public final void date(){
    DateTimeFormatter dates = DateTimeFormatter.ofPattern("MM/dd/YYYY");
    LocalDateTime now =LocalDateTime.now();
    dateAndTime1.setText(dates.format(now));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        greetings = new javax.swing.JLabel();
        dateAndTime = new javax.swing.JLabel();
        employeeProfileButton = new javax.swing.JButton();
        leaveButton = new javax.swing.JButton();
        payrollButton = new javax.swing.JButton();
        attendanceButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        dateAndTime1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(69, 123, 157));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 450));

        jPanel3.setBackground(new java.awt.Color(29, 53, 87));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 217, 217));
        jLabel1.setText("Employee Portal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        greetings.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        greetings.setForeground(new java.awt.Color(217, 217, 217));
        greetings.setText("Greetings!");

        dateAndTime.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        dateAndTime.setForeground(new java.awt.Color(217, 217, 217));
        dateAndTime.setText("Date and Time");

        employeeProfileButton.setBackground(new java.awt.Color(29, 53, 87));
        employeeProfileButton.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        employeeProfileButton.setForeground(new java.awt.Color(217, 217, 217));
        employeeProfileButton.setText("Employee Profile");
        employeeProfileButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        employeeProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeProfileButtonActionPerformed(evt);
            }
        });

        leaveButton.setBackground(new java.awt.Color(29, 53, 87));
        leaveButton.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        leaveButton.setForeground(new java.awt.Color(217, 217, 217));
        leaveButton.setText("Leave Management");
        leaveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtonActionPerformed(evt);
            }
        });

        payrollButton.setBackground(new java.awt.Color(29, 53, 87));
        payrollButton.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        payrollButton.setForeground(new java.awt.Color(217, 217, 217));
        payrollButton.setText("Payroll");
        payrollButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        payrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollButtonActionPerformed(evt);
            }
        });

        attendanceButton.setBackground(new java.awt.Color(29, 53, 87));
        attendanceButton.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        attendanceButton.setForeground(new java.awt.Color(217, 217, 217));
        attendanceButton.setText("Attendance");
        attendanceButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        attendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(29, 53, 87));
        logOutButton.setForeground(new java.awt.Color(217, 217, 217));
        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        dateAndTime1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        dateAndTime1.setForeground(new java.awt.Color(217, 217, 217));
        dateAndTime1.setText("Date and Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greetings)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateAndTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateAndTime1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(leaveButton)
                                            .addComponent(employeeProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(attendanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                            .addComponent(payrollButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(logOutButton)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {attendanceButton, employeeProfileButton, leaveButton, payrollButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(greetings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateAndTime)
                    .addComponent(dateAndTime1))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payrollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(logOutButton)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // log out
        LoginPage loginPage = new LoginPage();
        loginPage.show();
                
        dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void employeeProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeProfileButtonActionPerformed
        // go to Employee Profile
        EmployeeProfile employeeProfile = new EmployeeProfile();
        employeeProfile.show();
        
        dispose();
    }//GEN-LAST:event_employeeProfileButtonActionPerformed

    private void leaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveButtonActionPerformed
        // go to Leave Management
        LeaveManagement leaveManagement = new LeaveManagement();
        leaveManagement.show();
        
        dispose();
    }//GEN-LAST:event_leaveButtonActionPerformed

    private void payrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollButtonActionPerformed
        // go to Payroll
        Payroll payroll = new Payroll();
        payroll.show();
        
        dispose();
    }//GEN-LAST:event_payrollButtonActionPerformed

    private void attendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceButtonActionPerformed
        // go to Attendance
        EmployeeAttendance attendance = new EmployeeAttendance();
        attendance.show();
        
        dispose();
    }//GEN-LAST:event_attendanceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendanceButton;
    private javax.swing.JLabel dateAndTime;
    private javax.swing.JLabel dateAndTime1;
    private javax.swing.JButton employeeProfileButton;
    private javax.swing.JLabel greetings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton leaveButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton payrollButton;
    // End of variables declaration//GEN-END:variables
}
