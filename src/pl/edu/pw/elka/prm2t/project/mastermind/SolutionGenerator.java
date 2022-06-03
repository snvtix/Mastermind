package pl.edu.pw.elka.prm2t.project.mastermind;

import java.util.Random;

public class SolutionGenerator {

    int dlugoscHasla;
    int poziom;

    public void setDlugoscHasla(int dlugoscHasla) {
        this.dlugoscHasla = dlugoscHasla;
    }

    public void setPoziom(int poziom) {
        this.poziom = poziom;
    }

    public int[] solutionGenerator(){

        Random rand = new Random();
        int[] haslo = new int[dlugoscHasla];

        for (int i = 0; i <= dlugoscHasla; i++){ //losowanie hasla
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
