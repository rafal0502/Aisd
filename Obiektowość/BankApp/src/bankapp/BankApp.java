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
        System.out.println("sald= " + balance);
    }
    
    
}




public class BankApp {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
