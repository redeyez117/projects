package finalproject;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {
    public static JTree tree;
    private java.util.Stack persons;

    public Tree(java.util.Stack personsP ) {
        this.persons = personsP;
        //Create the nodes.
        DefaultMutableTreeNode top =
            new DefaultMutableTreeNode("Persons");
        createNodes(top);
        tree = new JTree(top);
    }

    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode node = null;

        category = new DefaultMutableTreeNode("Ages from Stack");
        top.add(category);

        for (int i = 0; i < persons.size(); i++) {
            StackObject object = (StackObject)persons.get(i);
            node = new DefaultMutableTreeNode(object.getAge());
            category.add(node);
        }

    }

    public static void main(String[] Args){
        StackObject ob1 = new StackObject();
        ob1.setAge("23");

        StackObject ob2 = new StackObject();
        ob1.setAge("34");

        java.util.Stack stack = new java.util.Stack();

        stack.add(ob1);
        stack.add(ob2);



        new Tree(stack);
        print();
    }

 public static void print(){


System.out.println("tree "+tree.toString());

}


    }


