import java.awt.*;
class Buttonexe {
    Buttonexe(){
        Frame f = new Frame("Something will happen");
        Button b = new Button("Click for nothing to happen");
        b.setBounds(30,100,300,100);
        //sets the size and layout for the said component
        f.add(b);
        //adding the said component
        f.setSize(360,300);
        //setting the default frame size (it can be resized)
        f.setLayout(null);
        //overriding the already-existing-default layout
        f.setVisible(true);
        //it is hidden by default
        f.setLocation(500,300);
        //sets the default location on user's - screen
    }
    public static void main(String args []){
        new Buttonexe();
    }
}