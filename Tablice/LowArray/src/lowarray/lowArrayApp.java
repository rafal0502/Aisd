/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowarray;

/**
 *
 * @author rafal
 */
public class LowArray {

    private long[] a;           //referencja do tablicy
    
    
    public LowArray(int size)           //konstruktor
    {
        a = new long[size];             //tworzymy tablicę
    }
    
    public void setElem(int index, int value)   //zapisujemy wartość
    {
        a[index] = value;
    }
    
    public long getElem(int index)              //pobieramy warość
    {
        return a[index];
    }
    
}

    public class lowArrayApp
    {
    public static void main(String[] args) {
        LowArray arr;           //referencja do klasy LowArray
        arr = new LowArray(100);    //tworzymy obiekt klasy LowArray
        int nElems = 0;
        int j;
        
        
        arr.setElem(0,77);
        arr.setElem(1,99);
        arr.setElem(2,44);
        arr.setElem(3,55);
        arr.setElem(4,22);
        arr.setElem(5,88);
        arr.setElem(6,11);
        arr.setElem(7,00);
        arr.setElem(8,66);
        arr.setElem(9,33);         
        nElems= 10;                          //teraz w tabliy 10 elementow
        
        for(j=0; j<nElems; j++)             //wyświetlamy elementy
            System.out.print(arr.getElem(j) + " ");
        System.out.println(" ");
        
        int searchKey = 26;         //szukany element
        for(j=0; j<nElems; j++)         //dla każdego elementu...
            if(arr.getElem(j) == searchKey)     //czy znaleziono
                break;
        if(j==nElems)                   //nie
            System.out.println("Nie znaleziono " + searchKey);
        else                            //tak
            System.out.println("Znaleziono " + searchKey);
    }
    
    
}
