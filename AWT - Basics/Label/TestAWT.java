import java.awt.*;
public class TestAWT {
    TestAWT(){
        Frame f = new Frame("Lavel Example");
        Label lb = new Label("Hello world");
        lb.setBounds(0,0,50,50);
        f.add(lb);
        f.setSize(300,300);
        f.setVisible(true);
        f.setLocation(500,300);
    }
    public static void main(String[] args){
        new TestAWT();
    }
}
//idk how to format the position of label in the window. information required.