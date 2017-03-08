/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdataapp;

/**
 *
 * @author rafal
 */
class Person
{
    private String lastName;    //nazwisko
    private String firstName;   //imię
    private int age;            //wiek
    
    public Person(String last, String first, int a)     //konstruktor
    {
        lastName = last;
        firstName = first;
        age = a;   
    }
    
    public void displayPerson()
    {
        System.out.print(" Nazwisko: " + lastName );
        System.out.print(", Imię: " + firstName);
        System.out.println(", Wiek: "+ age);
        
    }
    
    public String getLast()         //pobierz nazwisko
    {
        return lastName;
    }  
}


class ClassDataArray
{
    private Person[] a;     //referencja do tablicy
    private int nElems;     //liczba elementów
    
    public ClassDataArray(int max)  //konstruktor
    {
        a = new Person[max];        //tworzymy tablice
        nElems = 0;
    }
    
    public Person find(String searchName)   //wyszukiwanie rekordu
    {
        int j;
        for(j=0; j<nElems; j++)             //dla każdego elementu
            if(a[j].getLast().equals(searchName))  //czy zgadza się nazwisko
                break;
        if (j == nElems)            //czy doszliśmy do końca tablicy?
            return null;            //tak, rekordu nie znaleziono
        else
            return a[j];            //nie,rekord znaleziony
    }
    
    
    //wstawianie rekordu do tablicy
    
    public void insert(String last, String first, int age)
    {
        a[nElems] = new Person(last,first,age);
        nElems++;                   //zwiększamy licznik elementów
    }
    
    
    public boolean delete(String searchName)    //usunięcie rekordu z tablicy
    {
        int j;                         
        for(j=0;j<nElems;j++)           //szukamy rekordu
            if(a[j].getLast().equals(searchName))
                break;
        if(j==nElems)                   //rekord nieznaleziony
            return false;
        else
        {
            for(int k=j; k<nElems; k++) //przesuwamy kolejne w dół
                a[k] = a[k+1];
            nElems--;
            return true;        
        }
    }
    
    
    
    public void displayA()          //wypisuje zawartość tablicy
    {
        for(int j=0; j<nElems;j++)
            a[j].displayPerson();
    }  
}


public class ClassDataApp {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int maxSize = 100;          //rozmiar tablicy
        ClassDataArray arr;                     //referencja do tablicy
        arr = new ClassDataArray(maxSize);      //tworzymy tablicę
        
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        
        arr.displayA();             //wypisujemy rekordy
        
        String searchKey = "Stimson";       //szukamy rekordu
        Person found;
        found = arr.find(searchKey);
        if(found != null)
        {
        System.out.print("Znaleziono ");
        found.displayPerson();
        }
        else
         System.out.println("Nie znaleziono " + searchKey);
        
        System.out.println("Usuwanie rekordów: Smith, Yee, Creswell");
        arr.delete("Smith");    //Usuwamy 3 rekordy
        arr.delete("Yee");
        arr.delete("Creswell");
        
        
        arr.displayA();         //wypisujemy rekordy ponownie
        
    }
    
}
