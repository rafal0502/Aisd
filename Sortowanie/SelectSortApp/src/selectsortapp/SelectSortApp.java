/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectsortapp;

/**
 *
 * @author rafal
 */

class ArraySel
{
    private long[] a;       //referencja do tablicy
    private int nElems;     //liczba elementów w tablicy
    
    public ArraySel(int max)    //konstruktor
    {
        a = new long[max];      //tworzymy tablicę
        nElems = 0;             //na razie brak elementów
    }
    
    public void insert(long value)
    {
        a[nElems] = value;      //wstawiamy element
        nElems++;               //zwiększenie licznika elementów
    }
    
    public void display()
    {
        for(int j=0; j<nElems;j++)  //dla każdego elementu...
            System.out.print(a[j] + " ");
        System.out.println("");
    }
    
    public void selectionSort()
    {
        int out, in, min;
        
        for(out=0; out<nElems; out++)   //pętla zewnętrzna
        {
            min = out;          //wartość minimum
            for(in=out+1; in<nElems; in++)  //pętla wewnętrzna
                if(a[in]< a[min])           //jeżeli min większe...
                    min = in;               //...mamy nowe minimum
            swap(out,min);
        }
    }
    
       private void swap(int one, int two)
       {
           long temp = a[one];
           a[one] = a[two];
           a[two] = temp;
       }
}

public class SelectSortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxSize = 100;          //rozmiar tablicy
        ArraySel arr;               //referencja do tablicy
        arr = new ArraySel(maxSize);     //tworzymy tablicę
        
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
        
        arr.display();              //wypisujemy je
            
        arr.selectionSort();        //sortujemy przez wybór
        arr.display();              //wypisujemy
    }
    
}
