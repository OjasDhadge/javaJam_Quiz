package quiz.application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tfname;

    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/QuizTime.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);


        JLabel heading = new JLabel("JavaJam Quiz");
        heading.setBounds(770,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.ITALIC, 40 ));
        heading.setForeground(new Color(95, 0, 160));
        add(heading);


        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18 ));
        name.setForeground(new Color(255, 16, 240));
        add(name);


        tfname = new JTextField();
        tfname.setBounds(730, 200, 300, 30);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 22));
        tfname.setForeground(new Color(95, 0, 160));
        add(tfname);


        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(95, 0, 160));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);


        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(95, 0, 160));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(180, 180);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        }else if (ae.getSource() == back ){
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Login();
    }

}
