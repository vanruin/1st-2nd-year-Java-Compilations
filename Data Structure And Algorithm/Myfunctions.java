
package synchronous_act_6;

import java.util.Scanner;
 


public class Myfunctions {
    
    private String name;
    private int accNo;  
    private double balance;
    
    
 
    public void BankAccount(String n, int a, double amount)
    {   
        name = n;
        accNo = a;
        balance = amount;
    }
    
    // Constructor to set default opening account balance to zero
    public  void BankAccount(String n, int a)
    {
        name = n;
        accNo = a;
        balance = 0.00;
    }
    
    
   
       
    public String convToString(  ) 
    {
        return("Account name: " + this.name + ", Account number: " + this.accNo + ", Available balance: " + "£" + this.balance);
    }
    
    
    
    public void deposit(double amount) {
        if (amount <= 0) { 
         
            System.err.println("Cannot deposit negative amounts. Please enter a different amount.");
        }
        else {
            this.balance += amount;
            System.out.format("£%.2f has been deposited\n", amount);
        }
    }
    
        
   
    public void withdraw(double amount) {
        if (this.balance >= amount) { 
            this.balance -= amount;
            System.out.format("£%.2f has been withdrawn\n", amount);
        }
        else { 
            System.err.println("Transaction cancelled due to insufficient funds. Check balance or deposit funds.");
        }
    }
    
    
    /* --------------------
       Method used to display account balance 
       --------------------*/
    public double getBalance() {
        return balance;
        
    }
}

 
    
  

    

    
    
      
      
    






