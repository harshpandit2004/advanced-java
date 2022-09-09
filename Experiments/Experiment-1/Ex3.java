import java.awt.*;
class Ex3 extends Frame {
    Ex3(String s){
        super(s);
        setVisible(true);
        setLayout(null);
        setSize(475, 400);
        setLocation(700, 300);

        Button ok = new Button("Ok");
        Button reset = new Button("Reset");
        Button incel = new Button("Cancel");

        ok.setBounds(100,200,75,25);
        reset.setBounds(200,200,75,25);
        incel.setBounds(300,200,75,25);

        add(ok);
        add(reset);
        add(incel);

    }
    public static void main(String [] args){
        new Ex3("Exercise, Question 3");
    }
}