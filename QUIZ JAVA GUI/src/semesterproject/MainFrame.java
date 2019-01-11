package semesterproject;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;




    // <editor-fold defaultstate="collapsed" desc="Generated Code">



    // <editor-fold defaultstate="collapsed" desc="Generated Code">
public class MainFrame {

    public MainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }


    private JFrame mainFrame;
    private JLabel questionTextLabel;
    private String questionBorderText="Question NO ";
    private int questionCounter;
    private JRadioButton firstAlternative;
    private JRadioButton secondAlternative;
    private JRadioButton thirdAlternative;
    private JRadioButton fourthAlternative;
    private QuizQA currentQuestion;
    private TitledBorder titledBorder;
    private ButtonGroup buttonGroup;
    private int correctAnswerCounter;
    private JPanel questionpanel;

    public  MainFrame(){
        createGUI();
        startQuiz();
    }



    public JFrame getMainFrame(){
        return mainFrame;
    }


    private void createGUI(){
        mainFrame = new JFrame("Quiz");
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(getNorthPanel(), BorderLayout.NORTH);
        mainFrame.add(getCenterPanel(), BorderLayout.CENTER);
        mainFrame.add(getControlPanel(), BorderLayout.SOUTH);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 300);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

    }


    private JPanel getNorthPanel(){
        questionpanel = new JPanel();
        questionTextLabel = new JLabel();
        titledBorder = new TitledBorder(questionBorderText+questionCounter);
        //questionpanel.setBorder(titledBorder);
        questionpanel.add(questionTextLabel);
        return questionpanel;
    }

    private JPanel getCenterPanel(){
        JPanel panel = new JPanel(new BorderLayout());
        buttonGroup = new ButtonGroup();

        firstAlternative = new JRadioButton("");
        firstAlternative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action_Button_Pressed(e);
            }
        });
        secondAlternative = new JRadioButton("");
        secondAlternative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action_Button_Pressed(e);
            }
        });
        thirdAlternative = new JRadioButton("");
        thirdAlternative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action_Button_Pressed(e);
            }
        });
        fourthAlternative = new JRadioButton("");
        fourthAlternative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action_Button_Pressed(e);
            }
        });
        buttonGroup.add(firstAlternative);
        buttonGroup.add(secondAlternative);
        buttonGroup.add(thirdAlternative);
        buttonGroup.add(fourthAlternative);


        JPanel gridPanel = new JPanel(new GridLayout(4,0));
        gridPanel.add(firstAlternative);
        gridPanel.add(secondAlternative);
        gridPanel.add(thirdAlternative);
        gridPanel.add(fourthAlternative);
        panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED,Color.BLUE,Color.BLUE));
        panel.add(gridPanel,BorderLayout.NORTH);
        return panel;
    }

    private JPanel getControlPanel(){
        JPanel panel = new JPanel();
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action_Close();
            }
        });
        panel.add(closeButton);
        return panel;
    }

    private void startQuiz(){
        ArrayList<QuizQA> arrayList = QuestionsAnswers.quizQA();
        int randomNo = ThreadLocalRandom.current().nextInt(0, 14);
        System.out.println("randomNo = " + randomNo);
        QuizQA quizQAObject = arrayList.get(randomNo);
        questionCounter = 0;
        loadQuestionToGUI(quizQAObject);
    }

    private void loadNextQuestion(){
        ArrayList<QuizQA> arrayList = QuestionsAnswers.quizQA();
        int randomNo = ThreadLocalRandom.current().nextInt(0, 13);

        QuizQA quizQAObject = arrayList.get(randomNo);
        //questionCounter = 0;
        loadQuestionToGUI(quizQAObject);
    }

    private void loadQuestionToGUI(QuizQA quizQA){
        questionCounter++;
        questionpanel.setBorder(new TitledBorder(questionBorderText+questionCounter));
        this.currentQuestion = quizQA;
        questionTextLabel.setText(quizQA.getquestion());
         firstAlternative.setText(quizQA.getalternative1());
        secondAlternative.setText(quizQA.getalternative2());
        thirdAlternative.setText(quizQA.getalternative3());
        fourthAlternative.setText(quizQA.getalternative4());


    }

    private void action_Button_Pressed(ActionEvent event){

        JRadioButton radioButton = (JRadioButton) event.getSource();

        if(currentQuestion.isCorrectAnswer(radioButton.getText())){
            JOptionPane.showMessageDialog(mainFrame,"Correct");
            correctAnswerCounter++;
            if(correctAnswerCounter==5){
               JOptionPane.showMessageDialog(mainFrame,"You Won");
               System.exit(0);
               return;
            }
            loadNextQuestion();

        }else {
            //JOptionPane.showMessageDialog(mainFrame,"Wrong Answer");
            JOptionPane.showOptionDialog(mainFrame,
            "         Wrong answer",
            "",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            new String[]{"Retry"}, // this is the array
            "default");
            correctAnswerCounter = 0;
            startQuiz();
        }
             buttonGroup.clearSelection();


    }

    private void action_Close(){
        mainFrame.setVisible(false);
        mainFrame.dispose();
    }

    public static void main(String [] Args){
            new MainFrame();
    }


}

