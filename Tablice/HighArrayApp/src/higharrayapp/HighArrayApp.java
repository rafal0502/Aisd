/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package higharrayapp;

/**
 *
 * @author rafal
 */

class HighArray
{
    private long [] a;      //referencja do tablicy
    private int nElems;     //liczba elementów w tablicy
    
    public HighArray(int max)
    {
        a = new long[max];      //tworzymy tablicę
        nElems =0;              //na razie brak elementów
    }
    
        
    public boolean find(long searchKey)     //szukamy określonej wartości
    {
    int j;
    for(j=0;j<nElems;j++)       //dla każdego elementu
        if(a[j] == searchKey)
            break;
    if(j == nElems)
        return false;
    else
        return true;
    }
    
    public void insert(long value)      //wstawianie elementu do tablicy
    {
        a[nElems] = value;              //wstawiamy
        nElems++;                       //zwiększamy liczbę elementów
    }
    
    public boolean delete(long value)
    {
        int j=0;
        while(j<nElems){          //szukamy elementu
            if(value == a[j]){
              for(int k=j; k<nElems; k++) //przesuwamy pozostałe elementy
              a[k] = a[k+1];
            nElems--;
            }
            if(j== nElems-1)
              return true;
            j++;
        }          
        return false;
    }
    
    public void display()           //wypisuje zawartość tablicy
    {
     for(int j=0; j<nElems; j++)
         System.out.print(a[j] + " ");
     System.out.println("");
    }
    
    public long getMax()
    {
        long max = a[0];
        for(long x:a)
        {
            if (x>max)
                max = x;
        }
        return max;    
    }
    
    public boolean removeMax()
    {
        long max = getMax();
        if(delete(max))
            return true;
        else 
            return false;
    }
    
    public boolean nonEmpty()
    {
        if (nElems != 0)
            return true;
        else
            return false;
    }
    
    
    public void noDups()
    { 
        for (int x=0;x<nElems;x++)
        {
            long key =a[x];
            int z=x+1;
            for(;z<nElems;z++)
            { 
                if(a[z]==key && key!=-1)
                {
                a[z]=-1;
                }
            }
        }
         for(long y:a)
            {
                if(y==-1)
                    delete(y);
            }
        display();
    }
}
/********************************************/

public class HighArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxSize = 100;      //rozmiar tablicy
        HighArray arr;          //referencja do tablicy
        arr = new HighArray(maxSize);   //tworzymy tablicę
        
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(22);
        arr.insert(99);
        arr.insert(22);
        arr.insert(66);
        arr.insert(33);
        
        
        arr.display();      //wypisujemy elementy
        
        int searchKey = 35;     //szukamy elementu 35
        if(arr.find(searchKey))
            System.out.println("Znaleziono " + searchKey);
        else
            System.out.println("Nie znaleziono " + searchKey);
        
        arr.delete(00);         //usuwamy 3 elementy
        arr.delete(55);
        arr.delete(99);
        
        System.out.println("Największy element w tablicy  to: " + arr.getMax());
        arr.display();          //wypisujemy elementy ponownie

        System.out.println("Usunięcie klucza o największej wartości: ");
        arr.removeMax();
        arr.display();
        
        HighArray arr2 = new HighArray(100);
        while(arr.nonEmpty())
        {
        arr2.insert(arr.getMax());
        arr.removeMax();
        }
        System.out.println("Posortowana tablica: ");
        arr2.display();
        
        
        
        HighArray arr3;          //referencja do tablicy
        arr3 = new HighArray(maxSize);   //tworzymy tablicę
       
        arr3.insert(1);
        arr3.insert(5);
        arr3.insert(3);
        arr3.insert(5);
        arr3.insert(5);
        arr3.insert(2);
        arr3.insert(6);
        arr3.insert(6);
        arr3.insert(2);
        arr3.insert(6);
        System.out.println("with Dups: ");
        arr3.display();
        System.out.println("No dups");
        arr3.noDups();
    }
    
}
