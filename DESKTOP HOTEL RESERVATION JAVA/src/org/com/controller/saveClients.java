
package org.com.controller;

import static db_connect.DBManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import org.com.model.Client;
import org.com.model.Reservation;


public class saveClients {
    
  public static void saveClient(Client client) throws Exception{
        String query = "INSERT INTO clients ( " +
                " Name," +
                " LastName," +
                " Email_Address," +
                " Password" +
                " ) VALUES (?,?,?,?)";
        PreparedStatement pstmt = getConnection().prepareStatement(query);
        int i = 1;
        pstmt.setString(i++, client.getName());
        pstmt.setString(i++, client.getSurName());
        pstmt.setString(i++, client.getEmail());
        pstmt.setString(i++, client.getPassword());
       
        if (pstmt.executeUpdate() == 0) {
            throw new Exception("Saving failed");
        }

        client.setID(getMaxIDFromTable("clients"));
    }
  
  private static int getMaxIDFromTable(String tableName) throws Exception{
        String query = "select max(ID) as ID from "+tableName;
        PreparedStatement pstmt = getConnection().prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(); 
        int clientID = -1;
        if(rs.next()){
            clientID = rs.getInt("ID");
        }
        System.out.println("new clientID = "+clientID);
        return clientID;
    }
  
  public static void saveDates(Reservation date) throws Exception{
    String query = "INSERT INTO reservation ( " +
                " Room_Number," +
                " Number_Persons," +
                " Depart_time," +
                " Return_time," +
                " clientID"+
                " ) VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = getConnection().prepareStatement(query);
        int i = 1;
        
        pstmt.setInt(i++, date.getNumberRooms());
        pstmt.setInt(i++, date.getNumberPersons());
        pstmt.setDate(i++, date.getDepartTime());
        pstmt.setDate(i++, date.getReturnTime());
        pstmt.setInt(i++, date.getClientID());
       if (pstmt.executeUpdate() == 0) {
            throw new Exception("Saving failed");
        }
}
  
  public static ArrayList<Vector> getActivities()throws Exception{
         String sql = "Select * from activities";
         PreparedStatement pstmt = getConnection().prepareStatement(sql); 
         ResultSet rs;
         rs= pstmt.executeQuery();
         ArrayList<Vector> activities = new ArrayList();
         
         while(rs.next()){
             Vector activity = new Vector();
             activity.add(0, rs.getString("ID"));
             activity.add(1, rs.getString("ActivityName"));
             
             activities.add(activity);
         }
         
         return activities;
     }
  
  public static void saveActivites(ArrayList activities, int clientID) throws Exception {
        String query = "INSERT INTO activityrelation ( "
                + " ActivityID,"
                + " ClientID) VALUES (?,?)";
        PreparedStatement pstmt = getConnection().prepareStatement(query);
        for (int j = 0; j < activities.size(); j++) {
            System.out.println("activities.get(j) "+activities.get(j));
            int activityID = Integer.parseInt(activities.get(j).toString());
            pstmt.setInt(1, activityID);
            pstmt.setInt(2, clientID);
            pstmt.executeUpdate();
        }

    }
}
