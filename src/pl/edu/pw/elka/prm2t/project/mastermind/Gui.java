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

    JFrame f1;
    JFrame f2;
    JTextField text;
    JButton start;
    String[] koloryOpcje = {"czerwony", "biały", "niebieski", "czarny",
            "żółty", "pomarańczowy", "fioletowy", "zielony"};
    String[] trybyOpcje = {"początkujący","klasyczny"};
    String[] poziomyOpcje = {"łatwy","średni","trudny"};
    JComboBox kolory = new JComboBox<>(koloryOpcje); // to juz do samej gry
    JComboBox tryby = new JComboBox<>(trybyOpcje);
    JComboBox poziomy = new JComboBox<>(poziomyOpcje);
    int tryb = 0; // zalezne od trybu i poziomu
    int dlugoscHasla = 4; // zalezne od trybu i poziomu
    int iloscRund = 10; // zalezne od trybu i poziomu
    int iloscKolorow = 5;

    Gui() {
        Board board = new Board();
        f1 = new JFrame("Mastermind");
        f1.setSize(300, 300);
        f1.setLayout(new GridLayout(4,1));
        text = new JTextField("Wybierz poziom trudności");
        text.setEnabled(false);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setDisabledTextColor(Color.BLACK);
        f1.add(text);
        f1.add(tryby);
        f1.add(poziomy);
        f1.add(start);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        //f2 = new JFrame("Mastermind");
        //f2.setSize(600, 600);
        //f2.setLayout(new GridLayout());
        //f2.add(board.paintComponent()); //jak tu dodac zmienne aaaa, chyba ze to napisac w action performed??
        //f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f2.setVisible(true);
        // ogolem przyciski bedzie trzeba dodawac recznie bez layoutow + parametryzacja
        // czarne kulki to beda podpowiedzi i tam beda wyswietlacze
        // tzn ze nwm jakies male kwadraciki i jak dobrze, to sie zaswieci na czerwono czy cos
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(tryby.getSelectedIndex() == 0){ //tryb poczatkujacy
            if(poziomy.getSelectedIndex() == 0){
                tryb = 0;
                dlugoscHasla = 4;
                iloscRund = 10;
                iloscKolorow = 5;
            }
            else if(poziomy.getSelectedIndex() == 1){
                tryb = 0;
                dlugoscHasla = 5;
                iloscRund = 10;
                iloscKolorow = 6;
            }
            else if(poziomy.getSelectedIndex() == 2){
                tryb = 0;
                dlugoscHasla = 5;
                iloscRund = 10;
                iloscKolorow = 6;
            }
        }
        else if(tryby.getSelectedIndex() == 1){ //klasyczmy
            if(poziomy.getSelectedIndex() == 0){
                tryb = 1;
                dlugoscHasla = 4;
                iloscRund = 10;
                iloscKolorow = 5;
            }
            else if(poziomy.getSelectedIndex() == 1){
                tryb = 1;
                dlugoscHasla = 4;
                iloscRund = 10;
                iloscKolorow = 6;
            }
            else if(poziomy.getSelectedIndex() == 2){
                tryb = 1;
                dlugoscHasla = 5;
                iloscRund = 12;
                iloscKolorow = 8;
            }
        }

        if(source == start) {
            //zaczynamy gre
        }

        //tutaj gdzies tez wrzucimy SolutionGenerator zeby ify sie zgadzaly
        //tutaj chyba caly mastermind zostanie napisany xd
    }

    // + musimy ogarnac jak blokowac listy z wyborami do nastepnych kulek, bo musimy isc turowo

    public static void main(String[] args) {
        Gui gui = new Gui();
    }
}







