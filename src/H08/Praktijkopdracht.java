package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField Num1;
    TextField Num2;
    Button M;
    Button D;
    Button A;
    Button S;
    double num1;
    double num2;
    double num3;

    public void init() {
        Num1 = new TextField("",15);
        Num1.addActionListener( new Num1Listener() );
        add(Num1);
        Num2 = new TextField("",15);
        Num2.addActionListener( new Num2Listener() );
        add(Num2);

        M = new Button("*");
        M.addActionListener( new MListener() );
        add(M);
        D = new Button("/");
        D.addActionListener( new DListener() );
        add(D);
        A = new Button("+");
        A.addActionListener( new AListener() );
        add(A);
        S = new Button("-");
        S.addActionListener( new SListener() );
        add(S);
    }

    public void paint(Graphics g) {
        g.drawString("Number = " + num3,50,60);
    }

    class Num1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Num1.getText();
            num1 = Double.parseDouble( s );
        }
    }

    class Num2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Num2.getText();
            num2 = Double.parseDouble( s );
        }
    }

    class MListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num3 = num1 * num2;
            repaint();
        }
    }

    class DListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num3 = num1 / num2;
            repaint();
        }
    }

    class AListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num3 = num1 + num2;
            repaint();
        }
    }

    class SListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num3 = num1 - num2;
            repaint();
        }
    }
}
