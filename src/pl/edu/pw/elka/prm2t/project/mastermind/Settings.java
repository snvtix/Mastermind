package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends Variables implements ActionListener {

    JFrame f1;
    JTextField text;
    JButton start = new JButton("START");
    String[] trybyOpcje = {"początkujący","klasyczny"};
    String[] poziomyOpcje = {"łatwy","średni","trudny"};
    JComboBox tryby = new JComboBox<>(trybyOpcje);
    JComboBox poziomy = new JComboBox<>(poziomyOpcje);
    int iloscKolorow;

    Settings(int poziom, int dlugoscHasla, int iloscRund) {
        super(poziom, dlugoscHasla, iloscRund);
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
                    new Variables(0,4,10);
                    new SolutionGenerator(0,4,10);
                    iloscKolorow = 5;
                    new Mastermind(0,4,10);
                }
                else if(poziomy.getSelectedIndex() == 1){
                    new Variables(1,5,10);
                    new SolutionGenerator(1,5,10);
                    iloscKolorow = 6;
                    new Mastermind(1,5,10);
                }
                else if(poziomy.getSelectedIndex() == 2){
                    new Variables(2,5,10);
                    new SolutionGenerator(2,5,10);
                    iloscKolorow = 6;
                    new Mastermind(2,5,10);
                }
            }
            else if(tryby.getSelectedIndex() == 1){ //klasyczmy
                if(poziomy.getSelectedIndex() == 0){
                    new Variables(0,4,10);
                    new SolutionGenerator(0,4,10);
                    iloscKolorow = 5;
                    new Mastermind(0,4,10);
                }
                else if(poziomy.getSelectedIndex() == 1){
                    new Variables(1,4,10);
                    new SolutionGenerator(1,4,10);
                    iloscKolorow = 6;
                    new Mastermind(1,4,10);
                }
                else if(poziomy.getSelectedIndex() == 2){
                    new Variables(2,5,12);
                    new SolutionGenerator(2,5,12);
                    iloscKolorow = 8;
                    new Mastermind(2,5,12);
                }
            }
        }
    }
}







