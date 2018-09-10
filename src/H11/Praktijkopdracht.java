package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField text1;
    Button but1;
    Label label;
    int Num1, Num2, num1;
    public void init() {
        text1 = new TextField();
        but1 = new Button("Ok");
        label = new Label("tavel van ->");
        but1.addActionListener( new But1Listener() );
        add(label);
        add(text1);
        add(but1);
    }

    public void paint(Graphics g) {
        int count;
        for(count = 0; count < 10; count++) {
            num1 = Num1 * (1 + count);
            g.drawString("" + num1,20,20+count*20);
        }
        repaint();
    }

    class But1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Num1 = Integer.parseInt( text1.getText() );
            for (int i = 0; i < 10; i++) {
                Num2 = Num1 * i;
            }
        }
    }
}
