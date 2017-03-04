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
// bubbleSort.java
// demonstruje sortowanie bąbelkowe
// uruchomienie programu: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
class ArrayBub
   {
   private long[] a;                 // referencja do tablicy
   private int nElems;               // licznik elementów
//--------------------------------------------------------------
   public ArrayBub(int max)          // konstruktor
      {
      a = new long[max];                 // tworzymy tablicę
      nElems = 0;                        // na razie brak elementów
      }
//--------------------------------------------------------------
   public void insert(long value)    // wstawienie elementu do tablicy
      {
      a[nElems] = value;             // wstawiamy element
      nElems++;                      // zwiększamy licznik elementów
      }
//--------------------------------------------------------------
   public void display()             // wypisuje zawartość tablicy
      {
      for(int j=0; j<nElems; j++)       // dla każdego elementu...
         System.out.print(a[j] + " ");  // ...wypisujemy jego wartość
      System.out.println("");
      }
//--------------------------------------------------------------
   public void bubbleSort()
      {
      int out, in;

      for(out=nElems-1; out>1; out--)   // pętla zewnętrzna (malejąca)
         for(in=0; in<out; in++)        // pętla wewnętrzna (rosnąca)
            if( a[in] > a[in+1] )       // zła kolejność?
               swap(in, in+1);          // no to zamiana
      }  // koniec bubbleSort()
//--------------------------------------------------------------
   private void swap(int one, int two)
      {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
      }
//--------------------------------------------------------------
   }  // koniec klasy ArrayBub
////////////////////////////////////////////////////////////////
public class BubbleSortApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            // rozmiar tablicy
      ArrayBub arr;                 // referencja do tablicy
      arr = new ArrayBub(maxSize);  // tworzymy tablicę

      arr.insert(77);               // wstawiamy 10 elementów
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      arr.display();                // wypisujemy je

      arr.bubbleSort();             // sortujemy bąbelkowo

      arr.display();                // i znów wypisujemy
      }  // koniec main()
   }  // koniec klasy BubbleSortApp
////////////////////////////////////////////////////////////////

    

