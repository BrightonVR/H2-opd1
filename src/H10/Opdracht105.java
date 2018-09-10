package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Opdracht105 extends Applet {
    TextField text1;
    Label label;
    String s, text, lgm;
    int Num1;
    Button but1;
    double gm;

    ArrayList<Integer> Numbers = new ArrayList<>();
    ArrayList<Integer> Number = new ArrayList<>();
    public void init() {
        but1 = new Button("Ok");
        but1.addActionListener( new But1Listener() );
        text1 = new TextField("",20);
        text1.addActionListener( new Text1Listener() );
        text = "";
        label = new Label("Nummers: ");

        add(label);
        add(text1);
        add(but1);
    }
    public void paint(Graphics g) {
        Test(g);
        g.drawString("Gemiddelde = " + lgm,100,100);
    }

    void Test(Graphics g) {
        int count = 0;
        double ncount = 0;
        for(Integer i : Number) {
            g.drawString("" +i ,50,100 + count*15);
            count++;
            ncount+=i;
        }
        gm = ncount / Number.size();
    }

    class But1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (gm < 5.5) {
                lgm = gm + " Lager dan gemiddeld";
            } else if (gm >= 5.5) {
                lgm = gm + " Hoger dan gemiddeld";
            }
            repaint();
        }
    }

    class Text1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = text1.getText();
            Num1 = Integer.parseInt( s );
            Number.add(Num1);
            repaint();
        }
    }
}
