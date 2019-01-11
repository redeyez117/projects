
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6245DAA4-DA6B-2FEE-A74F-5280677CA704]
// </editor-fold> 
public class Student {

    
    private String fName;
    private String lName;
    private String gender;
  
    public Student () {
    }

    public Student (String fn, String ln, String gnd) {
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

