package H08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08Test extends Applet {
    int W, H;

    TextField tekstvak;
    Label label;
    double getal;

    public void init(){
        W = 600;
        H = 400;
        setSize(W,H);


        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g){
        g.drawString("Het getal is " + getal,50,60);
    }

    private class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            // andere mogelijk hijd ^
            // getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}
