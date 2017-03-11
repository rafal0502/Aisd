/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortapp;

/**
 *
 * @author rafal
 */

class ArrayBub
{
    private long[] a;       //referencja do tablicy
    private int nElems;     //licznik elementów
    
    public ArrayBub(int max)    //kontruktor
    {
        a = new long[max];
        nElems = 0;             //na razie brak elementu
    }
    
    public void insert(long value)  //wstawianie elementu do tablicy
    {
        a[nElems] = value;
        nElems++;
    }
    
    public void display()
    {
        for(long x:a)
            System.out.print(x + " ");
        System.out.println("");
            
    }
    
    public void bubbleSort()
    {
        int out, in;
        
        for(out=nElems-1; out>1; out--) //pętla zewnętrzna (malejąca)
            for(in=0;in<out;in++)       //pętla wewnętrzna (rosnąca)
                if( a[in] > a[in+1])    //zła kolejność
                    swap(in,in+1);
    }
    
    public void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
      
}
public class BubbleSortApp {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int maxSize = 10;              //rozmiar tablicy
        ArrayBub arr;                   //referencja do tablicy
        arr = new ArrayBub(maxSize);    //tworzymy tablicę
        
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(44);
        arr.insert(88);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
               
        
        
        arr.display();  
        arr.bubbleSort();
        arr.display();
       
    }
    
}
