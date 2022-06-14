package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;

// [JW] Można to uprościć, zapisując dane w postaci pola klasy Variables - wówczas wystarczy jedna klasa Board.

public class Board extends JPanel {

    private final Variables variables;

    public Board(int poziom, int dlugoscHasla, int iloscRund, int iloscKolorow) {
        variables = new Variables(poziom, dlugoscHasla, iloscRund,  iloscKolorow);
    }

    public void paintComponent(Graphics g) {

        System.out.println(variables.dlugoscHasla);
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        setBackground(Color.pink);
        for (int i = 0; i < variables.dlugoscHasla + 4; i++) {
            for (int j = 0; j < variables.iloscRund; j++) {
                if (i < variables.dlugoscHasla) {
                    g2d.setColor(Color.darkGray);
                    g2d.fillOval((i * 55), (j * 55), 55, 55);
                }
            }
        }
        //g2d.drawString();
    }
}

