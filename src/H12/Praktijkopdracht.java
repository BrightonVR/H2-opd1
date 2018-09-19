package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField text1, text2;
    Button but1;
    String name[], numb[];
    int i,a;
    //ArrayList<String> NameList = new ArrayList<>();
    //ArrayList<String> NumbList = new ArrayList<>();

    public void init() {
        i = 0;
        text1 = new TextField("", 10);
        text2 = new TextField("", 10);
        but1 = new Button("Ok");
        but1.addActionListener( new ButListener() );
        name = new String[10];
        numb = new String[10];
        add(text1);
        add(text2);
        add(but1);
    }
    public void paint(Graphics g) {
        // prints alle naammen en nummers wanneer er 10x op Ok(knop)
        // is gedrukt
        g.drawString(""+i,200,40);
        if (a == 10) {
            for (int count = 0; count < 10; count++) {
                int x = 20;
                g.drawString("" + name[count] + ", ", x, 40 + (count * 20));
                x = x + 100;
                g.drawString("" + numb[count] , x, 40 + (count * 20));
                if (count == 10) {count = 0;}
            }
            a = 0;
        }
    }

    class ButListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (i == 10) {
                i = 0;
                repaint();
            }
            a++;
            String s1 = text1.getText();
            String s2 = text2.getText();
            // zet de text dat in de text vakken staat in een tabel
            name[i] = s1;
            numb[i] = s2;
            //NameList.add(Name[i]);
            //NumbList.add(Numb[i]);
            //Collections.sort(NameList);
            //Collections.sort(NumbList);
            i += 1;
            repaint();
        }
    }
}
