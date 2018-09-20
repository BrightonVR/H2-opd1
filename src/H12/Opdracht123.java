package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Opdracht123 extends Applet {
    TextField text[];
    Button but1;
    //private boolean laidOut = false;
    ArrayList<Integer> numlist = new ArrayList<>();

    public void init() {
        //setLayout(null);
        but1 = new Button("ok");
        but1.addActionListener(new But1Listener());
        text = new TextField[5];
        for (int i = 0; i < 5; i++) {
            text[i] = new TextField("",3);
            add(text[i]);
        }
        add(but1);
    }

    class But1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            numlist.clear();
            for (int count = 0; count < 5; count++) {
                int num1 = Integer.parseInt(text[count].getText());
                numlist.add(num1);
            }

            Collections.sort(numlist);

            for (int count = 0; count < 5; count++) {
                text[count].setText(""+numlist.get(count));
            }
        }
    }
}
