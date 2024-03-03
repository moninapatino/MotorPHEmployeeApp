package com.motorph_group3;

import com.motorph_util.Postgresql;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.*;


public class MotorPHMainClass extends JFrame {
    public static void main(String[] args) {
        Connection conn=null;
        
        LoginPage loginFrame = new LoginPage();
        loginFrame.setVisible(true);
        
        conn = Postgresql.java_db();
    }
    
    public void init() {
        setTitle ("Motor PH Employee Portal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
 
}

