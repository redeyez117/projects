/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package semesterproject;


public class QuizQA {
    private String question;
    private String alternative1;
    private String alternative2;
    private String alternative3;
    private String alternative4;
    private int correctAnswerIndex;

   public QuizQA(String questionP , String ans1P,String ans2P, String ans3P, String ans4P, int correctAnswerIndexP ){
       this.question=questionP;
       alternative1=ans1P;
       alternative2=ans2P;
       alternative3=ans3P;
       alternative4=ans4P;
       correctAnswerIndex=correctAnswerIndexP;
   }
public String getquestion() {
        return question;
    }

    public void setquestion(String question) {
        this.question = question;
    }

    public String getalternative1() {
        return alternative1;
    }

    public void setalternative1(String alternative1) {
        this.alternative1 = alternative1;
    }

    public String getalternative2() {
        return alternative2;
    }

    public void setalternative2(String alternative2) {
        this.alternative2 = alternative2;
    }

    public String getalternative3() {
        return alternative3;
    }

    public void setalternative3(String alternative3) {
        this.alternative3 = alternative3;
    }

    public String getalternative4() {
        return alternative4;
    }

    public void setalternative4(String alternative4) {
        this.alternative4 = alternative4;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public boolean isCorrectAnswer(String choice){
        String correctAnswer="";
        if(getCorrectAnswerIndex()==1){
            correctAnswer=getalternative1();
        }else if(getCorrectAnswerIndex()==2){
            correctAnswer=getalternative2();
        }else if(getCorrectAnswerIndex()==3){
            correctAnswer=getalternative3();

        }else{
            correctAnswer=getalternative4();
        }

        if(correctAnswer.equals(choice)){
            return true;
        }else{
            return false;
        }
    }
}
