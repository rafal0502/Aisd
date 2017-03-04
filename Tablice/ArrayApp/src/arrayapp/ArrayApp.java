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
        long [] arr ;           //referencja do tablicy
        arr = new long [100];   //tworzymy tablicę
        int nElems = 0;         //liczba elementów
        int j;                 //licznik pętli
        long searchKey;         //klucz elementu, którego szukamy
        
        arr[0] = 77;            //wstawiamy 10 elementów
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;        //teraz w tablicy jest 10 elementów
        
        for(j=0; j<nElems; j++)     //wyświetlamy elementy
            System.out.print(arr[j] + " ");
        System.out.println("");
        
        
        searchKey = 66;     //szukamy elementu o kluczu 66
        for(j=0;j<nElems; j++)      //dla każdego elementu
            if(arr[j] == searchKey) //czy znaleziono
                break;              //tak,wyjście z pętli przed końcem
        if(j ==nElems)              //czy jesteśmy na końcu?
            System.out.println("Nie znaleziono " + searchKey);      //tak
        else
            System.out.println("Znaleziono " + searchKey);          //nie
        
        
        
        searchKey = 55;         //usuwamy element o kluczu 55
        for(j=0; j<nElems; j++) //szukamy go
            if(arr[j] == searchKey)
                break;
        for(int k=j; k<nElems; k++) //przesuwamy te, które są wyżej
            arr[k] = arr[k+1];
        nElems--;                   //zmniejszamy ilość elementów
        
        for(j=0; j<nElems; j++)     //wyświetlamy elementy
            System.out.print(arr[j] + " ");        
        
        }
}
