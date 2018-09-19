package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField Num1, Num2;
    Button M, D, A, S;
    double num1, num2, num3;

    public void init() {
        Num1 = new TextField("",15);
        add(Num1);
        Num2 = new TextField("",15);
        add(Num2);

        // Buttons
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
        Num1.setText("" + num3);
    }

    class MListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num1 = Double.parseDouble( Num1.getText() );
            num2 = Double.parseDouble( Num2.getText() );
            Num2.setText("");
            num3 = num1 * num2;
            repaint();
        }
    }

    class DListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num1 = Double.parseDouble( Num1.getText() );
            num2 = Double.parseDouble( Num2.getText() );
            Num2.setText("");
            num3 = num1 / num2;
            repaint();
        }
    }

    class AListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num1 = Double.parseDouble( Num1.getText() );
            num2 = Double.parseDouble( Num2.getText() );
            Num2.setText("");
            num3 = num1 + num2;
            repaint();
        }
    }

    class SListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num1 = Double.parseDouble( Num1.getText() );
            num2 = Double.parseDouble( Num2.getText() );
            Num2.setText("");
            num3 = num1 - num2;
            repaint();
        }
    }
}
