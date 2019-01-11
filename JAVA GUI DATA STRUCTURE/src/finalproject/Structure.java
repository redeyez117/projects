/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Structure.java
 *
 * Created on Jun 5, 2016, 11:35:24 AM
 */

package finalproject;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Structure extends javax.swing.JFrame {

    /** Creates new form Structure */
    public Structure() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Structure");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sort Age");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Youngest");
        jButton3.setToolTipText("");
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

        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Modify");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(6, 6, 6))
                    .addComponent(jButton5))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(57, 57, 57)
                .addComponent(jButton7)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<StructureObject> persons;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        STMenu stm= new STMenu(this);
        stm.setVisible(true);
       
        setPersons(stm.getPersons());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        ArrayList<StructureObject> allPersons = getPersons();

        if(allPersons==null || allPersons.isEmpty()){
          JOptionPane.showMessageDialog(this, "Array is empty");
        }
          int tmp;

          for (int i = 0; i < allPersons.size() - 1; i++) {
              for(int j = i+1 ; j<allPersons.size() ; j++){
                  if(Integer.parseInt(allPersons.get(i).getAge()) > Integer.parseInt(allPersons.get(j).getAge())){
                      //tmp = i;
                      StructureObject o = allPersons.get(i);
                      allPersons.set(i, allPersons.get(j));
                      allPersons.set(j, o);
                      //tmp=Integer.parseInt(allPersons.get(i).getAge());
                      //allPersons.get(i).setAge(""+Integer.parseInt(allPersons.get(j).getAge()));
                      //allPersons.get(j).setAge(""+tmp);
                  }
              }

        }


          JOptionPane.showMessageDialog(this, "Sorted array : " +allPersons);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArrayList<StructureObject> allPersons = getPersons();




       int min = Integer.parseInt(allPersons.get(0).getAge());
      StructureObject personWithMaxBankAccounts = allPersons.get(0);
       for (int i = 1; i < allPersons.size(); i++) {
          int intElement = Integer.parseInt(allPersons.get(i).getAge());
          if(min >= intElement){
              min = intElement;
              personWithMaxBankAccounts = allPersons.get(i);
          }
       }

       JOptionPane.showMessageDialog(this, " The youngest is : " + personWithMaxBankAccounts.getName()+" " + min + " years old ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
              ArrayList<StructureObject> allPersons = getPersons();


       int max = allPersons.get(0).getTotalBankValues();
       StructureObject personWithMaxBankAccounts = allPersons.get(0);
       for (int i = 1; i < allPersons.size(); i++) {
          int intElement = allPersons.get(i).getTotalBankValues();
          if(max <= intElement){
              max = intElement;
              personWithMaxBankAccounts = allPersons.get(i);
          }
       }

        JOptionPane.showMessageDialog(this, " Biggest Bank Account is : " +personWithMaxBankAccounts.getName() + " with : " + max + " dollars " );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        ArrayList<StructureObject> allPersons = getPersons();

        StructureObject personToDelete = (StructureObject) JOptionPane.showInputDialog(this,
            "Choose person to delete?",
            "Deletion",
            JOptionPane.QUESTION_MESSAGE,
            null,
            allPersons.toArray(),
            allPersons.get(0));

        int indexToRemove=-1;
        for (int i = 0; i < allPersons.size(); i++) {
            StructureObject object = allPersons.get(i);
            if(object.getName().toUpperCase().equals(personToDelete.getName().toUpperCase())){
                indexToRemove = i;
                break;
            }
        }

        

       System.out.printf("Person deleted is : " + personToDelete);
       allPersons.remove(indexToRemove);

        System.out.println("allPersons "+ allPersons);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ArrayList<StructureObject> allPersons = getPersons();
        AddStructure aS = new AddStructure(this);
        aS.setVisible(true);
        setPersons(aS.getPersons());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ArrayList<StructureObject> allPersons = getPersons();

        if(allPersons==null || allPersons.isEmpty()){
          JOptionPane.showMessageDialog(this, "Array is empty");
        }



        ModBankAccounts mba= new ModBankAccounts(this);
        mba.setVisible(true);
      
        setPersons(mba.getPersons());
         mba.setDefaultCloseOperation(mba.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton7ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Structure().setVisible(true);
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
    // End of variables declaration//GEN-END:variables

    /**
     * @return the persons
     */
    public ArrayList<StructureObject> getPersons() {
        return persons;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(ArrayList<StructureObject> persons) {
        this.persons = persons;
    }

}
