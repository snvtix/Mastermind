package pl.edu.pw.elka.prm2t.project.mastermind;

import java.util.Random;

public class SolutionGenerator {

    //potem powiazemy to z klasa generator

    int dlugoscHasla = 4;
    public int[] haslo(){
        Random rand = new Random();
        int[] haslo = new int[dlugoscHasla];
        for (int i = 0; i <= dlugoscHasla; i++){   //losowanie hasla
            haslo[i] = rand.nextInt(5);
        }
        return haslo;
    }
    //narazie robimy dla najprostrzych ustawien
    //kazda liczba potem bedzie odpowiadac odpowiedniemu kolorowi, co bedzie mialo zastosowanie w gui
    //5 kolorow
}
