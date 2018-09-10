package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht102 extends Applet {
    int Num1;
    int Num2;
    int Num3;
    TextField text1;
    Label label;
    String s, text;

    public void init() {
        Num2 = 0;
        Num3 = 100;
        text1 = new TextField("",20);
        label = new Label("Type het dag nummer");
        text1.addActionListener( new Text1vakListener() );
        text = "";
        add(label);
        add(text1);
    }
    public void paint(Graphics g) {
        g.drawString("Grootste getal: " + Num2,50,60 );
        g.drawString("Kleinste getal: " + Num3,50,75 );
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
