import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Color.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Game {
    
    States states;
    JFrame frame;
    JLabel label;
    JPanel panel;
    JTextField answer;
    JButton next;
    JLabel index_question;
    boolean[] correct;
    int index;

    int score;
    String capital;
    JLabel feedback;
    
    public Game() {
        states = new States();
        correct = new boolean[50];

        frame = new JFrame("USA Quiz");
        frame.setLayout(null);
        frame.setSize(900, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        capital = "";
        score = 0;
        
        play(0);
    }

    public void play(int question) {
        String state = "";
        String answerStr = "";
        
        index = 0;
        next = new JButton("Next");
        next.setPreferredSize(new Dimension(150, 30));
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame.getContentPane().removeAll();
                panel = null;
                label = null;
                answer = null;
                feedback = null;
                next = null;
                index_question = null;
                frame.invalidate();
                frame.validate();
                frame.repaint();
                frame.setVisible(true);
                System.out.println("button pressed");
                play(question+1);
                
                if (question == 19) {
                    panel = new JPanel();
                    panel.setBounds(200, 50, 550, 450);
        
                    label = new JLabel("     Sie haben " + score + " von 20 möglichen Punkten erreicht!");
                    label.setPreferredSize(new Dimension(360, 50));
                    panel.add(label);
        
                    frame.getContentPane().add(panel);
                    frame.invalidate();
                    frame.validate();
                    frame.setVisible(true);
                }
            }
        });

        if (question < 20) {
            index = (int) (Math.random() * 50);

            while (correct[index] == true) {
                index = (int) (Math.random() * 50);
            }
            state = (String) states.get_mapping().get(index);
            capital = (String) states.get_States().get(state);
        
            label = new JLabel("        Wie heißt die Bundeshauptstadt von " + state + "?");
            label.setPreferredSize(new Dimension(360, 50));
            
            index_question = new JLabel("    Frage " + (question+1) + " von 20");
            index_question.setBounds(400, 500, 300, 70);
            panel = new JPanel();
            panel.setBounds(200, 50, 550, 450);
            
            answer = new JTextField(30);
            answer.setEditable(true);

            panel.add(label);
            panel.add(answer);
            frame.getContentPane().add(panel);
            frame.getContentPane().add(index_question);

            frame.setVisible(true);

            answer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    String answerStr = event.getActionCommand();

                    if (capital.toLowerCase().equals(answerStr.toLowerCase())) {
                        score++;
                        feedback = new JLabel("                                                   Richtig!");
                        feedback.setPreferredSize(new Dimension(400, 70));
                        correct[index] = true;
                        panel.add(feedback);
                        panel.add(next);
                    }
                    else if (answerStr.toLowerCase().equals("stop")) {
                        feedback = new JLabel("Dein Score: " + score);
                        panel.add(feedback);
                    }
                    else {
                        if (answerStr.equals("") == false) {
                            feedback = new JLabel("              Falsch! Die richtige Antwort ist: " + capital);
                            feedback.setPreferredSize(new Dimension(400, 70));
                            panel.add(feedback);
                            panel.add(next);
                        }
                    }
                    frame.getContentPane().add(panel);
                    frame.invalidate();
                    frame.validate();
                    frame.setVisible(true);
                }
            });
        }
        
    }

    public String getCapital() {
        return capital;
    }

    // class Handler implements ActionListener {
    //     private String answerStr = "";
        
    //     public void actionPerformed(ActionEvent event) {
    //         System.out.println("Action performed!");
    //         answerStr = event.getActionCommand();

    //         if (answer.equals(event.getSource())) {
    //             if (capital.toLowerCase().equals(answerStr.toLowerCase())) {
    //                 score++;
    //                 feedback = new JLabel("Richtig!");
    //                 panel.add(feedback);
    //                 panel.add(next);
    //             }
    //             else if (answerStr.toLowerCase().equals("stop")) {
    //                 feedback = new JLabel("Dein Score: " + score);
    //                 panel.add(feedback);
    //             }
    //             else {
    //                 if (answerStr.equals("") == false) {
    //                     feedback = new JLabel("Falsch! Die richtige Antwort ist: " + capital);
    //                     panel.add(feedback);
    //                     panel.add(next);
    //                 }
    //             }
    //             frame.add(panel);
    //             frame.setVisible(true);
    //             System.out.println("answer");
    //         }

    //         else if (answer.equals(event.getSource())) {
    //             frame.remove(panel);
    //             frame.setVisible(true);
    //         }

    //         else System.out.println("wrtong source");
    //         // System.out.println("current score: " + score);
    //         // frame.add(panel);
    //         // System.out.println("vor dem warten");
    //         // frame.setVisible(true);
            
    //         // try {
    //         //     TimeUnit.SECONDS.sleep(4);
    //         //     System.out.println("erfolgreich gewartet");
    //         // }
    //         // catch (Exception e) {
    //         //     System.out.println("waiting for 4 secs went wrong");
    //         // }

    //         // frame.remove(panel);
    //         // frame.setVisible(true);


    //     }

    //     public String getAnswer() {
    //         return answerStr;
    //     }

    // }

}