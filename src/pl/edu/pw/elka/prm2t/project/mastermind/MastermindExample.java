package pl.edu.pw.elka.prm2t.project.mastermind;

import java.util.*;


public class MastermindExample {

    public static void main(String[]args)
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] haslo = new int[4];
        for (int i = 0; i <4; i++) {
            haslo[i] = r.nextInt(9)+1 ;
        }

        int[] zgadniecia = new int[4];

        ArrayList<String> wyniki = new ArrayList<String>();
        boolean winner = false;


        System.out.println("Jakies intrukcje czy cos, zgaduj, liczby od 1 do 9");


        int licznikZgadnięć = 0;

        while (licznikZgadnięć<10) {
            licznikZgadnięć++;
            int pos = 1;


            System.out.println("Dawaj strzelaj, to już " + licznikZgadnięć + " próba, a masz 10 jak coś");

            for(int i =0; i<4; i++) {
                System.out.println("Pozycja " + pos++ + "");
                zgadniecia[i] = sc.nextInt();

                if (zgadniecia[i] > 9 || zgadniecia [i] < 1){  
                    throw new IllegalArgumentException("Gościu między 1 a 9 strzelamy, czaisz?");
                }
            }

            if (zgadniecia[0]==haslo[0]) {
                wyniki.add("git1");
            }

            if (zgadniecia[1]==haslo[1]) {
                wyniki.add("git2");
            }

            if (zgadniecia[2]==haslo[2]) {
                wyniki.add("git3");
            }

            if (zgadniecia[3]==haslo[3]) {
                wyniki.add("git4");
            }



            if (zgadniecia[0]==haslo[1] || zgadniecia[0]==haslo[2] || zgadniecia[0]==haslo[3]) {
                wyniki.add("prawie git1");
            }

            if (zgadniecia[1]==haslo[2] || zgadniecia[1]==haslo[3] || zgadniecia[1] == haslo[0]) {
                wyniki.add("prawie git2");
            }

            if (zgadniecia[2]==haslo[0] || zgadniecia[2]==haslo[1] || zgadniecia[2] == haslo[3]) {
                wyniki.add("prawie git3");
            }

            if (zgadniecia[3]==haslo[0] || zgadniecia[3]==haslo[1] || zgadniecia[3] == haslo[2]) {
                wyniki.add("prawie git4");
            }


            if (zgadniecia[0] == haslo[0] && zgadniecia[1] == haslo[1] && zgadniecia[2] == haslo[2] && zgadniecia[3] == haslo[3]) {
                winner = true;
                break;
            }


            System.out.print("Obczaj sobie jak ci idzie " + wyniki);


            wyniki.clear();

            if (licznikZgadnięć == 10) {
                System.out.println("przegrana");
                break;
            }

        }


        if (winner == true) {
            System.out.println("wygrana");
        }


    }

}
