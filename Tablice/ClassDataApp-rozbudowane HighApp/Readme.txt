Podobny do highArray.java w któym przechowywaliśmy elementy typu long.
Wystarczy kilka niewielkich zmian,aby zaadaptować tamten program do korzy-
stania z klasy Person. 
Najważniejsze z nich:
    -typem elementów tablicy a jest teraz referencja do obiektu Person
    
    -klucz poszukiwań (nazwisko) jest teraz obiektem typu String,więc
     porównania wymagają użycia metody equals(), zamiast operatora ==.
     Metoda getLast() klasy Person zwraca nazwisko, a equals() wykonuje
     porównanie.
    
    -metoda insert() tworzy nowy obiekt klasy Person i wstawia go do tablicy
     zamiast wartości typu long 

    -zmodyfikowana metoda main() by obsłużyć większą ilość wypisywanych danych