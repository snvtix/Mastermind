package pl.edu.pw.elka.prm2t.project.mastermind;

import java.util.*;


public class MastermindExample {

    public static void main(String[]args)
    {
        Random r = new Random(); // generator losowych liczb

        Scanner sc = new Scanner(System.in); //input zwykły

        int[] haslo = new int[4]; //haslo do zgadnięcia


        for (int i = 0; i <4; i++){   //losowanie hasla
            haslo[i] = r.nextInt(9)+1 ;
        }

        int[] zgadniecia = new int[4];

        ArrayList<String> wyniki = new ArrayList<String>(); // no jakby arraylist z wynikami poprzednimi
        boolean winner = false;


        System.out.println("Jakies intrukcje czy cos, zgaduj, liczby od 1 do 9");


        int licznikZgadnięć = 0; // licznik zganięć

        while (licznikZgadnięć<10) {
            licznikZgadnięć++;
            int pos = 1;


            System.out.println("Dawaj strzelaj, to już " + licznikZgadnięć + " próba, a masz 10 jak coś");

            for(int i =0; i<4; i++){   //ten input do odpowiedzi wrzucany tutaj
                System.out.println("Pozycja " + pos++ + "");
                zgadniecia[i] = sc.nextInt();

                if (zgadniecia[i] > 9 || zgadniecia [i] < 1){  // ustawienie granic liczb do wpisania
                    throw new IllegalArgumentException("Gościu między 1 a 9 strzelamy, czaisz?");
                }
            }
            //jak dobra cyfra na dobrej pozycji to dodajesz git, opcja która nie pokazuje na której pozycji trafione
            /*for (int i=0; i<4; i++) {
                if (zgadniecia[i] == haslo[i]) {
                    wyniki.add("git");
                }

            }*/

            //opcja która pokazuje na której pozycji trafione
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


            // jeśli cyfra pojawia się w hasle to dodaje prawie git
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


            //opcja która nie pokazuje na której pozycji prawie trafione
           /* if (zgadniecia[0]==haslo[1] || zgadniecia[0]==haslo[2] || zgadniecia[0]==haslo[3]) {
                wyniki.add("prawie git");
            }

            if (zgadniecia[1]==haslo[2] || zgadniecia[1]==haslo[3] || zgadniecia[1] == haslo[0]) {
                wyniki.add("prawie git");
            }

            if (zgadniecia[2]==haslo[0] || zgadniecia[2]==haslo[1] || zgadniecia[2] == haslo[3]) {
                wyniki.add("prawie git");
            }

            if (zgadniecia[3]==haslo[0] || zgadniecia[3]==haslo[1] || zgadniecia[3] == haslo[2]) {
                wyniki.add("prawie git");
            }*/



            // wychodzi z pętli jeśli znajdzie haslo
            if (zgadniecia[0] == haslo[0] && zgadniecia[1] == haslo[1] && zgadniecia[2] == haslo[2] && zgadniecia[3] == haslo[3]) {
                winner = true;
                break;
            }

            // tu jeszcze muszę napisać coś co będzie wstawiało 0 w nietrafione miejsca
            // no i zrobić tak żeby pokazywało po kolei trafione prawie trafione i nietrafione sloty
            // żeby było od razu np [0, git, 0, prawie git]
            // musi sprawdzać po kolei każdą wpisaną wartość a nie wszystkie na raz względem jednej kategorii
            System.out.print("Obczaj sobie jak ci idzie " + wyniki);


            wyniki.clear(); // czyści liste żeby następne zgadnięcia tylko były wpisane bo inaczej sie burdel robi

            if (licznikZgadnięć == 10) {
                System.out.println("przegrana");
                break;
            }

        }

        if (winner) {
            System.out.println("wygrana");
        }

    }

}
