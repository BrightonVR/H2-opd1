package H08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht83 extends Applet {
    Button but1;
    Label label;
    TextField text1;
    double num1;
    double num2;

    public void init() {
        label = new Label("Euro: ");
        text1 = new TextField("",25);
        but1 = new Button();
        but1.setLabel("Ok");
        but1.addActionListener( new But1Listner() );

        add(label);
        add(text1);
        add(but1);
    }

    public void paint(Graphics g) {
        g.drawString("Bedrag inc. BTW(21%): " + num2,40,60);
    }

    class But1Listner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = text1.getText();
            num1 = Double.parseDouble( s );
            num2 = num1 / 100 * 121;
            repaint();
        }
    }
}
