package pl.edu.pw.elka.prm2t.project.mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main implements ActionListener {

    int pom = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == Settings.start){
            pom = 1;
        }
    }

    public static void main(String[] args) {
        Settings settings = new Settings();
        if(pom.equals(1)){ //??
            Mastermind mastermind = new Mastermind();
        }

    }
}
