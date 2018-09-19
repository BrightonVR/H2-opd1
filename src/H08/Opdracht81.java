package H08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht81 extends Applet {
    TextField text1;
    Button but1;
    Button but2;
    Label label;
    String text;

    public void init() {
        label = new Label("Text vak");
        text1 = new TextField("",25);
        but1 = new Button( "Ok" );
        but1.addActionListener( new But1Listner() );
        but2 = new Button( "Reset" );
        but2.addActionListener( new But2Listner() );
        add(label);
        add(text1);
        add(but1);
        add(but2);
    }

    public void paint(Graphics g){
        g.drawString(text,50,60);
    }

    class But1Listner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = text1.getText();
            text = s;
            repaint();
        }
    }

    class But2Listner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String b = "";
            text = b;
            text1.setText("");
            repaint();
        }
    }
}
