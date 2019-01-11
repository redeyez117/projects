
package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="loginBean")
@SessionScoped

public class loginBean {
    
    private String username;
    private String password;
    private String dbUserName;
    private String dbpassword;
    
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String SQL;
    
    
    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getDbUserName() {
        return dbUserName;
    }

    
    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    
    public String getDbpassword() {
        return dbpassword;
    }

    
    public void setDbpassword(String dbpassword) {
        this.dbpassword = dbpassword;
    }
    
    
    
    public void dbData(String username) {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectadmin","root","");
            statement = (Statement) connection.createStatement();
            SQL = "Select * FROM admin WHERE Username LIKE ('"+username+"')";
            resultSet = statement.executeQuery(SQL);
            resultSet.next();
            dbUserName = resultSet.getString(2);
            dbpassword = resultSet.getString(3);
            
            System.out.println(dbUserName + dbpassword);
        } 
        catch (Exception e) {
            e.printStackTrace();
                System.err.println("Exception occurred during db transaction "+e+" "+username);
        }
       
    }
    
     public String checkValidUser() {
        
        dbData(username);
        if (username.equalsIgnoreCase(dbUserName)) {
            if (password.equalsIgnoreCase(dbpassword)){
                return "loginPage";
            }else{
                return "warningPage";
            }
        
        }
        return "warningPage";
       
    
       
}

}
