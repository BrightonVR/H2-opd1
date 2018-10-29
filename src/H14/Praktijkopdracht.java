package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdracht extends Applet {
    private TextField input;
    private Button play;
    private String game;

    private int resterend, comp, random, i, playing;
    private int next[] = {21,17,13,9,5,1};
    private int xPos, yPos;

    private Image image;
    private URL pad;

    public void init() {
        Label label = new Label("Hoeveel smileys neem je(één, twee of drie)?");
        input = new TextField("", 13);
        play = new Button("Speel");
        play.addActionListener( new PlayListener() );

        add(label);
        add(input);
        add(play);

        pad = Praktijkopdracht.class.getResource("../resources/");
        image = getImage(pad, "smily.png");

        setSize(600,900);
        resterend = 23;
        comp = 0;
        playing = 1;

        xPos = 20;
        yPos = 30;
    }

    public void paint(Graphics g) {

        if (playing == 1) {
            g.drawString("De computer heeft " + comp + " smileys weggehaald.", 10, 70);
            g.drawString("Aantal resterende smileys: " + resterend + ". Jouw beurt.", 10, 90);

            for (int p = 0; p < resterend; p++) {
                if (p == 0 || p == 5 || p == 10 || p == 15 || p == 20) {
                    yPos += 30;
                    xPos = 20;
                }
                g.drawImage(image, xPos, yPos,20,20,this);
                xPos += 30;
            }

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
            xPos = 20;
            yPos = 100;

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
