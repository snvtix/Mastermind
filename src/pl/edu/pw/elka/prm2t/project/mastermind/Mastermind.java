package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mastermind extends Variables implements ActionListener {

    JFrame f2;
    String[] koloryOpcje1 = {"czerwony","biały","niebieski","czarny","żółty"};
    String[] koloryOpcje2 = {"czerwony","biały","niebieski","czarny","żółty","fioletowy","zielony"};
    String[] koloryOpcje3 = {"czerwony","biały","niebieski","czarny","żółty","pomarańczowy","fioletowy","zielony"};
    JComboBox[] options = new JComboBox[dlugoscHasla];
    JButton potwierdz = new JButton("POTWIERDŹ");
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
        for (int i = 0; i < dlugoscHasla; i++) {
            if(poziom == 0){
                options[i]= new JComboBox<>(koloryOpcje1);
                options[i].setBounds(i*55, 0, 55, 55);
                options[i].setVisible(true);
                f2.add(options[i]);
            }
            else if(poziom == 1){
                options[i]= new JComboBox<>(koloryOpcje2);
                options[i].setBounds(i*55, 0, 55, 55);
                options[i].setVisible(true);
                f2.add(options[i]);
            }
            else{
                options[i]= new JComboBox<>(koloryOpcje3);
                options[i].setBounds(i*55, 0, 55, 55);
                options[i].setVisible(true);
                f2.add(options[i]);
            }
        }
        potwierdz.setBounds(400, 0, 150, 50);
        potwierdz.setVisible(true);
        f2.add(potwierdz);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        SolutionGenerator sG = new SolutionGenerator(poziom,dlugoscHasla,iloscRund,iloscKolorow);
        int[] pom = new int[dlugoscHasla];
        for(int i = 0; i < dlugoscHasla; i++){
            pom[i] = sG.solutionGenerator()[i];
        }
        if(source == potwierdz){
            for(int i = 0; i < dlugoscHasla; i++){
                if(options[i].getSelectedIndex() == pom[i]){
                    //kolor odpowiedniego przycisku sie zmienia
                    for (int j = 0; j < dlugoscHasla; j++) {
                        f2.remove(options[i]);
                    }
                    for (int k = 0; k < dlugoscHasla; k++) {
                        if(poziom == 0){
                            options[i]= new JComboBox<>(koloryOpcje1);
                            options[i].setBounds(i*55, 0, 55, 55);
                            options[i].setVisible(true);
                            f2.add(options[i]);
                        }
                        else if(poziom == 1){
                            options[i]= new JComboBox<>(koloryOpcje2);
                            options[i].setBounds(i*55, 0, 55, 55);
                            options[i].setVisible(true);
                            f2.add(options[i]);
                        }
                        else{
                            options[i]= new JComboBox<>(koloryOpcje3);
                            options[i].setBounds(i*55, 0, 55, 55);
                            options[i].setVisible(true);
                            f2.add(options[i]);
                        }
                    }

                }
                else{
                    //tu tez
                    for (int i = 0; i < dlugoscHasla; i++) {
                        f2.remove(options[i]);
                    }
                }
            }
        }


        if(winner == true){
            JOptionPane.showMessageDialog(f2,"wygrana");
        }
        if(winner == false){
            JOptionPane.showMessageDialog(f2,"przegrana");
        }
    }
}
