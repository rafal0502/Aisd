/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowarrayapp;

/**
 *
 * @author rafal
 */

class LowArray{
    private long[] a;       //referencja do tablicy
    
    public LowArray(int size)   //konstruktor
    {
        a = new long[size];
    }
    
    
    public void setElement(int index, long value)   //zapisujemy wartość
    {
        a[index] = value;
    }
    public long getElement(int index)               //pobieramy wartość
    {
        return a[index];
    }
    
    
}


public class LowArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    LowArray arr = new LowArray(100);       //tworzymy obiekt za pomoca konstruktora
    int nElems = 0;                         //liczba elementów tablicy
    int j;
    
    arr.setElement(1, 77);
    arr.setElement(1, 99);
    arr.setElement(2, 44);
    arr.setElement(3, 55);
    arr.setElement(4, 22);
    arr.setElement(5, 88);
    arr.setElement(6, 11);
    arr.setElement(7, 00);
    arr.setElement(8, 66);
    arr.setElement(9, 33);
    nElems = 10;                            //teraz w tablicy jest 10 elementow
    
    for(j=0; j<nElems; j++)                 //wyświetlamy elementy
        System.out.print(arr.getElement(j) + " ");
    System.out.println("");
    
    int searchKey = 26;                     //szukany element
    for(j=0; j<nElems;j++)
        if(arr.getElement(j) == searchKey)  //czy znaleziono?
            break;
    if(j == nElems)
        System.out.println("Nie znaleziono " + searchKey);
    else 
        System.out.println("Znaleziono" + searchKey);
    
    // usuwamy element 55
    
    for(j=0; j<nElems; j++)
        if(arr.getElement(j) == 55)
            break;
    for(int k=j; k<nElems; k++)             //przesuwamy pozostałe elementy
        arr.setElement(k, arr.getElement(k+1));
    nElems--;
    
    for(j=0;j<nElems;j++)
        System.out.print(arr.getElement(j) + " ");
    System.out.println("");
        
    

    }
    
}








