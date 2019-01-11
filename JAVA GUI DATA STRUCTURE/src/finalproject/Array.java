
package finalproject;

import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class Array extends javax.swing.JFrame {

    /** Creates new form Array */
    public Array() {
        initComponents();
    }

    private String[] elements;
    private int arrayLength;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Array");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sort");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Min");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Max");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Most Entered");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Equilibrium");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Remove ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton2)
                    .addComponent(jButton8))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton7))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(getElements()==null || getElements().length==0){
           JOptionPane.showMessageDialog(this, "First create an array ");
       }

       String[] elementsFromArray = getElements();
       int min = Integer.parseInt(elementsFromArray[0]);
       for (int i = 1; i < elementsFromArray.length; i++) {
          int intElement = Integer.parseInt(elementsFromArray[i]);
          if(min >= intElement){
              min = intElement;
          }
       }

       JOptionPane.showMessageDialog(this, "Min is: "+ min);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        button1ActionEvent();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if(getElements()==null || getElements().length==0){
           JOptionPane.showMessageDialog(this, "First create an array ");
       }

       String[] elementsFromArray = getElements();
       int max= Integer.parseInt(elementsFromArray[0]);
       for (int i = 1; i < elementsFromArray.length; i++) {
          int intElement = Integer.parseInt(elementsFromArray[i]);
          if(max <= intElement){
              max = intElement;
          }
       }

       JOptionPane.showMessageDialog(this, "Max is: "+ max);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          String[] elementsFromArray=getElements();
          
          int tmp;

          for (int i = 0; i < elementsFromArray.length - 1; i++) {
              for(int j = i+1 ; j<elementsFromArray.length ; j++){
                  if(Integer.parseInt(elementsFromArray[i]) > Integer.parseInt(elementsFromArray[j])){
                      tmp=Integer.parseInt(elementsFromArray[i]);
                      elementsFromArray[i]=""+Integer.parseInt(elementsFromArray[j]);
                      elementsFromArray[j]=""+tmp;
                  }
              }
     
        }

            
          JOptionPane.showMessageDialog(this, "Sorted array : " +Arrays.toString(elementsFromArray) );
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            String[] elementsFromArray=getElements();

            
           String n = JOptionPane.showInputDialog("Choose element to add: ");

           if(n==null || n.trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "You must enter an element to add ");
             return;
        }
           
            if(elementsFromArray.length==arrayLength){
                JOptionPane.showMessageDialog(this, "Array is full");
                //array is full
                return;
            }

           String[] addArray = new String[elementsFromArray.length+1];



           int elementToAdd = Integer.parseInt(n);
            
          

            int pos = elementsFromArray.length;

            for (int i = 0; i < elementsFromArray.length; i++) {
                addArray[i] = elementsFromArray[i];
            }

            addArray[pos] = ""+elementToAdd;

            elementsFromArray = addArray;
            
            JOptionPane.showMessageDialog(this, "after adding: " + Arrays.toString(elementsFromArray));
            setElements(elementsFromArray);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String[] elementsFromArray=getElements();

        if(elementsFromArray==null || elementsFromArray.length==0){
                //array is empty
                return;
        }

        String n = JOptionPane.showInputDialog("Choose element to remove: ");

        if(n==null || n.trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "You must enter an element to remove ");
             return;
        }

        int elementToRemove = Integer.parseInt(n);


        String[] tempArray = new  String[elementsFromArray.length-1];

        int pos=-1;
        int count=0;

        for(int i=0;i<elementsFromArray.length;i++){
               if(Integer.parseInt(elementsFromArray[i])==elementToRemove){
                    pos=i;
                    for(int j=i+1;j<elementsFromArray.length;j++){
                        if(Integer.parseInt(elementsFromArray[j])
                                ==Integer.parseInt(elementsFromArray[i])){
                            count++;
                        }else{
                            break;
                        }
                    }
                    break;
                }
        }
            if(pos==-1)
                   System.out.println("The value is not in the array");
            else{


            for(int i=0;i<pos;i++){
                tempArray[i]=elementsFromArray[i];
            }

            for(int i=pos;i<elementsFromArray.length-1;i++){
                tempArray[i]=elementsFromArray[i+1];
            }

            elementsFromArray = new String[tempArray.length];
            elementsFromArray = tempArray;


            }
           JOptionPane.showMessageDialog(this, " after removing: " + Arrays.toString(elementsFromArray));
setElements(elementsFromArray);




    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String[] elementsFromArray = getElements();
        int count = 1, tempCount;
       int popular = Integer.parseInt(elementsFromArray[0]);
       int temp = 0;
       for(int i = 0 ; i<elementsFromArray.length-1; i ++){
           temp=Integer.parseInt(elementsFromArray[i]);
           tempCount=0;
           for(int j=1 ; j<elementsFromArray.length; j++){
               if(temp==Integer.parseInt(elementsFromArray[j])){
                   tempCount++;
               }
               if(tempCount>count){
                   popular=temp;
                   count=tempCount;
               }
           }
           
       }
      JOptionPane.showMessageDialog(this, "most entered number in array is : " + popular);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String[] elementsFromArray = getElements();

        if (elementsFromArray == null || elementsFromArray.length < 3) {
            JOptionPane.showMessageDialog(this, "Array cannot be smaller than 3");
            return;
        }

        int pointer = 1;
        int lowerIndCount = Integer.parseInt(elementsFromArray[0]);
        int upperIndCount = 0;

        for (int i = 2; i < elementsFromArray.length; i++) {
            upperIndCount += Integer.parseInt(elementsFromArray[i]);
            if (lowerIndCount < 0) {
                if (upperIndCount > lowerIndCount && i != elementsFromArray.length - 1) {
                    continue;
                }
                if (upperIndCount == lowerIndCount && i == elementsFromArray.length - 1) {
                    break;
                }
                lowerIndCount += Integer.parseInt(elementsFromArray[pointer]);
                upperIndCount = 0;
                ++pointer;
                i = pointer;
            } else {
                if (upperIndCount > lowerIndCount) {
                    lowerIndCount += Integer.parseInt(elementsFromArray[pointer]);
                    upperIndCount = 0;
                    ++pointer;
                    i = pointer;
                }
            }
        }

        int equilibrium = -1;
        if (upperIndCount == lowerIndCount) {
            equilibrium = pointer;
            JOptionPane.showMessageDialog(this, "Equilibrium = " + equilibrium);
        } else {
            JOptionPane.showMessageDialog(this, "No equilibrium found ");
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void button1ActionEvent(){
         String n = JOptionPane.showInputDialog("Choose the length of the array: ");

         if(n==null || n.trim().isEmpty() || Integer.parseInt(n)==0){
             JOptionPane.showMessageDialog(this, "Array length cannot be 0 or null ");
             return;
         }

         arrayLength = Integer.parseInt(n);

         String s = JOptionPane.showInputDialog("Put elements on the Array seperated by ',' : ");

         if(s==null || s.trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "Array can not be empty! ");
             return;
         }

         
         String[] elements = s.split(",");
         System.out.println("elements.length() = " + elements.length);
         if(elements.length>arrayLength){
             JOptionPane.showMessageDialog(this,"Array is bigger than the length specified");
             return;
         }
         String arrayAsString="";
         for (int i = 0; i < elements.length; i++) {
             String element = elements[i];
             arrayAsString += element +",";
         }
         int commaIndex = arrayAsString.lastIndexOf(",");
         if(commaIndex!=-1){
             arrayAsString = arrayAsString.substring(0, commaIndex);
         }

         
         JOptionPane.showMessageDialog(this,"This is the Array entered: " + "[" + arrayAsString + "]");
         setElements(elements);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Array().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the elements
     */
    public String[] getElements() {
        return elements;
    }

    
    public void setElements(String[] elements) {
        this.elements = elements;
    }

}
