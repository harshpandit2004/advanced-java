import java.awt.*;
class Q1 extends Frame{
    Q1(String s){
        super(s);
        setVisible(true);
        setLayout(null);
        setSize(500,400);
        setLocation(700,300);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Radio Value 1", cbg, true);
        Checkbox c2 = new Checkbox("Radio Value 2", cbg, false);
        Checkbox c3 = new Checkbox("Radio Value 3", cbg, false);

        c1.setBounds(100,50,500,50);
        c2.setBounds(100,100,500,50);
        c3.setBounds(100,150,500,50);

        add(c1);
        add(c2);
        add(c3);


        Checkbox cb1 = new Checkbox("Checkbox value 1", true);
        Checkbox cb2 = new Checkbox("Checkbox value 2", false);
        Checkbox cb3 = new Checkbox("Checkbox value 3", true);

        cb1.setBounds(100,200,500,50);
        cb2.setBounds(100,250,500,50);
        cb3.setBounds(100,300,500,50);

        add(cb1);
        add(cb2);
        add(cb3);
    }
    public static void main(String [] args){
        new Q1("Experiment-1");
    }
}