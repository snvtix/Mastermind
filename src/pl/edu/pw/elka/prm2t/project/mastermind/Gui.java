package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends Board implements ActionListener {

    // MUSZA BYC 2 GUI, JEDEN Z WYBOREM TRUDNOSCI A POTEM GRA
    // aletopozniej

    // ogolem to skoro jest jakas tam plansza, to tutaj dodamy jakies wyswietlacze
    // a na bialym polu mozemy dac liste z opcjami kolorow
    // te kolory beda przypisane do cyfr (bo generator generuje cyfry)
    // chyba ze jakos chcemy przeciagac kulki ale to troche  przekracza moje mozliwosci teraz

    JFrame f;
    String[] optionsAvaible = {"czerwony","fioletowy","niebieski","zielony","żółty"};
    JComboBox colors = new JComboBox<>(optionsAvaible);
    int dlugoscHasla = 4;
    int iloscRund = 10;
    int tryb = 1; // sa 2 tryby, przypiszmy je do liczby,i w zaleznosci jaki to bedzie numer
    // bedziemy podejmowac inna akcje w actionPerformed

    Gui() {
        Board board = new Board();
        f = new JFrame("Mastermind");
        f.setSize(600, 600);
        f.setLayout(new GridLayout());
        f.add(board);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        // ogolem przyciski bedzie trzeba dodawac recznie bez layoutow + parametryzacja
        // czarne kulki to beda podpowiedzi i tam beda wyswietlacze
        // tzn ze nwm jakies male kwadraciki i jak dobrze, to sie zaswieci na czerwono czy cos
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //tutaj gdzies tez wrzucimy SolutionGenerator zeby ify sie zgadzaly
        //tutaj chyba caly mastermind zostanie napisany xd
    }

    // + musimy ogarnac jak blokowac listy z wyborami do nastepnych kulek, bo musimy isc turowo

    public static void main(String[] args) {
        Gui gui = new Gui();
    }
}







