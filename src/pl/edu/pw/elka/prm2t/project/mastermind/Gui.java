package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends Board implements ActionListener {

    // MUSZA BYC 2 GUI, JEDEN Z WYBOREM TRUDNOSCI A POTEM GRA
    // aletopozniej

    // ogolem to skoro jest jakas tam plansza, to tutaj dodamy jakies wyswietlacze
    // a na kazdym rozowym polu mozemy dac liste z opcjami kolorow
    // te kolory beda przypisane do cyfr (bo generator generuje cyfry)
    // chyba ze jakos chcemy przeciagac kulki ale to trocheprzekracza moje mozliwosci teraz

    JFrame f;
    String[] optionsAvaible = {"1","2","3","4","5"};  // kolory
    JComboBox colors = new JComboBox<>(optionsAvaible);

    Gui() {
        Board board = new Board();
        f = new JFrame("Mastermind");
        f.setSize(600, 600);
        f.setLayout(new GridLayout());
        f.add(board);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        //ogolem przyciski bedzie trzeba dodawac recznie bez layoutow
        // czarne kulki to beda podpowiedzi i tam beda wyswietlacze
        // tzn ze nwm jakiesmale kwadraciki i jak dobrze to sie zaswieci na czerwono czy cos
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Object source = e.getSource();
        //tutajgdzies tez wrzucimy SolutionGenerator zeby ify sie zgadzaly
        //tutaj chyba caly mastermind zostanie napisany xd
    }

    // nie wiem czypowinnismy dac actionPerformeddo nowej klasy, albo potem zrobic dwie i w zaleznosci
    // od ustawien na generatorze wybrac ktorej uzywamy
    // czy jeszcze  jakos inaczej, bo musi to byc zalezne od poziomu trudnosci jak sie wyswietlaja odpowiedzi
    // + musimy ogarnac jak blokowac listy z wyborami do nastepnych kulek, bo musimy isc turowo
    //

    public static void main(String[] args) {
        Gui gui = new Gui();
    }
}







