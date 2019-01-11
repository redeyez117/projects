/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.view;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static db_connect.DBManager.getConnection;

/**
 *
 * @author Ardi
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        this.setSize(530,360);
        this.setBackground(Color.blue);
        

        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        passwordInput = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setBackground(new java.awt.Color(51, 153, 255));
        setName("Log In"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 40, 60, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 90, 90, 14);
        getContentPane().add(emailInput);
        emailInput.setBounds(230, 40, 120, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 120, 100, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("If you dont have an account");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 170, 198, 14);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 200, 100, 23);
        getContentPane().add(passwordInput);
        passwordInput.setBounds(230, 80, 120, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ardi\\Desktop\\fblogo2014.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setPreferredSize(new java.awt.Dimension(530, 330));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 530, 330);

        setSize(new java.awt.Dimension(545, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Register r = new Register();
        r.setVisible(true);
        
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
         String userInput=emailInput.getText();
         String passInput=passwordInput.getText();
        
        if (userInput.isEmpty() || passInput.isEmpty()) {

            JOptionPane.showMessageDialog(null, "You should enter a username and password!");
            return;
        }
        
        try{
        
        String sql = "SELECT * FROM clients where Email_Address=? and Password=? ";
        PreparedStatement pst = getConnection().prepareStatement(sql);
        int i = 1;
        pst.setString(i++, userInput);
        pst.setString(i++, passInput);
        ResultSet rs;
        
        rs = pst.executeQuery();
        
        if (rs.next()) {
              Account a = new Account(rs.getString("Email_Address") , rs.getString("Password"));
              a.setVisible(true);
              a.setDefaultCloseOperation(EXIT_ON_CLOSE);   
        }else{
            JOptionPane.showMessageDialog(null, "Username or Password Incorrect");
        }



       } catch (Exception ex) {
          ex.printStackTrace(); 
       }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordInput;
    // End of variables declaration//GEN-END:variables


}

