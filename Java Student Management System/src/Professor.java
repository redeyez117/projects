

public class Professor {

 
    private String fname;
    private String lname;
    private String gender;
    private int phone;

    
    public Professor () {
    }
    
 public Professor (String fn, String ln, String gnd) {
        fname=fn;
        this.lname=ln;
        this.gender=gnd;
    }

    public String getFname () {
        return fname;
    }

    
    public void setFname (String val) {
        this.fname = val;
    }

   
    public String getGender () {
        return gender;
    }
    public void setGender (String val) {
        this.gender = val;
    } 
    public String getLname () {
        return lname;
    }     
    public void setLname (String val) {
        this.lname = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.21FB88F3-F051-FD11-743E-D4A5905E8963]
    // </editor-fold> 
    public int getPhone () {
        return phone;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3036A2D8-C4CA-0D0C-A7BE-7F4704C4AF5C]
    // </editor-fold> 
    public void setPhone (int val) {
        this.phone = val;
    }

}

