package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField input;
    Button play;
    Label label;
    String game;

    int resterend, comp, random, i, playing;
    int next[] = {21,17,13,9,5,1};

    public void init() {
        label = new Label("Hoeveel smileys neem je(één, twee of drie)?");
        input = new TextField("", 13);
        play = new Button("Speel");
        play.addActionListener( new PlayListener() );

        add(label);
        add(input);
        add(play);

        setSize(600,600);
        resterend = 23;
        comp = 0;
        playing = 1;
    }

    public void paint(Graphics g) {

        if (playing == 1) {
            g.drawString("De computer heeft " + comp + " smileys weggehaald.", 10, 70);
            g.drawString("Aantal resterende smileys: " + resterend + ". Jouw beurt.", 10, 90);
        } else if (playing == 2) {
            g.drawString(game, 10, 70);
            try {
                Thread.sleep(4000);
            } catch (Exception e) {}
            play.setEnabled(true);
            playing = 1;
            repaint();
        } else if (playing == 3) {
            g.drawString(game, 10, 70);
            try {
                Thread.sleep(4000);
            } catch (Exception e) {}
            playing = 1;
            repaint();
        }
    }

    class PlayListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getinput = Integer.parseInt(input.getText());

            if (getinput < 1 || getinput > 3) {
                game = "Invalid input!";
                playing = 3;
            } else {

                resterend -= getinput;

                if (resterend < next[i]) {
                    i++;
                }

                int temp = resterend - next[i];

                if (temp == 0) {
                    double r = Math.random();
                    random = (int) (r * 3 + 1);
                    temp = random;
                }

                if (getinput == 1) {

                    if (temp > 3) {
                        double r = Math.random();
                        random = (int) (r * 3 + 1);
                        resterend -= random;
                        comp = random;
                    } else {
                        resterend -= temp;
                        comp = temp;
                    }
                    i++;
                } else if (getinput == 2) {

                    if (temp > 3) {
                        double r = Math.random();
                        random = (int) (r * 3 + 1);
                        resterend -= random;
                        comp = random;
                    } else {
                        resterend -= temp;
                        comp = temp;
                    }
                    i++;
                } else if (getinput == 3) {

                    if (temp > 3) {
                        double r = Math.random();
                        random = (int) (r * 3 + 1);
                        resterend -= random;
                        comp = random;
                    } else {
                        resterend -= temp;
                        comp = temp;
                    }
                    i++;
                }
                playing = 1;
            }
            input.setText("");


            if (resterend == 1) {
                play.setEnabled(false);
                i = 0;
                resterend = 23;
                playing = 2;
                game = "You lost!";
            }

            if (resterend <= 0) {
                play.setEnabled(false);
                i = 0;
                resterend = 23;
                playing = 2;
                game = "You won!";
            }

            repaint();
        }
    }
}
