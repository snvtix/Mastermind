package pl.edu.pw.elka.prm2t.project.mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == Settings.start){
            Mastermind mastermind = new Mastermind(); // no cos nie pyklo
        }
    }

    public static void main(String[] args) {
        Settings settings = new Settings();
    }
}
