package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht103_4 extends Applet {
    TextField text1, text2;
    Label label1, label2;
    String s, j, text, dag;
    int maand, jaar;

    public void init() {
        text1 = new TextField("", 20);
        text2 = new TextField("", 20);
        label1 = new Label("Type het Maand Nummer en druk op enter");
        label2 = new Label("Type het Jaar en druk op enter");
        text1.addActionListener( new TextvakListener() );
        text2.addActionListener( new Text2vakListener() );
        text = "";
        add(label2);
        add(text2);
        add(label1);
        add(text1);
    }
    public void paint(Graphics g) {
        g.drawString(text, 50, 120 );
    }

    class TextvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = text1.getText();
            maand = Integer.parseInt( s );
            switch(maand) {
                case 1:
                    text = "Januari, 31 Dagen";
                    break;
                case 2:
                    text = "Februari, " + dag + " Dagen";
                    break;
                case 3:
                    text = "Maart, 31 Dagen";
                    break;
                case 4:
                    text = "April, 30 Dagen";
                    break;
                case 5:
                    text = "Mei, 31 Dagen";
                    break;
                case 6:
                    text = "Juni, 30 Dagen";
                    break;
                case 7:
                    text = "Juli, 31 Dagen";
                    break;
                case 8:
                    text = "Augustus, 31 Dagen";
                    break;
                case 9:
                    text = "September, 30 Dagen";
                    break;
                case 10:
                    text = "Oktober, 31 Dagen";
                    break;
                case 11:
                    text = "November, 30 Dagen";
                    break;
                case 12:
                    text = "December, 31 Dagen";
                    break;
                default:
                    text = "Dat is geen Maand nummer";
                    break;
            }
            repaint();
        }
    }

    class Text2vakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            j = text2.getText();
            jaar = Integer.parseInt( j );
            if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ) {
                dag = "29";
            }
            else {
                dag = "28";
            }
        }
    }
}
