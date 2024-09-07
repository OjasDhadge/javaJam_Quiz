package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;

    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+ name + " to JavaJam Quiz" );
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Mongolian Baiti",Font.ITALIC, 28 ));
        heading.setForeground(new Color(95, 0, 160));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN, 16 ));
        rules.setText(
            "<html>"+
            "1. Start the game by entering your name on the main page." + "<br><br>" +
            "2. Each question will have multiple-choice options (A, B, C, D). Select your answer by entering the corresponding letter." + "<br><br>" +
            "3. Earn points for each correct answer. Incorrect answers do not deduct points." + "<br><br>" +
            "4. You have a limited time (e.g., 30 seconds) to answer each question." + "<br><br>" +
            "5. Use hints if youre stuck, but remember, you have a limited number of hints." + "<br><br>" +
            "6. The game ends after all questions are answered. Your total score will be displayed, and you can choose to restart or exit." + "<br><br>" +
            "<html>"
        );
        add(rules);


        start = new JButton("Start"); //start button
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(95, 0, 160));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


        back = new JButton("Back"); //back button
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(95, 0, 160));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(800, 650); //for jframe
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else {
            setVisible(false);//if back button is pressed return login frame
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }

}
