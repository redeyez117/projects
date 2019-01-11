/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.com.model.Client;
import org.com.view.LogIn;
import org.com.model.Reservation;

/**
 *
 * @author Ardi
 */
public class DBManager {
    
    
    public static Connection connection = null;
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                String driver = "com.mysql.jdbc.Driver";
                Class.forName(driver).newInstance();
//                String url1 = "jdbc:mysql://localhost:3306/hotel_reservation"+"root"+"";
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_reservation","root","");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex);
                        }
        }
        return connection;
    }



     
}