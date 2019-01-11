/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LinkedList.java
 *
 * Created on Jun 5, 2016, 11:35:15 AM
 */

package finalproject;

import javax.swing.JOptionPane;

public class LinkedList extends javax.swing.JFrame {

   
    public LinkedList() {
        initComponents();
    }

   private java.util.LinkedList<LinkedListObject> persons;
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
        setTitle("LinkedList");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sort Age");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Max Bank Account");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Youngest");
        jButton4.setToolTipText("");
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
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton5))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton6))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(62, 62, 62)
                .addComponent(jButton7)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LLMenu ll =new LLMenu(this);
       ll.setVisible(true);
       setPersons(ll.getPersons());
       ll.setDefaultCloseOperation(ll.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO sort by age
         java.util.LinkedList <LinkedListObject> allPersons = getPersons();

        if(allPersons==null || allPersons.isEmpty()){
          JOptionPane.showMessageDialog(this, "Array is empty");
        }
          int tmp;

          for (int i = 0; i < allPersons.size() - 1; i++) {
              for(int j = i+1 ; j<allPersons.size() ; j++){
                  if(Integer.parseInt(allPersons.get(i).getAge()) > Integer.parseInt(allPersons.get(j).getAge())){
                     LinkedListObject o = allPersons.get(i);
                      allPersons.set(i, allPersons.get(j));
                      allPersons.set(j, o);
                  }
              }

        }


          JOptionPane.showMessageDialog(this, "Sorted array : " +allPersons);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO max bank account:
         java.util.LinkedList <LinkedListObject> allPersons = getPersons();
         int max = allPersons.get(0).getTotalBankValues();
       LinkedListObject personWithMaxBankAccounts = allPersons.get(0);
       for (int i = 1; i < allPersons.size(); i++) {
          int intElement = allPersons.get(i).getTotalBankValues();
          if(max <= intElement){
              max = intElement;
              personWithMaxBankAccounts = allPersons.get(i);
          }
       }

        JOptionPane.showMessageDialog(this, " Biggest Bank Account is : " +personWithMaxBankAccounts.getName() + " with : " + max + " dollars " );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO Youngest:

        java.util.LinkedList<LinkedListObject> allPersons = getPersons();




       int min = Integer.parseInt(allPersons.get(0).getAge());
      LinkedListObject personWithMaxBankAccounts = allPersons.get(0);
       for (int i = 1; i < allPersons.size(); i++) {
          int intElement = Integer.parseInt(allPersons.get(i).getAge());
          if(min >= intElement){
              min = intElement;
              personWithMaxBankAccounts = allPersons.get(i);
          }
       }

       JOptionPane.showMessageDialog(this, " The youngest is : " + personWithMaxBankAccounts.getName()+" " + min + " years old ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO remove:

        java.util.LinkedList<LinkedListObject> allPersons = getPersons();

         LinkedListObject personToDelete = (LinkedListObject) JOptionPane.showInputDialog(this,
            "Choose person to delete?",
            "Deletion",
            JOptionPane.QUESTION_MESSAGE,
            null,
            allPersons.toArray(),
            allPersons.get(0));

        int indexToRemove=-1;
        for (int i = 0; i < allPersons.size(); i++) {
           LinkedListObject object = allPersons.get(i);
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
        java.util.LinkedList<LinkedListObject> allPersons = getPersons();
        AddList aL= new AddList(this);
        aL.setVisible(true);
        setPersons(aL.getPersons());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       java.util.LinkedList<LinkedListObject> allPersons = getPersons();

        if(allPersons==null || allPersons.isEmpty()){
          JOptionPane.showMessageDialog(this, "Array is empty");
        }



        ModBankAccountsLinkedList mbal= new ModBankAccountsLinkedList(this);
        mbal.setVisible(true);

        setPersons(mbal.getPersons());
        mbal.setDefaultCloseOperation(mbal.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkedList().setVisible(true);
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
    public java.util.LinkedList<LinkedListObject> getPersons() {
        return persons;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(java.util.LinkedList<LinkedListObject> persons) {
        this.persons = persons;
    }

}
