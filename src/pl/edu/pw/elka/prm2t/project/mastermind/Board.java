package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;

public class Board extends Variables {

    public Board(int poziom, int dlugoscHasla, int iloscRund, int iloscKolorow) {
        super(poziom, dlugoscHasla, iloscRund,  iloscKolorow);
    }

    public class PaintBoard extends JPanel{

        public void paintComponent(Graphics g) {

            System.out.println(dlugoscHasla);
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            setBackground(Color.pink);
            for (int i = 0; i < dlugoscHasla + 4; i++) {
                for (int j = 0; j < iloscRund; j++) {
                    if (i < dlugoscHasla) {
                        g2d.setColor(Color.darkGray);
                        g2d.fillOval((i * 55), (j * 55), 55, 55);
                    }
                }
            }
            //g2d.drawString();
        }
    }
}

