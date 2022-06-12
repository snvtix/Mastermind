package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;

public class Board extends Variables {

    public class PaintBoard extends JPanel{

        public void paintComponent(Graphics g) {

            int dlugoscH = dlugoscHasla;
            int iloscR = iloscRund;
            System.out.println(dlugoscH);

            super.paintComponent(g);
            setBackground(Color.magenta);

            for (int i = 0; i < dlugoscH + 4; i++) {
                for (int j = 0; j <= iloscR; j++) {
                    if (i < dlugoscH) {
                        g.fillOval((i * 50), (j * 50), 50, 50);
                        g.setColor(Color.white);
                    } else {
                        g.fillOval(22 * (dlugoscH + 1) + (i * 25), 12 + (j * 50), 25, 25);
                        g.setColor(Color.black);
                    }
                }
            }
        }
    }
}

