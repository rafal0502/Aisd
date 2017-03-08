/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderedapp;

/**
 *
 * @author rafal
 */
class OrdArray{
    private long[] a;   //referencja do tablicy
    private int nElems; //liczba elementów w tablicy
    
    public OrdArray(int max)
    {
        a = new long[max];  //tworzymy tablicę
        nElems = 0;
    }
    
    public int size()
    {
        return nElems;
    }
    // użycie wyszukiwania binarnego!
    // zwracamy indeks poszukiwanego elementu
    public int find(long searchKey)
    {
        int lowerBound = 0;         //ograniczenie dolne
        int upperBound = nElems-1;  //ograniczenie górne
        int curIn;                  //aktualnie sprawdzany indeks
        
        
        while(true)
        {
            curIn =(lowerBound + upperBound)/2;
            if (a[curIn] == searchKey)
                return curIn;           //znaleźliśmy element
            else if(lowerBound > upperBound)
                return nElems;          //el. poza zakresem,sugeruje,że nie ma
                                        //searchKey w ogóle w tablicy
            
            else
            {
                if(a[curIn]<searchKey)  
                    lowerBound = curIn+1;   //jest w górnej połowie
                else if(a[curIn]>searchKey)
                    upperBound = curIn-1;   //jest w dolnej połowie   
            }
        }
    }
    //można było również użyć binarnego,żeby trochę przyśpieszyć
    //tu liniowe
    public void insert(long value)
    {
    int j;
    for(j=0;j<nElems;j++)       //znajdujemy dla niego miejsce
        if(a[j] > value)
            break;
    for(int k=nElems; k>j; k--) //przesuwmay większe elementy
        a[k] = a[k-1];
    a[j]= value;        //wstawiamy
    nElems++;           //zwiekszamy licznik elementów
    }    
    
    //tu już używamy binarnego podejścia 
    public boolean delete(long value)
    {
    int j = find(value);
    if(j == nElems)
        return false;
    else                                //znaleziono
    {
        for(int k=j; k<nElems;k++)      //przesuwamy większe elementy
            a[k]=a[k+1];
        nElems--;    
        return true;
    }
    }   //koniec delete
    
    public void display()
    {
    for(int j=0; j<nElems; j++)         //dla każdego elementu
        System.out.print(a[j] + " ");   //...wypisujemy jego wartość
    System.out.println("");
    }
}



public class OrderedApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maxSize = 100;          //rozmiar tablicy
        OrdArray arr;               //referencja do tablicy
        arr = new OrdArray(maxSize);//tworzymy tablice
        
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        
        
        int searchKey = 55;         //wyszukiwanie elementu
        if  (arr.find(searchKey) != arr.size())
            System.out.println("Znaleziono " + searchKey);
        else
            System.out.println("Nie znaleziono " + searchKey);
        
        arr.display();          //wypisujemy zawartość tablicy
        
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        
        arr.display();          //wypisujemy zawartość tablicy
        
    }
    
}
