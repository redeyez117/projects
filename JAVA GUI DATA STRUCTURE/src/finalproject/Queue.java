
package finalproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Queue extends javax.swing.JFrame {

    /** Creates new form Queue */
    public Queue(Menu menu) {
        initComponents();
        this.menu = menu;
    }

    private Menu menu;
    private QueueManual mainQueue;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Queue");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Create Copy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        

//        QueueObject personToDelete = (QueueObject) JOptionPane.showInputDialog(this,
//            "Choose person to delete?",
//            "Deletion",
//            JOptionPane.QUESTION_MESSAGE,
//            null,
//            mainQueue.toArray(),
//            mainQueue.toArray()[0]);
//
//        int indexToRemove=-1;
//
//        for (int i = 0; i < mainQueue.size(); i++) {
//            QueueObject object = (QueueObject)mainQueue.toArray()[i];
//            if(object.getName().toUpperCase().equals(personToDelete.getName().toUpperCase())){
//                indexToRemove = i;
//                break;
//            }
//
//
//        }


         mainQueue.remove();

         mainQueue.printQueue();
        //System.out.printf("Person deleted is : " + personToDelete);
       // System.out.println("allPersons "+ mainQueue);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //todo
        QueueManual queue = getMainQueue().copy();

        
         queue.printQueue();
         //JOptionPane.showMessageDialog(this, "copy of Queue is: " + CopyQueue);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

          String n = JOptionPane.showInputDialog("Choose the length : ");
           int arrayLength=0;
         if(n==null || n.trim().isEmpty() || Integer.parseInt(n)==0){
             JOptionPane.showMessageDialog(this, "Array length cannot be 0 or null ");
             return;
         }

         arrayLength = Integer.parseInt(n);

        
        AddQueue a = new AddQueue(this, arrayLength);
        a.setVisible(true);
        a.setDefaultCloseOperation(a.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        QueueManual allPersons = getMainQueue();


        
        QueueObject topElement = (QueueObject) allPersons.peek();


        JOptionPane.showMessageDialog(this, " Top element is : " +topElement.getName() + " with : " + topElement.getTotalBankValues() + " dollars " );
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queue(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
public QueueManual getMainQueue() {
        return mainQueue;
    }

    /**
     * @param mainStack the mainStack to set
     */
    public void setMainQueue(QueueManual mainQueue) {
        this.mainQueue = mainQueue;
        this.menu.setAllPersonsFromQueue(mainQueue);
    }
}
