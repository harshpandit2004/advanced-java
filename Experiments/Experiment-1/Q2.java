import java.awt.*;
class Q2 extends Frame{
    Q2(String s){
        super(s);
        setVisible(true);
        setLayout(null);
        setSize(500, 400);
        setLocation(700, 300);

        Label name = new Label("name: ");
        name.setBounds(100,50,75,30);
        add(name);

        Label address = new Label("address: ");
        address.setBounds(100,100,75,30);
        add(address);

        TextField tf = new TextField("name");
        tf.setBounds(175,50,200,30);
        add(tf);

        TextArea ta = new TextArea("address");
        ta.setBounds(175,100,200,50);
        add(ta);

        Button b = new Button("Submit");
        b.setBounds(150,200,100,30);
        add(b);

    }
    public static void main(String [] args){
        new Q2("Experiment-1");
    }
}