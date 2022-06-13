package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mastermind extends Variables implements ActionListener {

    JFrame f2;

    String[] koloryOpcje1 = {"czerwony","biały","niebieski","czarny","żółty"};
    String[] koloryOpcje2 = {"czerwony","biały","niebieski","czarny","żółty","fioletowy","zielony"};
    String[] koloryOpcje3 = {"czerwony","biały","niebieski","czarny","żółty","pomarańczowy","fioletowy","zielony"};
    JComboBox[] options = new JComboBox[dlugoscHasla];
    JButton potwierdz = new JButton("POTWIERDŹ");
    int licznik = 0;
    boolean winner = false;

    Mastermind(int poziom, int dlugoscHasla, int iloscRund, int iloscKolorow){
        super(poziom, dlugoscHasla, iloscRund, iloscKolorow);
        f2 = new JFrame("Mastermind");
        f2.setLayout(null);
        f2.setSize(700, 700);
        Board board = new Board(poziom, dlugoscHasla, iloscRund, iloscKolorow);
        Board.PaintBoard paintBoard = board.new PaintBoard();
        paintBoard.setBounds(0,0,700,700);
        paintBoard.setOpaque(true);
        f2.add(paintBoard);
        String[] pom;
        for (int i = 0; i < dlugoscHasla; i++) {
            if(poziom == 0){
                pom = koloryOpcje1;
            }
            else if(poziom == 1){
                pom = koloryOpcje2;
            }
            else{
                pom = koloryOpcje3;
            }
            options[i]= new JComboBox<>(pom);
            options[i].setBounds(i*55, 0, 55, 55);
            options[i].setVisible(true);
            f2.add(options[i]);
        }
        potwierdz.setBounds(400, 0, 150, 50);
        potwierdz.setVisible(true);
        potwierdz.addActionListener(this);
        f2.add(potwierdz);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        SolutionGenerator sG = new SolutionGenerator(poziom,dlugoscHasla,iloscRund,iloscKolorow);
        int[] pom1 = sG.solutionGenerator();
        String[] pom2;

        if(source == potwierdz){
            licznik = licznik + 1;
            if(licznik < iloscRund){
                for(int i = 0; i < dlugoscHasla; i++){
                    if(poziom == 0){
                        if(options[i].getSelectedIndex() == pom1[i]){
                            System.out.println("GIT");
                        }
                        else{
                            System.out.println("NIE GIT");
                        }
                    }
                    if(poziom == 1) {
                        if (options[i].getSelectedIndex() == pom1[i]) {
                            System.out.println("GIT");
                        } else {
                            System.out.println("NIE GIT");
                        }
                    }
                }
                for(int i = 0; i < dlugoscHasla; i++){
                    f2.remove(options[i]);
                }
                for (int i = 0; i < dlugoscHasla; i++) {
                    if(poziom == 0){
                        pom2 = koloryOpcje1;
                    }
                    else if(poziom == 1){
                        pom2 = koloryOpcje2;
                    }
                    else{
                        pom2 = koloryOpcje3;
                    }
                    options[i]= new JComboBox<>(pom2);
                    options[i].setBounds(i*55, licznik*55, 55, 55);
                    options[i].setVisible(true);
                    f2.add(options[i]);
                }
                f2.repaint();
            }
            else{
                if(winner == true){
                    JOptionPane.showMessageDialog(f2,"wygrana");
                }
                if(winner == false){
                    JOptionPane.showMessageDialog(f2,"przegrana");
                }
            }
        }
    }
}
