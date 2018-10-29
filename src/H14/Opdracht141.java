package H14;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht141 extends Applet {
    Button but1;
    String kind[] = {"Schoppen","Harten","klaver","Ruiten"},
            number[] = {"Aas", "Heer", "Vrouw", "Boer", "Tien", "Negen", "Acht", "Zeven", "Zes", "Vijf", "Vier", "Drie", "Twee"};
    String kaart[] = {};
    int b, c;

    public void init() {
        but1 = new Button("Ok");
        but1.addActionListener( new But1Listener() );
        add(but1);
    }

    public void paint(Graphics g) {
        g.drawString(kind[b] + " " + number[c],20,20);
    }

    class But1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double r = Math.random();
            b = (int)(r*4);
            c = (int)(r*12);
            repaint();
        }
    }
}
