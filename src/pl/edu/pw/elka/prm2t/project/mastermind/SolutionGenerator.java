package pl.edu.pw.elka.prm2t.project.mastermind;

import java.util.Random;

public class SolutionGenerator {

    public int[] haslo(){
        Random rand = new Random();
        int[] haslo = new int[5];
        for (int i = 0; i <5; i++){   //losowanie hasla
            haslo[i] = rand.nextInt(5);
        }
        return haslo;
    }

        //narazie robimy dla najprostrzych ustawien
        //kazda liczba potem bedzie odpowiadac odpowiedniemu kolorowi, co bedzie mialo zastosowanie w gui
        //5 kolorów
}
