import java.awt.*;
class Buttondemo {
    Buttondemo(){
        Frame f = new Frame("Sample form");
        Button b = new Button("Harambe did nothing wrong");
        b.setBounds(30,100,500,25);
        f.add(b);
        f.setSize(560,300);
        f.setLayout(null);
        f.setLocation(500,300);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new Buttondemo();
    }
}