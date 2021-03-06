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
class OrdArray
{
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
    
    
     public int find2(long searchKey)
    {
        int lowerBound = 0;         //ograniczenie dolne
        int upperBound = nElems-1;  //ograniczenie górne
        int curIn;                  //aktualnie sprawdzany indeks
              
        while(true){
            curIn =(lowerBound + upperBound)/2;
            if(curIn==nElems-1)
                return curIn+1;
            else if(curIn==0)
                return curIn;
            else if(a[curIn]<searchKey && a[curIn+1]>=searchKey)
                    return curIn+1;
            else if(a[curIn]<searchKey)  
                    lowerBound = curIn+1;   //jest w górnej połowie
            else if(a[curIn]>searchKey)
                    upperBound = curIn-1;   //jest w dolnej połowie          
            }
           
    }
    

    public void insert2(long value)
    {
    int j=find2(value);
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
    
    
    public void merge(OrdArray tab)
    {
        int i=0;
        int j=0;
        int lena = a.length;
        int lentab = tab.a.length;
        int lenc = lena + lentab;
        OrdArray c = new OrdArray(lenc);
        while(i !=lena || j!=lentab){
        if(a[i] <= tab.a[j] && i<lena)
        {
            c.insert(a[i]);
            i++;
        }
        else if(tab.a[j] < a[i] && j<lentab)
        {
            c.insert(tab.a[j]);
            j++;
        }
        if(i==lena)
        {
            for(;j<tab.nElems;j++)
            {
                c.insert(tab.a[j]);
            }
                
        }
        else if(j==lentab)
        {
            for(;i<nElems;i++)
            {
                c.insert(a[i]);
            }           
        }
        }
        c.display();
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
        
        System.out.println("Testowanie wstawianie z wyszukiwaniem binarnym: ");
        arr.insert2(34258);
        arr.insert2(25);
        arr.insert2(1);
        arr.insert2(321);
        arr.insert2(24);
        arr.insert2(25);
        arr.insert2(76);
        arr.insert2(0);
        arr.display();     
        
       
        OrdArray b;               //referencja do tablicy
        b = new OrdArray(5);//tworzymy tablice
        
        
        OrdArray a;               //referencja do tablicy
        a = new OrdArray(5);//tworzymy tablice
        
        a.insert(48);
        a.insert(5);
        a.insert(12);
        a.insert(31);
        a.insert(4);
        b.insert(58);
        b.insert(2);
        b.insert(4);
        b.insert(21);
        b.insert(41);
        
        
        a.display();
        b.display();
        System.out.println("Merge ");
        a.merge(b);
        
        
        
    }
    
}

