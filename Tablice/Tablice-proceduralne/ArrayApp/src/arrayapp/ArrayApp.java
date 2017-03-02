/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

/**
 *
 * @author rafal
 */
public class ArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long[] arr;             //referencja do tablicy
        arr = new long[100];    //tworzymy tablicę
        int nElems = 0;         //liczba elementów
        int j;                  //licznik pętli
        long searchKey;         //klucz elementu, którego szukamy
        
        arr[0] = 77;            //wstawiamy 10 elementów
        arr[1] = 55;
        arr[2] = 12;
        arr[3] = 54;
        arr[4] = 89;
        arr[5] = 90;
        arr[6] = 54;
        arr[7] = 11;
        arr[8] = 231;
        arr[9] = 1;            
        nElems = 10;                        //teraz w tablicy mamy 10 elementów
        
        for(j=0; j<nElems; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        
        searchKey = 66;           //szukamy elementu o kluczu 66
        for(j=0; j<nElems; j++)
            if(arr[j] == searchKey)
                break;
            if(j == nElems)
                System.out.println("Nie znaleziono " + searchKey);
            else
                System.out.println("Znaleziono " + searchKey);
        
        searchKey = 55;             //usuwamy element o kluczu 55
        for(j=0; j<nElems; j++)     //szukamy go
            if(arr[j] == searchKey)
                    break;
        for(int k=j; k<nElems; k++)     //przesuwamy te elemnty, które są wyżej
            arr[k] = arr[k+1];
        nElems--;
        
        for(j=0; j<nElems; j++)         //wyświetlamy elementy
            System.out.print(arr[j] + " ");
        System.out.println("");
        }    
}
