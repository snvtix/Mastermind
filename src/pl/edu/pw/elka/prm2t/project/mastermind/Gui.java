package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends Board implements ActionListener {

    // ogolem to skoro jest jakas tam plansza, to tutaj dodamy jakies wyswietlacze
    // a na kazdym rozowym polu mozemy dac liste z opcjami kolorow
    // te kolory beda przypisane do cyfr (bo generator generuje cyfry)

    JFrame f;
    String[] optionsAvaible = {"1","2","3","4","5"};  // kolory
    JComboBox options = new JComboBox<>(optionsAvaible);


    Gui() {
        Board board = new Board();
        f = new JFrame("Mastermind");
        f.setSize(600, 600);
        f.setLayout(new GridLayout());
        f.add(board);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Object source = e.getSource();
    }

    public static void main(String[] args) {
        Gui gui = new Gui();

    }


}







