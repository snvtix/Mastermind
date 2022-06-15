package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Mastermind extends Variables implements ActionListener {

    JFrame f3;
    // Poniższe zmienne koloryOpcje1, koloryOpcje2 i koloryOpcje3 są ustalone raz na zawsze, a poza tym przydadzą się
    // w klasie Board, więc mogą być final i static.
    final static String[] koloryOpcje1 = {"czerwony","biały","niebieski","czarny","żółty"};
    final static String[] koloryOpcje2 = {"czerwony","biały","niebieski","czarny","żółty","fioletowy","zielony"};
    final static String[] koloryOpcje3 = {"czerwony","biały","niebieski","czarny","żółty","fioletowy","zielony","błękitny"};
    JButton potwierdz = new JButton("POTWIERDŹ");
    JButton[] podpowiedz = new JButton[dlugoscHasla];
    SolutionGenerator sG = new SolutionGenerator(poziom,dlugoscHasla,iloscRund,iloscKolorow);
    int[] pom1 = sG.solutionGenerator();
    int licznik = 0;
    Random rand = new Random();
    boolean winner = false;
    Board board;

    Mastermind(int poziom, int dlugoscHasla, int iloscRund, int iloscKolorow){
        super(poziom, dlugoscHasla, iloscRund, iloscKolorow);

        System.out.println(Arrays.toString(pom1));

        f3 = new JFrame("Mastermind");
        f3.setLayout(null);
        f3.setSize(55*dlugoscHasla+340, 55*iloscRund+60);
        board = new Board(poziom, dlugoscHasla, iloscRund, iloscKolorow);
        board.setBounds(0,0,55*dlugoscHasla,700);
        if(dlugoscHasla == 4){
            potwierdz.setBounds(370, 0, 150, 50);
        }
        else if(dlugoscHasla == 5){
            potwierdz.setBounds(440, 0, 150, 50);
        }
        potwierdz.setVisible(true);
        potwierdz.addActionListener(this);
        f3.getContentPane().add(board);
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
        int pom5 = 10;

        if(source == potwierdz){
            licznik = licznik + 1;
            if(licznik < iloscRund){

                int[] currentOptions = board.getCurrentOptions();

                for (int i = 0; i < dlugoscHasla; i++) {
                    podpowiedz[i] = new JButton();
                    podpowiedz[i].setBackground(Color.darkGray);
                    podpowiedz[i].setBounds(47*(dlugoscHasla + 1)+(i*30), (licznik-1)*55+15, 27, 27);
                    podpowiedz[i].setVisible(true);
                    f3.add(podpowiedz[i]);

                    if(poziom == 0){
                        if(currentOptions[i] == pom1[i]){
                            podpowiedz[i].setBackground(Color.red);
                            pom4 = pom4+1;
                        }
                        else{
                            podpowiedz[i].setBackground(Color.white);
                        }
                    }
                    else if(poziom == 1) {
                        if (currentOptions[i] == pom1[i]) {
                            pom3 = rand.nextInt(dlugoscHasla);
                            while(true){
                                if(pom3 == pom5){
                                    pom3 = rand.nextInt(dlugoscHasla);
                                }
                                else{
                                    podpowiedz[pom3].setBackground(Color.red);
                                    break;
                                }
                            }
                            pom4 = pom4+1;
                            pom5 = pom3;
                        } else {
                            pom3 = rand.nextInt(dlugoscHasla);
                            while(true){
                                if(pom3 == pom5){
                                    pom3 = rand.nextInt(dlugoscHasla);
                                }
                                else{
                                    podpowiedz[pom3].setBackground(Color.white);
                                    break;
                                }
                            }
                            pom5 = pom3;
                        }
                    }
                    if(pom4==dlugoscHasla){
                        winner = true;
                        JOptionPane.showMessageDialog(f3,"Wygrałeś...");
                    }
                    else{
                        winner = false;
                    }
                }
                board.storeOptions();
                board.moveOptionsBoxes(licznik);
                f3.repaint();
            }
            else{
                if(winner == false){
                    JOptionPane.showMessageDialog(f3,"Przegrałeś XD");
                }
            }
        }
    }
}
