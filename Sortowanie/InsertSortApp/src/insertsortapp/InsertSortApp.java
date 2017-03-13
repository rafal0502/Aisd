/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertsortapp;

/**
 *
 * @author rafal
 */

class ArrayIns
{
    private long[] a;       //referencja do tablicy
    private int nElems;     //licznik elementów tablicy
    
    
    
    
    public ArrayIns(int max)    //konstruktor
    {
        a = new long[max];
        nElems = 0;
    }
    
    public void insert(long value)  //wstawianie elementu do tablicy
    {
        a[nElems] = value;      //wstawienie elementu
        nElems ++;              //zwiększenie licznika
    }
    
    
    public void display()       //wypisuje elementy tablicy
    {
        for(int j=0; j<nElems;j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
    
    
    public void insertionSort()
    {
        int in,out;
        
        for(out=1;out<nElems;out++)     //out to pierwszy nie posortowany
        {
            long temp = a[out];         //kopiujemy wyróżniony element
            in = out;
            while(in>0 && a[in-1] >= temp)
            {
                a[in] = a[in-1];     //przesuwamy element w prawo
                --in;               //przesuwamy się w lewo
            }
            a[in] = temp;           //wstawiamy wyróżniony element
        }
          
    }
    
    public float median()
    {
        insertionSort();
        if(nElems % 2 == 1)
        return a[nElems/2];
        else
        return (float)(a[nElems/2-1] + a[nElems/2])/2;
    }
    
    
}


public class InsertSortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int maxSize = 100;      //rozmiar tablicy
        ArrayIns arr;
        arr = new ArrayIns(maxSize);
        
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
        arr.insert(47);
        
        arr.display();                  //wypisujemy
        
        arr.insertionSort();            //sortujemy je
        
        arr.display();              //znowu wypisujemy
        
        
        
        System.out.println("Mediana z tablicy wynosi: ");
        System.out.println(arr.median());
    }
    
    
    
    
}
