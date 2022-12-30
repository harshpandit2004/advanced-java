import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Addition extends JFrame{
    Addition(){
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,400);
        setLocation(700,300);
        
        JLabel l1 = new JLabel("Number 1: ");
        JLabel l2 = new JLabel("Number 2: ");
        JTextField tf = new JTextField(5);
        JTextField tf2 = new JTextField(5);
        JLabel res = new JLabel("Addition: ");
        JButton b = new JButton("ADD");
        add(l1);
        add(tf);
        add(l2);
        add(tf2);
        add(b);
        add(res);
        b.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                Double a = Double.parseDouble(tf.getText());
                Double b = Double.parseDouble(tf2.getText());
                res.setText("Sum is " + (a+b));
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args []){
        new Addition();
    }
}
