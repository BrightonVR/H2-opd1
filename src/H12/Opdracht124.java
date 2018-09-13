package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht124 extends Applet {

    TextField text1;
    Button but1;
    double[] Rdom = {5,3,7,8,2,1,6,10,9,4};
    double search, r, Num2;
    int c, Num1, teller = 0, i,Num3;
    boolean found;

    public void init() {
        text1 = new TextField("",10);
        but1 = new Button("Ok");
        but1.addActionListener( new But1Listener() );
        found = false;
        add(text1);
        add(but1);
    }

    public void paint(Graphics g) {
        //for (i = 0; i < 10; i++) {
          //r = Math.random();
            //c = (int)(r*10+1);
            //Rdom[i] = c;
        //}

        if(found == true) {
            g.drawString("waarde gevonden "+Num2+" Index "+Num3,20,50);
        }
        else {
            g.drawString("Waarde: "+Num1+" Niet gevonden",20, 50);
        }
    }

    class But1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Num1 = Integer.parseInt( text1.getText() );
            search = Num1;
            found = false;
            for (teller = 0; teller < Rdom.length; teller++) {
                if (Rdom[teller] == search) {
                    found = true;
                    Num2 = Rdom[teller];
                    Num3 = teller;
                    // Opdracht 12.5
                    break;
                }
            }
            repaint();
        }
    }
}
