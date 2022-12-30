package QuizApplication;
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
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];

    Quiz(String s) {
        super(s);
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
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnNext);
        add(btnNext);
        setData();
        label.setBounds(10, 40, 450, 20);
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
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 1) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 2) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 3) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 4) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 5) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 6) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 7) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 8) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
        }
        if (current == 9) {
            label.setText("Question 1 : Choose one of the 4 options");
            radioButtons[0].setText("option 1");
            radioButtons[1].setText("option 2");
            radioButtons[2].setText("option 3");
            radioButtons[3].setText("option 4");
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
            return (radioButtons[1].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[1].isSelected());
        }
        if (current == 8) {
            return (radioButtons[1].isSelected());
        }
        if (current == 9) {
            return (radioButtons[1].isSelected());
        }
        return false;
    }

    public static void main (String [] args){
        new Quiz("null");
    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
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