/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author rafal
 */

class BankAccount
{
    private double balance;     //saldo konta
    
    public BankAccount(double openingBalance)   //konstruktor
    {
        balance = openingBalance;
    }
    
    public void deposit(double amount)  //dokonuje wpłaty
    {
        balance += amount;
    }
    
    public void withdraw(double amount) //dokonuje wypłaty
    {
        balance -= amount;
    }
    
    public void display()       //wypisuje saldo
    {
        System.out.println("saldo = " + balance);
    }
    
    
}

 class BankApp {
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount ba1 = new BankAccount(100.00); //tworzymy konto
        System.out.print("Przed transakcjami ");
        ba1.display();                             // wypisujemy saldo
        
        ba1.deposit(74.35);                        //dokonujemy wpłaty
        ba1.withdraw(20.00);                    //dokonujemy wypłaty
        
        
        System.out.print("Po transakcjach: ");
        ba1.display();
    }
    
}
