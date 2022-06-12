package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mastermind extends Variables implements ActionListener {

    JFrame f2;
    String[] koloryOpcje = {"czerwony","biały","niebieski","czarny","żółty","pomarańczowy","fioletowy","zielony"};
    JComboBox[] options = new JComboBox[dlugoscHasla];
    JLabel[] feedback = new JLabel[dlugoscHasla];
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
        for (int i = 0; i < dlugoscHasla; i++) {
            for (int j = 0; j < iloscRund; j++) {
                options[i]= new JComboBox<>(koloryOpcje);;
                options[i].setBounds(i*55, j*55, 55, 55);
                feedback[i] = new JLabel();
                feedback[i].setBounds(23 * (dlugoscHasla + 1) + (i * 27), 15 + (j * 55), 20, 20);
                f2.add(options[i]);
                f2.add(feedback[i]);
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
