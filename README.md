# PRM2T22L_PRO_Wagner_Mastermind

Repozytorium Natalii Ślepowrońskiej, Kamili Kwaśniewskiej i Adama Gościniaka, do pracy nad projektem z przedmiotu PRM2T. Konkretnie: wykonanie gry Mastermind w javie.

Projekt PRM2T gra Mastermind
Projekt powinien zawierać:
1.	Generator plansz
    a.	Automatyczne generowanie z podanego poziomu trudności
    b.	Ręczne wpisanie przez użytkowników
2.	Solver
3.	Funkcje określone przez zespół:
4.	Program powinien umożliwiać:
    a.	Cofanie ruchów
    b.	Zapis stanu gry i późniejszy odczyt
    c.	Zapis planszy do pliku umożliwiającego czytelny wydruk łamigłówki
ETAP I
•	Zaplanowanie szczegółów systemu
•	Analiza obiektowa
•	Plan ról
•	Przypadki użycia
•	Plan klas
•	Dekompozycja problemu planując metody w klasach
REZULTAT
1.	Opis słowny przypadków użycia 
2.	Diagram przypadków użycia
3.	Diagram klas
4.	Repozytorium 

Generator
1.	Zmienne wpływające na trudność planszy
    a.	Tryb początkujący/ tryb klasyczny
        i.	Tryb początkujący – pokazuje na konkretnej pozycji, czy dany kolor jest w kodzie/jest prawidłowy na tym miejscu
        ii.	Tryb klasyczny – gra pokazuje po prostu ilość dobrego koloru/ kolorów w prawidłowym miejscu, niekoniecznie wskazując na to, która pozycja jest dobra
    b.	Ilość pól
    c.	Ilość kolorów (w stosunku do pól)
    d.	Ilość prób
    e.	Dodatkowe
        i.	Ekstra kolor
        ii.	Minus jedna próba 
        iii.	Ułatwienie – nie powtarzające się kolory
2.	Preset ustawienia – automatyczne generowanie planszy, z możliwością zaznaczenia dodatkowych opcji 
    a.	Tryb początkujący 
        i.	Łatwy
1.	4 pola, 5 kolorów, 10 prób
        ii.	Średni
1.	5 pól, 6 kolorów, 10 prób
        iii.	Trudny
1.	6 pól, 8 kolorów, 12 prób
    b.	Tryb klasyczny 
        i.	Łatwy
            1.	4 pola, 5 kolorów, 10 prób
        ii.	Średni
            1.	4 pola, 6 kolorów, 10 prób
        iii.	Trudny
            1.	5 pól, 8 kolorów, 12 prób
3.	Wpisywanie przez użytkownika – dostępne pola i ograniczenia
    a.	Ilość pól
        i.	Minimalnie 4 maksymalnie 6
    b.	Ilość prób 
        i.	Liczba parzysta minimalnie 8 maksymalnie 14
    c.	Ilość kolorów
        i.	Minimalnie 4 maksymalnie 10
    d.	Boolean czy ułatwienie – nie powtarzające się kolory 
        i.	Wtedy ograniczenie ilość kolorów musi być nie mniejsza niż ilość pól
#Solver 
1.	Podpowiedzi 
    a.	Założenie gry eliminuje możliwość podpowiedzi, gra jest na tyle nie skomplikowana, że podpowiedź większa, niż taka którą gra zakłada, mogłaby negatywnie wpływać na jej odbiór
2.	Wskazówki 
    a.	Gra mastermind zakłada system wskazówek, dzięki któremu można rozwiązać łamigłówkę
    b.	Rozróżnienie na tryb początkujący i klasyczny (ad. Generator 1.a)
#Funkcje określone przez zespół
1.	GUI
2.	Kolory
#Dodatkowe możliwości
1.	Cofanie ruchów
        a.	Cofanie ruchów może być możliwe do momentu zatwierdzenia rzędu i poznania wskazówek na jego podstawie – mechanizm, który umożliwia zmianę wyboru miejsc oraz kolorów w danej próbie
    b.	Dalsze cofanie, po poznaniu wskazówki, sprawiłoby, że użytkownik mógłby poprzez cofanie wygrywać gry w „Jednym ruchu”
2.	Zapis stanu gry i późniejszy odczyt
3.	Zapis planszy do pliku umożliwiającego czytelny wydruk łamigłówki
    a.	Wygląd eksportu – GUI, wydruk kuleczek(?) 
