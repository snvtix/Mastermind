package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings implements ActionListener {

    JFrame f1;
    JTextField text;
    JButton start = new JButton("START");;
    Board board = new Board();
    SolutionGenerator solutionGenerator = new SolutionGenerator();

    String[] trybyOpcje = {"początkujący","klasyczny"};
    String[] poziomyOpcje = {"łatwy","średni","trudny"};
    JComboBox tryby = new JComboBox<>(trybyOpcje);
    JComboBox poziomy = new JComboBox<>(poziomyOpcje);

    int tryb;
    int dlugoscHasla;
    int iloscRund;
    int iloscKolorow;

    Settings() {
        f1 = new JFrame("Mastermind");
        f1.setSize(300, 300);
        f1.setLayout(new GridLayout(4,1));
        text = new JTextField("Wybierz poziom trudności");
        text.setEnabled(false);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setDisabledTextColor(Color.BLACK);
        start.addActionListener(this);
        f1.add(text);
        f1.add(tryby);
        f1.add(poziomy);
        f1.add(start);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();


        if(source == start){
            if(tryby.getSelectedIndex() == 0){ //tryb poczatkujacy
                if(poziomy.getSelectedIndex() == 0){
                    tryb = 0;
                    dlugoscHasla = 4;
                    solutionGenerator.dlugoscHasla = dlugoscHasla;
                    board.dlugoscHasla = dlugoscHasla;
                    iloscRund = 10;
                    board.iloscRund = iloscRund;
                    iloscKolorow = 5;
                    new Mastermind();
                }
                else if(poziomy.getSelectedIndex() == 1){
                    tryb = 0;
                    dlugoscHasla = 5;
                    solutionGenerator.dlugoscHasla = dlugoscHasla;
                    board.dlugoscHasla = dlugoscHasla;
                    iloscRund = 10;
                    board.iloscRund = iloscRund;
                    iloscKolorow = 6;
                    new Mastermind();
                }
                else if(poziomy.getSelectedIndex() == 2){
                    tryb = 0;
                    dlugoscHasla = 5;
                    solutionGenerator.dlugoscHasla = dlugoscHasla;
                    board.dlugoscHasla = dlugoscHasla;
                    iloscRund = 10;
                    board.iloscRund = iloscRund;
                    iloscKolorow = 6;
                    new Mastermind();
                }
            }
            else if(tryby.getSelectedIndex() == 1){ //klasyczmy
                if(poziomy.getSelectedIndex() == 0){
                    tryb = 1;
                    solutionGenerator.poziom = 0;
                    dlugoscHasla = 4;
                    solutionGenerator.dlugoscHasla = dlugoscHasla;
                    board.dlugoscHasla = dlugoscHasla;
                    iloscRund = 10;
                    board.iloscRund = iloscRund;
                    iloscKolorow = 5;
                    new Mastermind();
                }
                else if(poziomy.getSelectedIndex() == 1){
                    tryb = 1;
                    solutionGenerator.poziom = 1;
                    dlugoscHasla = 4;
                    solutionGenerator.dlugoscHasla = dlugoscHasla;
                    board.dlugoscHasla = dlugoscHasla;
                    iloscRund = 10;
                    board.iloscRund = iloscRund;
                    iloscKolorow = 6;
                    new Mastermind();
                }
                else if(poziomy.getSelectedIndex() == 2){
                    tryb = 1;
                    solutionGenerator.poziom = 2;
                    dlugoscHasla = 5;
                    solutionGenerator.dlugoscHasla = dlugoscHasla;
                    board.dlugoscHasla = dlugoscHasla;
                    iloscRund = 12;
                    board.iloscRund = iloscRund;
                    iloscKolorow = 8;
                    new Mastermind();
                }
            }
        }
    }
}







