# PRM2T22L_PRO_Slepowronska_Mastermind

Repozytorium *Natalii Ślepowrońskiej*, Kamili Kwaśniewskiej i Adama Gościniaka, do pracy nad projektem z przedmiotu PRM2T. Konkretnie: wykonanie gry Mastermind w javie.

# **Projekt PRM2T gra Mastermind**
###### Projekt powinien zawierać:
1.	Generator plansz
    - Automatyczne generowanie z podanego poziomu trudności
    - Ręczne wpisanie przez użytkowników
2.	Solver
3.	Funkcje określone przez zespół:
4.	Program powinien umożliwiać:
    -	Cofanie ruchów
    -	Zapis stanu gry i późniejszy odczyt
    -	Zapis planszy do pliku umożliwiającego czytelny wydruk łamigłówki
## ETAP I
- Zaplanowanie szczegółów systemu
- Analiza obiektowa
- Plan ról
- Przypadki użycia
- Plan klas
- Dekompozycja problemu planując metody w klasach
###### **REZULTAT**
1.	Opis słowny przypadków użycia 
2.	Diagram przypadków użycia
3.	Diagram klas
4.	Repozytorium 

###### Generator
1.	Zmienne wpływające na trudność planszy
    -	Tryb początkujący/ tryb klasyczny
        -	Tryb początkujący – pokazuje na konkretnej pozycji, czy dany kolor jest w kodzie/jest prawidłowy na tym miejscu
        -	Tryb klasyczny – gra pokazuje po prostu ilość dobrego koloru/ kolorów w prawidłowym miejscu, niekoniecznie wskazując na to, która pozycja jest dobra
    -	Ilość pól
    -	Ilość kolorów (w stosunku do pól)
    -	Ilość prób
    -	Dodatkowe
        -	Ekstra kolor
        -	Minus jedna próba 
        -	Ułatwienie – nie powtarzające się kolory
2.	Preset ustawienia – automatyczne generowanie planszy, z możliwością zaznaczenia dodatkowych opcji 
    -	Tryb początkujący 
        -	Łatwy
1.	4 pola, 5 kolorów, 10 prób
        -	Średni
1.	5 pól, 6 kolorów, 10 prób
        -	Trudny
1.	6 pól, 8 kolorów, 12 prób
    -	Tryb klasyczny 
        -	Łatwy
            -	4 pola, 5 kolorów, 10 prób
        -	Średni
            -	4 pola, 6 kolorów, 10 prób
        -	Trudny
            -	5 pól, 8 kolorów, 12 prób
3.	Wpisywanie przez użytkownika – dostępne pola i ograniczenia
    -	Ilość pól
        -	Minimalnie 4 maksymalnie 6
    -	Ilość prób 
        -	Liczba parzysta minimalnie 8 maksymalnie 14
    -	Ilość kolorów
        -	Minimalnie 4 maksymalnie 10
    -	Boolean czy ułatwienie – nie powtarzające się kolory 
        -	Wtedy ograniczenie ilość kolorów musi być nie mniejsza niż ilość pól
###### Solver 
1.	Podpowiedzi 
    -	Założenie gry eliminuje możliwość podpowiedzi, gra jest na tyle nie skomplikowana, że podpowiedź większa, niż taka którą gra zakłada, mogłaby negatywnie wpływać na jej odbiór
2.	Wskazówki 
    -	Gra mastermind zakłada system wskazówek, dzięki któremu można rozwiązać łamigłówkę
    -	Rozróżnienie na tryb początkujący i klasyczny (ad. Generator 1.a)
###### Funkcje określone przez zespół
1.	GUI
2.	Kolory
###### Dodatkowe możliwości
1.	Cofanie ruchów
    - Cofanie ruchów może być możliwe do momentu zatwierdzenia rzędu i poznania wskazówek na jego podstawie – mechanizm, który umożliwia zmianę wyboru miejsc oraz kolorów w danej próbie
    - Dalsze cofanie, po poznaniu wskazówki, sprawiłoby, że użytkownik mógłby poprzez cofanie wygrywać gry w „Jednym ruchu”
2.	Zapis stanu gry i późniejszy odczyt
3.	Zapis planszy do pliku umożliwiającego czytelny wydruk łamigłówki
    -	Wygląd eksportu – GUI
###### Plan ról na dzień 25.04.2022
1. Natalia Ślepowrońska
    - Zbieranie informacji
    - Kwestie organizacyjne
    - Generator
2. Kamila Kwaśniewska 
    - Projekt i napisanie GUI
3. Adam Gościniak
    - Board
    - Kulki
4. Wszyscy
    - Systematyczna praca nad każdymi klasami, praca grupowa, każdy każdemu pomaga.
### Diagram klas (odnośnik)
![Diagram klas](https://scontent-waw1-1.xx.fbcdn.net/v/t1.15752-9/278299605_496944578880396_1577048329286449662_n.png?_nc_cat=106&ccb=1-5&_nc_sid=ae9488&_nc_ohc=0W0sMUrFIlsAX-X5TaZ&_nc_ht=scontent-waw1-1.xx&oh=03_AVJgMbvXJ4zkETF3I5S_PpfsD97boVoq_d036JDLkujjKA&oe=628CFC4D)

### Diagram przypadków użycia (odnośnik)
![Diagram przypadków użycia](https://scontent-waw1-1.xx.fbcdn.net/v/t1.15752-9/279061509_431326132038393_408850108953728698_n.png?_nc_cat=110&ccb=1-5&_nc_sid=ae9488&_nc_ohc=CBJJNwhHFCoAX9XF0Ye&_nc_ht=scontent-waw1-1.xx&oh=03_AVJgRcwMm0kGZ0-Eac-rkGN0oDMMKymom-VImI50Y6fmCw&oe=628D09E9)
