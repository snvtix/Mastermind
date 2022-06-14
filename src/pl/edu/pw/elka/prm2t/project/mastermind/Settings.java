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
    JComboBox<String> tryby = new JComboBox<>(trybyOpcje); // [JW] lepiej sprecyzować typ danych
    JComboBox<String> poziomy = new JComboBox<>(poziomyOpcje);

    Settings(int poziom, int dlugoscHasla, int iloscRund, int iloscKolorow) {
        super(poziom, dlugoscHasla, iloscRund, iloscKolorow);
        f1 = new JFrame("Mastermind");
        f1.setSize(300, 300);
        f1.setLayout(new GridLayout(4,1));
        text = new JTextField("Wybierz poziom trudności"); // [JW] Do takich rzeczy służy JLabel, a nie wyłączony JTextField
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
            if(tryby.getSelectedIndex() == 0){
                if(poziomy.getSelectedIndex() == 0){
                    // [JW] Tworzenie obiektów Variables jest chyba zbędne
                    new Mastermind(0,4,10,5);
                }
                else if(poziomy.getSelectedIndex() == 1){
                    new Mastermind(1,5,10,6);
                }
                else if(poziomy.getSelectedIndex() == 2){
                    new Mastermind(2,5,10,8);
                }
            }
            else if(tryby.getSelectedIndex() == 1){
                if(poziomy.getSelectedIndex() == 0){
                    new Mastermind(0,4,10,5);
                }
                else if(poziomy.getSelectedIndex() == 1){
                    new Mastermind(1,4,10,6);
                }
                else if(poziomy.getSelectedIndex() == 2){
                    new Mastermind(2,5,12,8);
                }
            }
        }
    }
}







