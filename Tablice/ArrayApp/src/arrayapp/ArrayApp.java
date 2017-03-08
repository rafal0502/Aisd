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
        long[] arr = new long[100];         //referencja do tablicy
        int nElems = 0;                     //liczba elementów
        int j;                              //licznik pętli
        long searchKey;                     //klucz elementu,którego szukamy
        
        /***********************************/
        
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;                        //teraz w tablicy 10 elementów
        
        for(j=0;j<nElems;j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.print(" ");
        
        /************************************/
        searchKey = 66;
        for(j=0;j<nElems;j++)   
            if(arr[j] == searchKey)
                break;
        if(j == nElems)
            System.out.println("Nie znaleziono " + searchKey);
         else
            System.out.println("Znaleziono " + searchKey);
        
        searchKey = 55;
        for(j=0; j<nElems; j++)
            if(arr[j] == searchKey)
                break;
        
        for(int k=j; k<nElems; k++) //przesuwamy te,które są wyżej
            arr[k] = arr[k++];
        nElems--;
        
        for(j=0; j < nElems; j++)       //wyświetlamy elementy
            System.out.print(arr[j] + " ");
        System.out.println("");        
        
    }
    
}
