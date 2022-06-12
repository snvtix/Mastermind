package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mastermind extends Variables implements ActionListener {

    JFrame f2;
    String[] koloryOpcje = {"czerwony","biały","niebieski","czarny","żółty","pomarańczowy","fioletowy","zielony"};
    JComboBox kolory = new JComboBox<>(koloryOpcje);
    boolean winner = false;


    Mastermind(int poziom, int dlugoscHasla, int iloscRund){
        super(poziom, dlugoscHasla, iloscRund);
        System.out.println(dlugoscHasla);
        f2 = new JFrame("Mastermind");
        f2.setLayout(null);
        f2.setSize(600, 700);
        Board board = new Board(poziom, dlugoscHasla, iloscRund);
        Board.PaintBoard paintBoard = board.new PaintBoard();
        paintBoard.setBounds(0,0,600,700);
        paintBoard.setOpaque(true);
        f2.add(paintBoard);
        JComboBox[] lists = new JComboBox[dlugoscHasla];
        for (int i = 0; i < dlugoscHasla; i++) {
            for (int j = 0; j < iloscRund; j++) {
                lists[i]= kolory;
                lists[i].setVisible(true);
                lists[i].setBounds(i,  j, 10, 10);
                f2.add(lists[i]);
            }
        }
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //tu bedzie gra nasza
        if(winner == true){
            JOptionPane.showMessageDialog(f2,"wygrana");
        }
        if(winner == false){
            JOptionPane.showMessageDialog(f2,"przegrana");
        }
    }
}
