/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

/**
 *
 * @author hp
 */
public class QueueManual {


    private int maxSize;
   private  QueueObject [] arr;
   private int front;
   private int back;
   private int n=0;

   public QueueManual(int s){
       maxSize=s;
       arr=new QueueObject [maxSize];
       front=0;
       back=-1;
       n=0;
   }
   public QueueManual(int size, String name, String surname, String age, String bankAcc1, String bankAcc2, String bankAcc3){
       this(size);
       push(name,surname,age,bankAcc1,bankAcc2,bankAcc3); 

    }
   public boolean isEmpty(){
       if(n==0)
           return true;
       return false;
   }
   public boolean isFull(){
       if(n==maxSize)
           return true;
       return false;
   }
   public void push(String name, String surname, String age,String bankAcc1,String bankAcc2,String bankAcc3){// this will make possible to enter the values
       if(isFull()){
           System.out.println("The queue is full");
           return;
       }
       back=(back+1)%maxSize;
       QueueObject newEl = new QueueObject();
       newEl.setName(name);
       newEl.setSurname(surname);
       newEl.setAge(""+age);
       newEl.setBankAccount1(""+bankAcc1);
       newEl.setBankAccount2(""+bankAcc2);
       newEl.setBankAccount3(""+bankAcc3);

        this.getArr()[back]=newEl; // this will take in the position of array of back to be equal to the new element
       n++;      // we will increment the n ++
   }
   public void remove(){ // this function will remove the element from the queue
       if(isEmpty()){
           System.out.println("The queue is empty");
           return;
       }
       front=(front+1)%maxSize;
       n--;
   }

   public  QueueManual copy(){ // this it will make the copy of all Queue
       if(isEmpty()){
           System.out.println("Empty");
       return null;
       }
       QueueObject [] tmp = new QueueObject[n];
       int i=0;
       while(!isEmpty()){
           tmp[i]=peek();
           i++;
           remove();
       }
       QueueManual t =new QueueManual (tmp.length);
        for(int j=0;j<tmp.length;j++){
            
            push(tmp[j].getName(),tmp[j].getSurname(),tmp[j].getAge(),tmp[j].getBankAccount1(),tmp[j].getBankAccount2(),tmp[j].getBankAccount3());
            System.out.println("Name : " + tmp[j].getName());
            System.out.println("Surname : " + tmp[j].getSurname());
            System.out.println("Age : " + tmp[j].getAge());
            System.out.println("Bank Account 1 : " + tmp[j].getBankAccount1());
            System.out.println("Bank Account 2 : " + tmp[j].getBankAccount2());
            System.out.println("Bank Account 3 : " + tmp[j].getBankAccount3());
            t.push(tmp[j].getName(),tmp[j].getSurname(),tmp[j].getAge(),tmp[j].getBankAccount1(),tmp[j].getBankAccount2(),tmp[j].getBankAccount3());
       }
           return t;
   }
   public void  PrinttheNamesofTotalBanks(){ // it will print the names of total bank of each Person
        if(isEmpty()){
        System.out.println("Print the names of total of bank accounts");
         }
        QueueManual tmp = copy ();
        QueueObject p = null;
        while(! tmp.isEmpty()){
            p =tmp.peek();
            tmp.remove();
        }
        System.out.println("Name is " +p.getName() + " plus the total of bankaccount is : " +p.getTotalBankValues());
   }

     public QueueObject peek(){
       if(isEmpty()){ // it will check the first element in the queve
           System.out.println("The array is empty");
           return null; // it returns null
       }
       return getArr()[front];
   }

   public void printQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        QueueManual tmp = copy ();
        QueueObject p = null;
        while(! tmp.isEmpty()){
            p =tmp.peek();
            tmp.remove();
            //System.out.println("Name surname age "+p.getName()+p.getSurname()+p.getAge());
   }
   }

    /**
     * @return the arr
     */
    public QueueObject[] getArr() {
        return arr;
    }

    public void setArr(QueueObject[] arr) {
        this.arr = arr;
    }

}
