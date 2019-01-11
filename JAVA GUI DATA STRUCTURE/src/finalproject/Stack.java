
package finalproject;


import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Stack extends javax.swing.JDialog {

    private java.util.Stack mainStack;
    private Menu mainMenu;
    /** Creates new form Stack */
    public Stack(Menu mainMenuP) {
        initComponents();
        this.mainMenu = mainMenuP;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Stack");

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
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              AddStack a = new AddStack(this);
              a.setVisible(true);
              a.setDefaultCloseOperation(a.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        


        StackObject removePerson = (StackObject) JOptionPane.showInputDialog(this,
            "Choose person to delete?",
            "Deletion",
            JOptionPane.QUESTION_MESSAGE,
            null,
            mainStack.toArray(),
            mainStack.get(0));

        if(removePerson==null){
            return;
        }

        int indexToRemove=-1;
        for (int i = 0; i < mainStack.size(); i++) {
            StackObject object = (StackObject) mainStack.get(i);
            if(object.getName().toUpperCase().equals(removePerson.getName().toUpperCase())){
                indexToRemove = i;
                break;
            }
        }


        mainStack.remove(indexToRemove);
        setMainStack(mainStack);
        System.out.printf("Person deleted is : " + removePerson);
        System.out.println("allPersons "+ mainStack);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         java.util.Stack allPersons = getMainStack();

         java.util.Stack copyStack = allPersons;
         System.out.println("copy of the stack : " + copyStack);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO print

        java.util.Stack allPersons = getMainStack();

        System.out.println("allPersons.size() "+allPersons.size());
        int length = allPersons.size();

        StackObject topElement = (StackObject) allPersons.get(length-1);


        JOptionPane.showMessageDialog(this, " Top element is : " +topElement.getName() + " with : " + topElement.getTotalBankValues() + " dollars " );
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stack(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the mainStack
     */
    public java.util.Stack getMainStack() {
        return mainStack;
    }

    /**
     * @param mainStack the mainStack to set
     */
    public void setMainStack(java.util.Stack mainStack) {
        this.mainStack = mainStack;
        mainMenu.setAllPersonsFromStack(mainStack);
    }
}
