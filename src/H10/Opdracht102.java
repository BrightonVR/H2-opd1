package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht102 extends Applet {
    int Num1, Num2, Num3;
    TextField text1;
    Label label;
    String s;

    public void init() {
        Num3 = 100000000;
        text1 = new TextField("",20);
        label = new Label("Groter of kleiner: ");
        text1.addActionListener( new Text1vakListener() );
        add(label);
        add(text1);
    }

    public void paint(Graphics g) {
        g.drawString("Grootste getal: " + Num2,50,60 );
        g.drawString("Kleinste getal: " + Num3,50,75 );
        g.drawString("Current  getal: " + Num1,50,90 );
    }

    class Text1vakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = text1.getText();
            Num1 = Integer.parseInt( s );
            if (Num1 > Num2) {
                Num2 = Num1;
            }
            if (Num3 > Num1) {
                Num3 = Num1;
            }

            repaint();
        }
    }
}
