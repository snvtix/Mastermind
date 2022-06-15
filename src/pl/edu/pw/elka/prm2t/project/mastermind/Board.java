package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {

    private final Variables vars;
    JComboBox<String>[] options;
    ArrayList<Integer[]> optionsHistory;  // historia wszystkich wyborów gracza

    public Board(int poziom, int dlugoscHasla, int iloscRund, int iloscKolorow) {
        vars = new Variables(poziom, dlugoscHasla, iloscRund,  iloscKolorow);

        setLayout(null);

        options = new JComboBox[dlugoscHasla];
        optionsHistory = new ArrayList<>();

        String[] pom;
        for (int i = 0; i < dlugoscHasla; i++) {
            if(poziom == 0){
                pom = Mastermind.koloryOpcje1;
            }
            else if(poziom == 1){
                pom = Mastermind.koloryOpcje2;
            }
            else{
                pom = Mastermind.koloryOpcje3;
            }
            options[i]= new JComboBox<>(pom);
            options[i].setBounds(i*55, 0, 55, 55);
            options[i].setVisible(true);
            add(options[i]);
        }
    }

    public int[] getCurrentOptions() {
        int[] currentOptions = new int[vars.dlugoscHasla];
        for (int i = 0; i < vars.dlugoscHasla; i++) {
            currentOptions[i] = options[i].getSelectedIndex();
        }
        return currentOptions;
    }

    public void moveOptionsBoxes(int licznik) {
        for (int i = 0; i < vars.dlugoscHasla; i++) {
            options[i].setBounds(i*55, licznik*55, 55, 55);
        }
    }

    public void storeOptions() {
        Integer[] newOptions  = new Integer[vars.dlugoscHasla];
        int[] currentOptions = getCurrentOptions();
        for (int i = 0; i < vars.dlugoscHasla; i++) {
            newOptions[i] = currentOptions[i];
        }
        optionsHistory.add(newOptions);
    }

    public void paintComponent(Graphics g) {

        System.out.println(vars.dlugoscHasla);
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        setBackground(Color.pink);
        for (int i = 0; i < vars.dlugoscHasla + 4; i++) {
            for (int j = 0; j < vars.iloscRund; j++) {
                if (i < vars.dlugoscHasla) {

                    Color currentColor = Color.darkGray;;
                    if (j < optionsHistory.size()) {
                        switch (optionsHistory.get(j)[i]) {
                            case 0 -> currentColor = Color.red;
                            case 1 -> currentColor = Color.white;
                            case 2 -> currentColor = Color.blue;
                            case 3 -> currentColor = Color.black;
                            case 4 -> currentColor = Color.yellow;
                            case 5 -> currentColor = Color.magenta;
                            case 6 -> currentColor = Color.green;
                            case 7 -> currentColor = Color.cyan;
                        }
                    }

                    g2d.setColor(currentColor);
                    g2d.fillOval((i * 55), (j * 55), 55, 55);
                }
            }
        }
        //g2d.drawString();
    }
}

