package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Mastermind extends Variables implements ActionListener {

    JPanel f2;
    JFrame f3;
    String[] koloryOpcje1 = {"czerwony","biały","niebieski","czarny","żółty"};
    String[] koloryOpcje2 = {"czerwony","biały","niebieski","czarny","żółty","fioletowy","zielony"};
    String[] koloryOpcje3 = {"czerwony","biały","niebieski","czarny","żółty","fioletowy","zielony","błękitny"};
    JComboBox[] options = new JComboBox[dlugoscHasla];
    JButton potwierdz = new JButton("POTWIERDŹ");
    JButton[] podpowiedz = new JButton[dlugoscHasla];
    JButton[] info = new JButton[dlugoscHasla];
    SolutionGenerator sG = new SolutionGenerator(poziom,dlugoscHasla,iloscRund,iloscKolorow);
    int[] pom1 = sG.solutionGenerator();
    int licznik = 0;
    Random rand = new Random();
    boolean winner = false;

    Mastermind(int poziom, int dlugoscHasla, int iloscRund, int iloscKolorow){
        super(poziom, dlugoscHasla, iloscRund, iloscKolorow);
        f2 = new JPanel();
        f2.setLayout(null);
        f2.setSize(55*dlugoscHasla+340, 55*iloscRund+60);
        f3 = new JFrame("Mastermind");
        f3.setLayout(null);
        f3.setSize(55*dlugoscHasla+340, 55*iloscRund+60);
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
            f3.add(options[i]);
        }
        if(dlugoscHasla == 4){
            potwierdz.setBounds(370, 0, 150, 50);
        }
        else if(dlugoscHasla == 5){
            potwierdz.setBounds(440, 0, 150, 50);
        }
        potwierdz.setVisible(true);
        potwierdz.addActionListener(this);
        f3.add(f2);
        f3.add(potwierdz);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String[] pom2;
        int pom3;
        int pom4 = 0;

        if(source == potwierdz){
            licznik = licznik + 1;
            if(licznik < iloscRund){
                for (int i = 0; i < dlugoscHasla; i++) {
                    podpowiedz[i] = new JButton();
                    podpowiedz[i].setBackground(Color.darkGray);
                    podpowiedz[i].setBounds(47*(dlugoscHasla + 1)+(i*30), (licznik-1)*55+15, 27, 27);
                    podpowiedz[i].setVisible(true);
                    f3.add(podpowiedz[i]);
                    info[i] = new JButton();
                    info[i].setBounds(i*55 + 15, (licznik-1)*55+15, 27, 27);
                    if(options[i].getSelectedIndex() == 0){
                        info[i].setBackground(Color.red);
                    }
                    else if(options[i].getSelectedIndex() == 1){
                        info[i].setBackground(Color.white);
                    }
                    else if(options[i].getSelectedIndex() == 2){
                        info[i].setBackground(Color.blue);
                    }
                    else if(options[i].getSelectedIndex() == 3){
                        info[i].setBackground(Color.black);
                    }
                    else if(options[i].getSelectedIndex() == 4){
                        info[i].setBackground(Color.yellow);
                    }
                    else if(options[i].getSelectedIndex() == 5){
                        info[i].setBackground(Color.magenta);
                    }
                    else if(options[i].getSelectedIndex() == 6){
                        info[i].setBackground(Color.green);
                    }
                    else if(options[i].getSelectedIndex() == 7){
                        info[i].setBackground(Color.cyan);
                    }
                    info[i].setVisible(true);
                    if(poziom == 0){
                        if(options[i].getSelectedIndex() == pom1[i]){
                            podpowiedz[i].setBackground(Color.red);
                            pom4 = pom4+1;
                        }
                        else{
                            podpowiedz[i].setBackground(Color.white);
                        }
                    }
                    else if(poziom == 1) { //to nie jest przemyslane
                        if (options[i].getSelectedIndex() == pom1[i]) {
                            pom3 = rand.nextInt(dlugoscHasla);
                            podpowiedz[pom3].setBackground(Color.red);
                            pom4 = pom4+1;
                        } else {
                            pom3 = rand.nextInt(dlugoscHasla);
                            podpowiedz[pom3].setBackground(Color.white);
                        }
                    }
                    if(pom4==dlugoscHasla){
                        winner = true;
                        JOptionPane.showMessageDialog(f2,"Wygrałeś...");
                    }
                    else{
                        winner = false;
                    }
                    f3.remove(options[i]);
                    f3.add(info[i]);
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
                    f3.add(options[i]);
                }
                f3.repaint();
            }
            else{
                if(winner == false){
                    JOptionPane.showMessageDialog(f2,"Przegrałeś XD");
                }
            }
        }
    }
}
