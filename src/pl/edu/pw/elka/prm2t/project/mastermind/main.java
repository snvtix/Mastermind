package pl.edu.pw.elka.prm2t.project.mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main implements ActionListener {

    static int pom = 0; // fix

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == Settings.start){
            pom = 1;
        }
    }

    public static void main(String[] args) {
        Settings settings = new Settings();
        if(pom == 1){ // fix
            Mastermind mastermind = new Mastermind();
        }

    }
}
