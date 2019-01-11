
package com.list;

public class Bean {
    private String number1;
    private String number2;
    private String operation;
    private int result;
    
    public Bean(){
        
    }
    
    public int getResult(){
        if(getOperation().equals("+")){
            return result = Integer.parseInt(getNumber1())+ Integer.parseInt(getNumber2());
        }else if(getOperation().equals("-")){
            return result=Integer.parseInt(getNumber1()) - Integer.parseInt(getNumber2());
    }else if(getOperation().equals("*")){
            return result= Integer.parseInt(getNumber1()) * Integer.parseInt(getNumber2());
}else{
       
            return result=Integer.parseInt(getNumber1()) / Integer.parseInt(getNumber2());
    
    }
    }
    
    public void setResult(String operation){
        if(operation.equals("+")|| operation.equals("-")|| operation.equals("*")){
            this.operation=operation;
        }else{
            this.operation="/";
        }
    }

   
    public String getNumber1() {
        return number1;
    }

    
    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    
    public String getNumber2() {
        return number2;
    }

    
    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    
    public String getOperation() {
        return operation;
    }

    
    public void setOperation(String operation) {
        this.operation = operation;
    }
}
