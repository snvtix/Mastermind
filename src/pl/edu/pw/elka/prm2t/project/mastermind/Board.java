package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;

public class Board extends Variables {

    public class PaintBoard extends JPanel{

        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            setBackground(Color.magenta);

            for (int i = 0; i < dlugoscHasla + 4; i++) {
                for (int j = 0; j <= iloscRund; j++) {
                    if (i < dlugoscHasla) {
                        g.fillOval((i * 50), (j * 50), 50, 50);
                        g.setColor(Color.white);
                    } else {
                        g.fillOval(22 * (dlugoscHasla + 1) + (i * 25), 12 + (j * 50), 25, 25);
                        g.setColor(Color.black);
                    }
                }
            }
        }
    }
}

