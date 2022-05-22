package pl.edu.pw.elka.prm2t.project.mastermind;

import java.util.Random;

public class SolutionGenerator {

    //potem powiazemy to z gui ALE JAK
    //moze wrzucic ta metode do gui, bo gui juz nie moze po tym dziedziczyc

    public int[] haslo(int dlugoscHasla, int poziom){
        dlugoscHasla = 4; //tylkonarazie tak, dopoki z gui nie bedziemy tego wybierac
        poziom = 0; // same
        Random rand = new Random();
        int[] haslo = new int[dlugoscHasla];
        for (int i = 0; i <= dlugoscHasla; i++){   //losowanie hasla
            if(poziom == 0){
                haslo[i] = rand.nextInt(5);
            }
            else if(poziom == 1){
                haslo[i] = rand.nextInt(6);
            }
            else{
                haslo[i] = rand.nextInt(8);
            }
        }
        return haslo;
    }
}
