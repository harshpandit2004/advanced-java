import java.awt.*;
class FrameExample{
    FrameExample(){
        Frame f = new Frame("Frame example");
        f.setVisible(true);
        f.setSize(700,400);
        f.setLayout(null);
        
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Radio Value 1", cbg, true);
        Checkbox c2 = new Checkbox("Radio Value 2", cbg, false);
        Checkbox c3 = new Checkbox("Radio Value 3", cbg, false);

        c1.setBounds(100,50,500,50);
        c2.setBounds(100,100,500,50);
        c3.setBounds(100,150,500,50);

        f.add(c1);
        f.add(c2);
        f.add(c3);

    }
    public static void main(String[] args){
        new FrameExample();
    }
}