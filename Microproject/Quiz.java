import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Quiz extends JFrame implements ActionListener {

    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext;
    JButton btnResult;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];

    Quiz(String s) {
        
        super(s);

        setVisible(true);
        setLayout(null);
        setSize(750,400);
        setLocation(700,300);

        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButtons[i] = new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
        }
        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnResult.setVisible(false);
        btnNext.addActionListener(this);
        btnResult.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(10, 40, 500, 40);
        radioButtons[0].setBounds(50, 80, 450, 20);
        radioButtons[1].setBounds(50, 110, 200, 20);
        radioButtons[2].setBounds(50, 140, 200, 20);
        radioButtons[3].setBounds(50, 170, 200, 20);
        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);

    }

    void setData() {
        radioButtons[4].setSelected(true);
        if (current == 0) {
            label.setText("Question 1 : Which among the following is the National Sports of USA?");
            radioButtons[0].setText("Bowling");
            radioButtons[1].setText("Baseball");
            radioButtons[2].setText("Table tennis");
            radioButtons[3].setText("Rugby");
        }
        if (current == 1) {
            label.setText("Question 2 : What game is known as the morden 'Mokshapat'?");
            radioButtons[0].setText("Ludo");
            radioButtons[1].setText("Snakes and Ladders");
            radioButtons[2].setText("Carrom");
            radioButtons[3].setText("Chess");
        }
        if (current == 2) {
            label.setText("Question 3 : Who is the captain of Indian National Football team?");
            radioButtons[0].setText("Sunil Chhetri");
            radioButtons[1].setText("Gurpreet Singh Sandhu");
            radioButtons[2].setText("Sandesh Jhingan");
            radioButtons[3].setText("Jeje Lalpekhula");
        }
        if (current == 3) {
            label.setText("Question 4 : What game is known as the morden Mintonette?");
            radioButtons[0].setText("Football");
            radioButtons[1].setText("Baseball");
            radioButtons[2].setText("Volleyball");
            radioButtons[3].setText("Handball");
        }
        if (current == 4) {
            label.setText("Question 5 : The Modern Olympic games were held for the first time in?");
            radioButtons[0].setText("1889");
            radioButtons[1].setText("1896");
            radioButtons[2].setText("1876");
            radioButtons[3].setText("1898");
        }
        if (current == 5) {
            label.setText("Question 6 : Which Indian Sports Team is known as 'The Bhangra Boys'?");
            radioButtons[0].setText("Cricket team");
            radioButtons[1].setText("Hockey Team");
            radioButtons[2].setText("Kabbadi Team");
            radioButtons[3].setText("Football Team");
        }
        if (current == 6) {
            label.setText("Question 7 : Who was the first Indian ICC President?");
            radioButtons[0].setText("Sharad Pawar");
            radioButtons[1].setText("Jag Mohan Dalmia");
            radioButtons[2].setText("Ray Mali");
            radioButtons[3].setText("Gavaskar");
        }
        if (current == 7) {
            label.setText("Question 8 : “National Football Museum” is located in which country?");
            radioButtons[0].setText("Switzerland");
            radioButtons[1].setText("Canada");
            radioButtons[2].setText("England");
            radioButtons[3].setText("France");
        }
        if (current == 8) {
            label.setText("Question 9 : Who has designed the trophy of FIFA Women's World Cup?");
            radioButtons[0].setText("William Sawaya");
            radioButtons[1].setText("Formiga");
            radioButtons[2].setText("Marta");
            radioButtons[3].setText("Sun Tzu");
        }
        if (current == 9) {
            label.setText("Question 10 : Where are the HQ of swimming federation of india");
            radioButtons[0].setText("Kolkata");
            radioButtons[1].setText("Ahmedabad");
            radioButtons[2].setText("Chandigarh");
            radioButtons[3].setText("New Delhi");
        }
        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i < 10; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 200, 20);
        }
    }

    boolean checkAnswer() {
        if (current == 0) {
            return (radioButtons[1].isSelected());
        }
        if (current == 1) {
            return (radioButtons[1].isSelected());
        }
        if (current == 2) {
            return (radioButtons[2].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[3].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[2].isSelected());
        }
        if (current == 8) {
            return (radioButtons[0].isSelected());
        }
        if (current == 9) {
            return (radioButtons[1].isSelected());
        }
        return false;
    }

    public static void main (String [] args){
        new Quiz("G21 - Quiz Application");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            if (checkAnswer()) {
                count++;
            }
            current++;
            setData();
            if (current == 9) {
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
            }
        }
        if (e.getActionCommand().equals("Result")) {
            if (checkAnswer()) {
                count++;
            }
            current++;
            JOptionPane.showMessageDialog(this, "You answered " + count + " answers correctly");
            System.exit(0);
        }
    }
}