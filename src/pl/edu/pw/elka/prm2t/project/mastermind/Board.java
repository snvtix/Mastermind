package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;

public class Board extends Variables {

    public Board(int poziom, int dlugoscHasla, int iloscRund) {
        super(poziom, dlugoscHasla, iloscRund);
    }

    public class PaintBoard extends JPanel{

        public void paintComponent(Graphics g) {

            System.out.println(dlugoscHasla);
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            setBackground(Color.magenta);
            for (int i = 0; i < dlugoscHasla + 4; i++) {
                for (int j = 0; j <= iloscRund; j++) {
                    if (i < dlugoscHasla) {
                        g2d.fillOval((i * 50), (j * 50), 50, 50);
                        g2d.setColor(Color.white);
                    } else {
                        g2d.fillOval(22 * (dlugoscHasla + 1) + (i * 25), 12 + (j * 50), 25, 25);
                        g2d.setColor(Color.black);
                    }
                }
            }
        }
    }
}

