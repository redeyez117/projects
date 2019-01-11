/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bachelor
 */
public class SystemManager {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFName("Brad");
        s1.setLName("Pitt");
        s1.setGender("Male");

        Student s2 = new Student();
        s2.setFName("Angelina");
        s2.setLName("Jolie");
        s2.setGender("Female");

        Student s3 = new Student ("Agim","Gjata","male");

         System.out.println("The name of the Student is: "+s3.getFName());

//        System.out.println("The name of the Student is: "+s1.getFName());
//        System.out.println("The last name of the Student is: "+s1.getLName());
//        System.out.println("The name of the Student is: "+s2.getFName());
//        System.out.println("The last name of the Student is: "+s2.getLName());
    }

}
