package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht126 extends Applet {
    double Rdom[] = {1,1,1,1,2,2,3,3,3,3,4,6,6,6,6,6,6,7,7,8,10};
    int i, Num1,num;
    TextField text1;

    public void init() {
        text1 = new TextField("",20);
        text1.addActionListener( new Text1Listener() );
        add(text1);
    }

    public void paint(Graphics g) {
        g.drawString("Searching Number: "+Num1+"   Found Number: "+num,20,40);
    }

    class Text1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num = 0;
            Num1 = Integer.parseInt( text1.getText() );
            for (int teller = 0; teller < Rdom.length; teller++) {
                if (Rdom[teller] == Num1) {
                    num++;
                }
            }
            repaint();
        }
    }
}