import java.awt.*;
class Q1 extends Frame{
    Q1(String s){
        super(s);
        setVisible(true);
        setLayout(null);
        setSize(500,400);
        setLocation(700,300);

        Label l = new Label("The Planets in our solar system: ");
        List lst = new List(4, false);

        lst.add("Mercury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("Mars");
        lst.add("Jupiter");
        lst.add("Saturn");
        lst.add("UrMom");
        lst.add("Neptune");
        lst.add("Pluto");
        
        l.setBounds(50,75,400,25);
        lst.setBounds(50,100,100,140);
        
        add(l);
        add(lst);
    }
    public static void main(String [] args){
        new Q1("Applet Viewer: Experiment-1");
    }
}