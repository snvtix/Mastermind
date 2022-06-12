package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mastermind extends Variables implements ActionListener {

    JFrame f2;
    String[] koloryOpcje = {"czerwony","biały","niebieski","czarny","żółty","pomarańczowy","fioletowy","zielony"};
    JComboBox kolory = new JComboBox<>(koloryOpcje);
    boolean winner = false;

    Mastermind(){
        f2 = new JFrame("Mastermind");
        f2.setSize(600, 600);
        Board board = new Board();
        Board.PaintBoard paintBoard = board.new PaintBoard();
        f2.add(paintBoard);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);

        //wyświetlić będzie łatwo bo to wsm tyle, i jak już będziemy mieli napisany kod to wystarczy w niego
        //wrzucić takiego prostego booleana coś w stylu if(zgadnięcie == hasło){ winner = true; }

        if(winner == true){
            JOptionPane.showMessageDialog(f2,"wygrana");
        }
        if(winner == false){
            JOptionPane.showMessageDialog(f2,"przegrana");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //tu bedzie gra nasza
    }

}
