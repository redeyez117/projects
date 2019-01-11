
package finalproject;

import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author hp
 */
public class TreeGUI extends javax.swing.JFrame {

    /** Creates new form Tree */
    private java.util.Stack personsFromStack;
    private QueueManual personsFromQueue;

    public static JTree tree;
    DefaultMutableTreeNode categoryOfStack = null;
    DefaultMutableTreeNode categoryOfQueue = null;

    public TreeGUI(java.util.Stack fromStack, QueueManual fromQueue) {
        initComponents();
        this.personsFromStack = fromStack;
    this.personsFromQueue = fromQueue;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tree");

        jButton1.setText("Create Tree by Age of the Stack");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Tree By Accounts of the Queue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sum of Bank Accounts");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Average for each person");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Add Elements");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Remove Elements");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addGap(28, 28, 28)
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addGap(33, 33, 33)
                .addComponent(jButton5)
                .addGap(27, 27, 27)
                .addComponent(jButton6)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultMutableTreeNode top =   new DefaultMutableTreeNode("Persons");
        createNodesFromStack(top);
        tree = new JTree(top);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultMutableTreeNode top =   new DefaultMutableTreeNode("Persons");
        createNodesFromQueue(top);
        tree = new JTree(top);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      int wholeSum = 0;
        for (int i = 0; i < personsFromQueue.getArr().length; i++) {
            QueueObject object = (QueueObject)personsFromQueue.getArr()[i];
            wholeSum += object.getTotalBankValues();
        }

      JOptionPane.showMessageDialog(this, "Overall sum is : "+wholeSum);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String averagesOfPersons="";
        for (int i = 0; i < personsFromQueue.getArr().length; i++) {
            QueueObject object = (QueueObject)personsFromQueue.getArr()[i];
            averagesOfPersons += object.getName()+" average is : "+object.getBankAccountsAverage() +"\n";
        }

        JOptionPane.showMessageDialog(this, "Averages : "+averagesOfPersons);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String[] choices = new String[]{"Queue","Stack"};
        String selected = (String) JOptionPane.showInputDialog(this,
            "Add to :",
            "Add Element",
            JOptionPane.QUESTION_MESSAGE,
            null,
            choices,
            choices[0]);

        if(selected==null){
            return;
        }


        String n = JOptionPane.showInputDialog("Choose element to add: ");

        if(n==null || n.trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "You must enter an element to add ");
           return;
        }


        DefaultMutableTreeNode node = new DefaultMutableTreeNode(n);

        if(selected.equals(choices[0])){
            categoryOfQueue.add(node);
            System.out.println("updated tree from queue ");
            for (int i = 0; i < categoryOfQueue.getChildCount(); i++) {
                DefaultMutableTreeNode object = (DefaultMutableTreeNode) categoryOfQueue.getChildAt(i);
                System.out.println(object);
            }
        }else{
            categoryOfStack.add(node);
            System.out.println("updated tree from stack ");
            for (int i = 0; i < categoryOfStack.getChildCount(); i++) {
                DefaultMutableTreeNode object = (DefaultMutableTreeNode) categoryOfStack.getChildAt(i);
                System.out.println(object);
            }
        }



    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String[] choices = new String[]{"Queue","Stack"};
        String selected = (String) JOptionPane.showInputDialog(this,
            "Remove from :",
            "Remove Element from",
            JOptionPane.QUESTION_MESSAGE,
            null,
            choices,
            choices[0]);

        if(selected==null){
            return;
        }


        String n = JOptionPane.showInputDialog("Choose element to remove: ");

        if(n==null || n.trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "You must enter an element to remove ");
             return;
        }

        if(selected.equals(choices[0])){
            for (int i = 0; i < categoryOfQueue.getChildCount(); i++) {
                DefaultMutableTreeNode object = (DefaultMutableTreeNode) categoryOfQueue.getChildAt(i);
                System.out.println("object.toString() "+object.toString());
                if(object.toString().equals(n)){
                    categoryOfQueue.remove(i);
                    break;
                }
            }
            for (int i = 0; i < categoryOfQueue.getChildCount(); i++) {
                DefaultMutableTreeNode object = (DefaultMutableTreeNode) categoryOfQueue.getChildAt(i);
                System.out.println("updated tree from queue "+object);
            }
        }else{
            for (int i = 0; i < categoryOfStack.getChildCount(); i++) {
                DefaultMutableTreeNode object = (DefaultMutableTreeNode) categoryOfStack.getChildAt(i);
                //System.out.println("object.toString() "+object.toString());
                if(object.toString().equals(n)){
                    categoryOfStack.remove(i);
                    break;
                }
            }
            System.out.println("updated tree from stack ");
            for (int i = 0; i < categoryOfStack.getChildCount(); i++) {
                DefaultMutableTreeNode object = (DefaultMutableTreeNode) categoryOfStack.getChildAt(i);
                System.out.println(object);
            }
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void createNodesFromQueue(DefaultMutableTreeNode top) {
        
        DefaultMutableTreeNode node = null;
        categoryOfQueue = new DefaultMutableTreeNode("Bank Accounts from Queue");
        top.add(categoryOfQueue);

        for (int i = 0; i < personsFromQueue.getArr().length; i++) {
            QueueObject object = (QueueObject)personsFromQueue.getArr()[i];
            node = new DefaultMutableTreeNode(object.getBankAccount1());
            categoryOfQueue.add(node);
            node = new DefaultMutableTreeNode(object.getBankAccount2());
            categoryOfQueue.add(node);
            node = new DefaultMutableTreeNode(object.getBankAccount3());
            categoryOfQueue.add(node);
        }

        for (int i = 0; i < categoryOfQueue.getChildCount(); i++) {
            DefaultMutableTreeNode object = (DefaultMutableTreeNode) categoryOfQueue.getChildAt(i);
            System.out.println(object);
        }
    }

    private void createNodesFromStack(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode node = null;
        categoryOfStack = new DefaultMutableTreeNode("Ages from Stack");
        top.add(categoryOfStack);

        for (int i = 0; i < personsFromStack.size(); i++) {
            StackObject object = (StackObject)personsFromStack.get(i);
            node = new DefaultMutableTreeNode(object.getAge());
            categoryOfStack.add(node);
        }

        for (int i = 0; i < categoryOfStack.getChildCount(); i++) {
            DefaultMutableTreeNode object = (DefaultMutableTreeNode) categoryOfStack.getChildAt(i);
            System.out.println(object);
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreeGUI(null, null).setVisible(true);
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
    // End of variables declaration//GEN-END:variables

}
