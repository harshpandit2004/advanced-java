import java.awt.*;
class Ex1 extends Frame{
    Ex1(String s){
        super(s);
        setVisible(true);
        setLayout(null);
        setSize(500, 400);
        setLocation(700, 300);

        Label l = new Label("Welcome to Java");
        l.setBounds(200,175,300,25);
        add(l);

    }
    public static void main(String[] args){
        new Ex1("Exercise, Question 1");
    }
}