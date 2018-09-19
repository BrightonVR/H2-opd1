package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet {
    Button butm, butv, butpm, butpv;
    int m1, v1, pm1, pv1, total;


    public void init() {
        total = 0 + total;
        butm = new Button("Man");
        butm.addActionListener( new ButmListner() );
        butv = new Button("Vrouw");
        butv.addActionListener( new ButvListner() );
        butpm = new Button("Man(Leerling?)");
        butpm.addActionListener( new ButpmListner() );
        butpv = new Button("vrouw(Leerling?)");
        butpv.addActionListener( new ButpvListner() );
        add(butm);
        add(butv);
        add(butpm);
        add(butpv);
    }

    public void paint(Graphics g) {
        g.drawString("Mannenlijke bezoekers: " + m1,50,75);
        g.drawString("Vrouwlijke bezoekers: " + v1,50,90);
        g.drawString("Mannenlijke(Leerling?) bezoekers: " + pm1,50,105);
        g.drawString("vrouwlijke(Leerling?) bezoekers: " + pv1,50,120);
        g.drawString("Totaal: " + total, 50,135);
    }

    class ButmListner implements ActionListener {
        public void actionPerformed(ActionEvent e){
            m1 = 0 + m1;
            m1++;
            total++;
            repaint();
        }
    }

    class ButvListner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            v1 = 0 + v1;
            v1++;
            total++;
            repaint();
        }
    }

    class ButpmListner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pm1 = 0 + pm1;
            pm1++;
            total++;
            repaint();
        }
    }

    class ButpvListner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pv1 = 0 + pv1;
            pv1++;
            total++;
            repaint();
        }
    }
}
