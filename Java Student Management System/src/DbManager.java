/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bachelor
 */
public class DbManager {
    
        static String [] ID = {"1","2","3","4","5","6","7","8","9","10"};
        static String [] Pass = {"1","2","3","4","5","6","7","8","9","10"};
        static String [] Role = {"P","S","S","S","P","S","S","P","A","S"};
        static String [] FName = {"Agim","Erjon","Marin","Erind","Teo","Redi","Agron","Giljana","Arnela","Anisa"};
        static String [] LName = {"Bejko","Veliaj","Basha","Bedalli","Mema","Ramosaco","Veli","Limani","Furriku","Male"};
        static String [] Gender = {"Male","Male","Male","Male","Male","Male","Male","Male","Female","Female","Female"};
        static int index = 0;


        public static boolean Authenticate(String id, String pass){
                boolean found = false;
                
                for ( int i = 0 ; i<ID.length ; i++){
                    if (id.equals(ID[i]) && pass.equals(Pass[i])){
                        found = true;
                        index = i;
                        break;
                    }
                }
            return found;
        }
        
        public static String GetRole(int index){
            return Role[index];
        }

         public static String GetFName(int index){
            return FName[index];
        }

          public static String GetLName(int index){
            return LName[index];
        }

           public static String GetGender(int index){
            return Gender[index];
        }
}
