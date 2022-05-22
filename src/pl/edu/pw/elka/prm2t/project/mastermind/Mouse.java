package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse extends JPanel implements MouseListener {

    private int x, y;

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        System.out.println(x + ", " + y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        System.out.println(x + ", " + y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    // to trzeba jeszcze rozkminić ale myślę że przydatne
}

