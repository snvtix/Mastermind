package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mastermind implements ActionListener {

    // ogolem to skoro jest jakas tam plansza, to tutaj dodamy jakies wyswietlacze
    // a na bialym polu mozemy dac liste z opcjami kolorow
    // te kolory beda przypisane do cyfr (bo generator generuje cyfry)

    JFrame f2;
    Board board = new Board();
    SolutionGenerator solutionGenerator = new SolutionGenerator();

    //trzeba dodac duuuuzo przyciskow

    String[] koloryOpcje = {"czerwony","biały","niebieski","czarny","żółty","pomarańczowy","fioletowy","zielony"};
    JComboBox kolory = new JComboBox<>(koloryOpcje);
    boolean winner = false;

    Mastermind(){
        f2 = new JFrame("Mastermind");
        f2.setSize(600, 600); // to mozna uzaleznicod trybu, zeby bylo schludnie
        f2.add(board);
        // na koncu mozna dac wyswietlacz ktory powie czy wygralismy czy przegralismy
        // i moga sie tam dziac rozne rzeczy
        // np pytanie czy chcemy grac od nowa czy cos
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);

        //wyświetlić będzie łatwo bo to wsm tyle, i jak już będziemy mieli napisany kod to wystarczy w niego
        //wrzucić takiego prostego booleana coś w stylu if(zgadnięcie == hasło){ winner = true; }

        if(winner == true){
            JOptionPane.showMessageDialog(f2,"wygrana");
        }
        if(winner == false){
            JOptionPane.showMessageDialog(f2,"przegrana");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //tu bedzie gra nasza
    }

}
