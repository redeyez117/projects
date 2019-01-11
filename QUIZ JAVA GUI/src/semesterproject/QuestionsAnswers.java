/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package semesterproject;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class QuestionsAnswers {

    public static ArrayList quizQA(){
        ArrayList<QuizQA> arrayList=new ArrayList<QuizQA>();
        arrayList.add(new QuizQA("what is java","java is a programming language","java is java", "java is a number","java is a string",1));
        arrayList.add(new QuizQA("what is c","c is a number","c is c", "c is a programming language","c is a string",3));
        arrayList.add(new QuizQA("what is c++","c++ is a string","c++ is c++", "c++ is a number","c++ is a programming language",4));
        arrayList.add(new QuizQA("What is the compound for :C12H22O11","Salt","Sugar","Pepper","Nitrogen",2));
        arrayList.add(new QuizQA("Which is further north?", "Alaska ","Maine", "Kanada ", " North Dakota" ,1));
        arrayList.add(new QuizQA("Which country has the flag yellow with red sun?" , " Malta","  Indonesia", " Macedonia", " China", 3));
        arrayList.add(new QuizQA("Who is the highest  referent of the Catalan modernism?"," Montaner" , "Gaudi" , "Gaudio" , "Sabater" , 2));
        arrayList.add(new QuizQA("Who implemented the hourly workload in Brazil?" ,"Getulio Vargas", "Juscelino kubitchek","Julio  Prestes","Don Domingo" ,1));
        arrayList.add(new QuizQA("which countries have conflict over Crimea?", "Palestina and Israel" ,"Russia and Turkey" ,"Ukraine and Russia","Libia and Egypt" ,3));
        arrayList.add(new QuizQA("What is the first name of the artist Dali?", "Henry","Salvador","Rodrigo" ,"Carlos",2));
        arrayList.add(new QuizQA("Which historical character has killed most people?" , "Adolf Hitler" , "Mao Ze Dong", "Jozef Stalin", "KimII Song" ,2));
        arrayList.add(new QuizQA("Which is the highest mountain?", "Kilimangaro","Mont Blanc","Everest","Chimborazo",3));
        arrayList.add(new QuizQA("Who killed Kennedy?","Barack Obama","Osama Bin Laden","The Babushka Lady","Noone of them",4));
        arrayList.add(new QuizQA("Which country di Skanderbeg fight?","Germany","Turkey","Italy","Serbia",2));
        arrayList.add(new QuizQA("Who created Microsoft","Steve Jobs","Mark Zukemberg","Steve Wozniack", "Bill Gates",4));
        return arrayList;

    }

}
