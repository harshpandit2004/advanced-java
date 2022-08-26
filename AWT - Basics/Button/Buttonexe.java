import java.awt.*;
class Buttonexe {
    Buttonexe(){
        Frame f = new Frame("Something will happen");
        Button b = new Button("Click for nothing to happen");
        b.setBounds(30,100,300,100);
        f.add(b);
        f.setSize(360,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocation(500,300);
    }
    public static void main(String args []){
        new Buttonexe();
    }
}