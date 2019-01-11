/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;


public class StackObject {

    private String name = "";
    private String surname = "";
    private String age = "";
    private String bankAccount1 = "";
    private String bankAccount2 = "";
    private String bankAccount3 = "";

    public String toString() {
        return name+" "+surname+ " Age: " +age+ " Bank Account Nr1 : " +bankAccount1 + " Bank Account Nr2: " + bankAccount2 + " Bank Account Nr3: " + bankAccount3;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getSurname() {
        return surname;
    }

    
    public void setSurname(String surname) {
        this.surname = surname;
    }

   
    public String getAge() {
        return age;
    }

    
    public void setAge(String age) {
        this.age = age;
    }

    
    public String getBankAccount1() {
        return bankAccount1;
    }

  
    public void setBankAccount1(String bankAccount1) {
        this.bankAccount1 = bankAccount1;
    }

    public String getBankAccount2() {
        return bankAccount2;
    }

    public void setBankAccount2(String bankAccount2) {
        this.bankAccount2 = bankAccount2;
    }

    public String getBankAccount3() {
        return bankAccount3;
    }

    public void setBankAccount3(String bankAccount3) {
        this.bankAccount3 = bankAccount3;
    }

    public int getTotalBankValues(){
        int sum = 0;
        sum += Integer.parseInt(bankAccount1) + Integer.parseInt(bankAccount2) + Integer.parseInt(bankAccount3);

        return sum;
    }



}
