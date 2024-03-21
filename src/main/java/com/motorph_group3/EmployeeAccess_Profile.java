
package com.motorph_group3;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.WindowConstants;
import com.motorph_util.Postgresql;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.*;

public class EmployeeAccess_Profile extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String password = "admin";
    
    public EmployeeAccess_Profile() {
        initComponents();
        
        setTitle ("Motor PH Employee Profile");
        setSize(700, 550);
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

        mainPanel = new javax.swing.JPanel();
        greetings = new javax.swing.JLabel();
        dateAndTime = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        noe_title = new javax.swing.JLabel();
        b_title = new javax.swing.JLabel();
        cn_title = new javax.swing.JLabel();
        en_title = new javax.swing.JLabel();
        jt_title = new javax.swing.JLabel();
        s_title = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        bday_field = new javax.swing.JTextField();
        contact_field = new javax.swing.JTextField();
        employeeNumber_field = new javax.swing.JTextField();
        jobTitle_field = new javax.swing.JTextField();
        status_field = new javax.swing.JTextField();
        govIdNum_title = new javax.swing.JLabel();
        sss_title = new javax.swing.JLabel();
        pagibig_title = new javax.swing.JLabel();
        phhealth_title = new javax.swing.JLabel();
        tin_title = new javax.swing.JLabel();
        sss_field = new javax.swing.JTextField();
        pagibig_field = new javax.swing.JTextField();
        phhealth_field = new javax.swing.JTextField();
        tin_field = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        noe_title1 = new javax.swing.JLabel();
        name_field1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(69, 123, 157));
        mainPanel.setForeground(new java.awt.Color(69, 123, 157));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 450));

        greetings.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        greetings.setForeground(new java.awt.Color(217, 217, 217));
        greetings.setText("Greetings!");

        dateAndTime.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        dateAndTime.setForeground(new java.awt.Color(217, 217, 217));
        dateAndTime.setText("Date and Time");

        jPanel1.setBackground(new java.awt.Color(29, 53, 87));
        jPanel1.setPreferredSize(new java.awt.Dimension(256, 70));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 217, 217));
        jLabel1.setText("Employee Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        noe_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        noe_title.setForeground(new java.awt.Color(217, 217, 217));
        noe_title.setText("First Name :");

        b_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        b_title.setForeground(new java.awt.Color(217, 217, 217));
        b_title.setText("Birthday :");

        cn_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        cn_title.setForeground(new java.awt.Color(217, 217, 217));
        cn_title.setText("Contact Number:");

        en_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title.setForeground(new java.awt.Color(217, 217, 217));
        en_title.setText("Employee Number :");

        jt_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jt_title.setForeground(new java.awt.Color(217, 217, 217));
        jt_title.setText("Job Title :");

        s_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        s_title.setForeground(new java.awt.Color(217, 217, 217));
        s_title.setText("Status :");

        name_field.setEditable(false);
        name_field.setBackground(new java.awt.Color(217, 217, 217));
        name_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        name_field.setForeground(new java.awt.Color(29, 53, 87));

        bday_field.setEditable(false);
        bday_field.setBackground(new java.awt.Color(217, 217, 217));
        bday_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        bday_field.setForeground(new java.awt.Color(29, 53, 87));

        contact_field.setBackground(new java.awt.Color(217, 217, 217));
        contact_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        contact_field.setForeground(new java.awt.Color(29, 53, 87));

        employeeNumber_field.setBackground(new java.awt.Color(217, 217, 217));
        employeeNumber_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        employeeNumber_field.setForeground(new java.awt.Color(29, 53, 87));
        employeeNumber_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeNumber_fieldKeyReleased(evt);
            }
        });

        jobTitle_field.setEditable(false);
        jobTitle_field.setBackground(new java.awt.Color(217, 217, 217));
        jobTitle_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jobTitle_field.setForeground(new java.awt.Color(29, 53, 87));

        status_field.setEditable(false);
        status_field.setBackground(new java.awt.Color(217, 217, 217));
        status_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        status_field.setForeground(new java.awt.Color(29, 53, 87));

        govIdNum_title.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        govIdNum_title.setForeground(new java.awt.Color(217, 217, 217));
        govIdNum_title.setText("Government ID Numbers");

        sss_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        sss_title.setForeground(new java.awt.Color(217, 217, 217));
        sss_title.setText("SSS Number :");

        pagibig_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        pagibig_title.setForeground(new java.awt.Color(217, 217, 217));
        pagibig_title.setText("PAG-IBIG Number :");

        phhealth_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        phhealth_title.setForeground(new java.awt.Color(217, 217, 217));
        phhealth_title.setText("PhilHealth Number :");

        tin_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        tin_title.setForeground(new java.awt.Color(217, 217, 217));
        tin_title.setText("TIN :");

        sss_field.setEditable(false);
        sss_field.setBackground(new java.awt.Color(217, 217, 217));
        sss_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        sss_field.setForeground(new java.awt.Color(29, 53, 87));

        pagibig_field.setEditable(false);
        pagibig_field.setBackground(new java.awt.Color(217, 217, 217));
        pagibig_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        pagibig_field.setForeground(new java.awt.Color(29, 53, 87));

        phhealth_field.setEditable(false);
        phhealth_field.setBackground(new java.awt.Color(217, 217, 217));
        phhealth_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        phhealth_field.setForeground(new java.awt.Color(29, 53, 87));

        tin_field.setEditable(false);
        tin_field.setBackground(new java.awt.Color(217, 217, 217));
        tin_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        tin_field.setForeground(new java.awt.Color(29, 53, 87));

        backButton.setBackground(new java.awt.Color(29, 53, 87));
        backButton.setForeground(new java.awt.Color(217, 217, 217));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(29, 53, 87));
        clearButton.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(217, 217, 217));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        noe_title1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        noe_title1.setForeground(new java.awt.Color(217, 217, 217));
        noe_title1.setText("Last Name :");

        name_field1.setEditable(false);
        name_field1.setBackground(new java.awt.Color(217, 217, 217));
        name_field1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        name_field1.setForeground(new java.awt.Color(29, 53, 87));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greetings)
                            .addComponent(dateAndTime))
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tin_title)
                                    .addComponent(phhealth_title)
                                    .addComponent(pagibig_title)
                                    .addComponent(govIdNum_title)
                                    .addComponent(sss_title))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pagibig_field)
                                    .addComponent(phhealth_field)
                                    .addComponent(tin_field)
                                    .addComponent(sss_field)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                            .addComponent(noe_title)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(en_title)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(employeeNumber_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(noe_title1)
                                            .addComponent(b_title))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bday_field, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(name_field1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))))
                        .addGap(18, 18, 18)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_title, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s_title, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cn_title, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearButton)
                            .addComponent(backButton))
                        .addGap(65, 65, 65))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contact_field, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jobTitle_field)
                            .addComponent(status_field))
                        .addGap(56, 56, 56))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greetings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateAndTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cn_title)
                            .addComponent(contact_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_title)
                            .addComponent(jobTitle_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_title)
                            .addComponent(status_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(en_title)
                            .addComponent(employeeNumber_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noe_title))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_field1)
                            .addComponent(noe_title1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_title)
                            .addComponent(bday_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 142, Short.MAX_VALUE)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton)
                        .addGap(37, 37, 37))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(govIdNum_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sss_title)
                            .addComponent(sss_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pagibig_title)
                            .addComponent(pagibig_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phhealth_title)
                            .addComponent(phhealth_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tin_title)
                            .addComponent(tin_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeNumber_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeNumber_fieldKeyReleased
        // type employee number
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "@dm1n";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM public.mph_employee_data WHERE employee_id= ?";

            pst=conn.prepareStatement(sql);
            pst.setString(1, employeeNumber_field.getText());
            rs=pst.executeQuery();
            if(rs.next()){

                String firstName =rs.getString("first_name");
                name_field.setText(firstName);

                String lastName =rs.getString("last_name");
                name_field1.setText(lastName);

                String bday =rs.getString("birthday");
                bday_field.setText(bday);

                String contactNumber =rs.getString("phone_number");
                contact_field.setText(contactNumber);

                String status =rs.getString("status");
                status_field.setText(status);

                String position =rs.getString("position");
                jobTitle_field.setText(position);

                String sss =rs.getString("sss");
                sss_field.setText(sss);

                String philhealth =rs.getString("philhealth");
                phhealth_field.setText(philhealth);

                String pagibig =rs.getString("pagibig");
                pagibig_field.setText(pagibig);

                String tin =rs.getString("tin");
                tin_field.setText(tin);

            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (Exception ex) {

            }
        }

    }//GEN-LAST:event_employeeNumber_fieldKeyReleased

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // back to Employee Access Portal
        String username = "";
        
        EmployeeAccessPortal employeeAccessPortal = new EmployeeAccessPortal (username);
        employeeAccessPortal.setVisible(true);               
        setVisible(false); 
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        // Clear data from textbox
        employeeNumber_field.setText("");
        name_field.setText("");
        name_field1.setText("");
        bday_field.setText("");
        contact_field.setText("");
        status_field.setText("");
        jobTitle_field.setText("");
        sss_field.setText("");
        phhealth_field.setText("");
        pagibig_field.setText("");
        tin_field.setText("");

    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeAccess_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccess_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccess_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccess_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAccess_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b_title;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bday_field;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel cn_title;
    private javax.swing.JTextField contact_field;
    private javax.swing.JLabel dateAndTime;
    private javax.swing.JTextField employeeNumber_field;
    private javax.swing.JLabel en_title;
    private javax.swing.JLabel govIdNum_title;
    private javax.swing.JLabel greetings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jobTitle_field;
    private javax.swing.JLabel jt_title;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField name_field1;
    private javax.swing.JLabel noe_title;
    private javax.swing.JLabel noe_title1;
    private javax.swing.JTextField pagibig_field;
    private javax.swing.JLabel pagibig_title;
    private javax.swing.JTextField phhealth_field;
    private javax.swing.JLabel phhealth_title;
    private javax.swing.JLabel s_title;
    private javax.swing.JTextField sss_field;
    private javax.swing.JLabel sss_title;
    private javax.swing.JTextField status_field;
    private javax.swing.JTextField tin_field;
    private javax.swing.JLabel tin_title;
    // End of variables declaration//GEN-END:variables
}
