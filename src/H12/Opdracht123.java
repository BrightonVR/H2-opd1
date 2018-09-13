package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Opdracht123 extends Applet {
    TextField text1, text2, text3, text4, text5;
    Button but1;
    int Num2[];
    private boolean laidOut = false;
    ArrayList<Integer> numlist = new ArrayList<>();

    public void init() {
        setLayout(null);
        but1 = new Button("ok");
        text1 = new TextField();
        text2 = new TextField();
        text3 = new TextField();
        text4 = new TextField();
        text5 = new TextField();
        but1.addActionListener(new But1Listener());

        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        add(but1);
    }

    public void paint(Graphics g) {
        if (!laidOut) {
            but1.setLocation(80, 130);
            but1.setSize(50, 22);
            text1.setLocation(25, 50);
            text1.setSize(50, 22);
            text2.setLocation(80, 50);
            text2.setSize(50, 22);
            text3.setLocation(25, 90);
            text3.setSize(50, 22);
            text4.setLocation(80, 90);
            text4.setSize(50, 22);
            text5.setLocation(25, 130);
            text5.setSize(50, 22);
            laidOut = true;
        }
    }

    class But1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            numlist.clear();
            int     num1 = Integer.parseInt(text1.getText()),
                    num2 = Integer.parseInt(text2.getText()),
                    num3 = Integer.parseInt(text3.getText()),
                    num4 = Integer.parseInt(text4.getText()),
                    num5 = Integer.parseInt(text5.getText());
            numlist.add(num1);
            numlist.add(num2);
            numlist.add(num3);
            numlist.add(num4);
            numlist.add(num5);
            Collections.sort(numlist);

            text1.setText(""+numlist.get(0));
            text2.setText(""+numlist.get(1));
            text3.setText(""+numlist.get(2));
            text4.setText(""+numlist.get(3));
            text5.setText(""+numlist.get(4));
        }
    }
}
