/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsortapp;

/**
 *
 * @author rafal
 */

class Person
{
    private String lastName;        //nazwisko
    private String firstName;       //imie
    private int age;                //wiek
    
    
    public Person(String last, String first,int age)
    {
        lastName = last;
        firstName = first;
        this.age = age;         //też działa,jak w C#
    }
    
    public void displayPerson()
    {
        System.out.print(" Nazwsiko: " + lastName);
        System.out.print(" Imię: " + firstName);
        System.out.println(", Wiek: " + age);
    }
    
    public String getLast()         //pobierz nazwisko
    {
        return lastName;
    }    
}


class ArrayInOb
{
    private Person[] a;         //referencja do tablicy
    private int nElems;         //liczba elementów
    
    
    public ArrayInOb(int max)
    {
        a = new Person[max];     //tworzymy tablicę
        nElems = 0;             //na razie brak rekordów w tablicy
    }
    
    public void insert(String last, String first, int age)
    {
        a[nElems]= new Person(last,first,age);
        nElems++;
        
    }
    
    public void display()       //wypisujemy zawartość tablicy
    {
        for(int j=0;j<nElems;j++)
          a[j].displayPerson();
    }
    
    public void insertionSort()
    {
        int out,in;
        for(out=1;out<nElems;out++)
        {
            Person temp = a[out];  //out to pierwszy nieposortowany element
            in = out;              //zaczynamy od out
        
        while(in>0 && a[in-1].getLast().compareTo(temp.getLast())>0)
        {
            a[in] = a[in-1];            //przesuwamy elementy o w prawo
            --in;                       //przesuwamy się w lewo
        }
        a[in] = temp;  
    }                                   //koniec pętli for
}                                       //koniec insertionSort
}

public class ObjectSortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxSize = 100;          //rozmiar tablicy
        ArrayInOb arr;                      //referencja do tablicy
        arr = new ArrayInOb(maxSize);       //tworzymy tablicę
        
        
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smmith","Doc", 59);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Smith", "Paul", 42);
        arr.insert("Yee", "Tom", 46);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez","Jose", 72);
        arr.insert("Vang","Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        
        
        System.out.println("Przed posortowaniem: ");
        arr.display();
        
        arr.insertionSort();
        
        System.out.println("Po posortowaniu: ");
        arr.display();   
       
    }
    
}











