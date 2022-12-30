import java.awt.*;
class Ex2 extends Frame {
    Ex2(String s){
        super(s);
        setVisible(true);
        setLayout(null);
        setSize(500, 400);
        setLocation(700, 300);

        Label l = new Label("Choose the languages you know: ");
        l.setBounds(100,50,300,50);
        add(l);

        Checkbox lang1 = new Checkbox("English");
        Checkbox lang2 = new Checkbox("Hindi");
        Checkbox lang3 = new Checkbox("Sanskrit");
        Checkbox lang4 = new Checkbox("Marathi");

        lang1.setBounds(100,100,300,50);
        lang2.setBounds(100,150,300,50);
        lang3.setBounds(100,200,300,50);
        lang4.setBounds(100,250,300,50);

        add(lang1);
        add(lang2);
        add(lang3);
        add(lang4);
    }
    public static void main(String [] args){
        new Ex2("Exercise, Question 2");
    }
}