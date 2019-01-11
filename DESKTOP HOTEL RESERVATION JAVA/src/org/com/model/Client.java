
package org.com.model;



public class Client {


private int id=-1;
private String name;
private String surName;
private String email;
private String password;


    
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    public String getSurName() {
        return surName;
    }

   
    public void setSurName(String surName) {
        this.surName = surName;
    }

    
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the id
     */
    public int getID() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setID(int id) {
        this.id = id;
    }



    
}
