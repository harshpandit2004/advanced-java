import java.awt.*;
public class Buttondemoo extends Frame {
    Buttondemoo(String s){
        super(s);
        setVisible(true);
        setLayout(null);
        setSize(500,400);
        Button ok = new Button("Ok");
        Button cancel = new Button("incel");
        ok.setBounds(70,200,50,50);
        cancel.setBounds(145,200,50,50);
        Label l1 = new Label("Press any button, it does not matter.");
        Label l2 = new Label("Just like your life");
        l1.setBounds(100,100,1000,50);
        l2.setBounds(160,150,1200,50);
        add(l1);
        add(l2);
        add(ok);
        add(cancel);
    }
    public static void main(String args[]){
        new Buttondemoo("Buttondemoo");
    }
}