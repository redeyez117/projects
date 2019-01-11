/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frens
 */
public class Admin {
    
    private String fName;
    private String lName;
    private String gender;
  
    public Admin () {
    }

    public Admin (String fn, String ln, String gnd) {
        fName=fn;
        this.lName=ln;
        this.gender=gnd;
    }

    public String getFName () {
        return fName;
    }
    public void setFName (String val) {
        this.fName = val;
    }
    public String getGender () {
        return gender;
    }
    public void setGender (String val) {
        this.gender = val;
    }
    public String getLName () {
        return lName;
    }
    public void setLName (String val) {
        this.lName = val;
    }
    
}
