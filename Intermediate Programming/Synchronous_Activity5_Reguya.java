
package synchronous_activity.pkg5_reguya;

import java.util.Scanner;

public class Synchronous_Activity5_Reguya {

 
    public static void main(String[] args) {
   Scanner fetch = new Scanner(System.in); 
   
   
   
   int r = 0;
   
   while(r <= 0 ){
   
   
       System.out.println("Enter a balance: ");
       int balance = fetch.nextInt();
        System.out.println(" ");
       int balanceOne = fetch.nextInt();
      
       
       if(balanceOne >= 1){
       System.out.println(balance - balanceOne);
       }
       else if(balanceOne >= -1){
        System.out.println(balance + balanceOne);   
       }
   
   
   }
   
   
   
   
   
     int x = 1;
     while( x == 1){
        System.out.println("Enter a balance: ");
        int balance = fetch.nextInt();
        
        System.out.println(" ");
         int deposite = fetch.nextInt();       
          
         int total = balance + deposite;
         int totalbalance = balance - deposite;
        
           if(deposite != -1){
        
              System.out.println("Balance is : " + total);
        
        
        }
     else   if(deposite <= 1){
         
             System.out.println( "Balance is : " + totalbalance);
     
         }
     }
         
          
         ///Number 2 
       
           System.out.println("Enter a telephone number : ");
          String letternumber = fetch.next();
           
          char letter = letternumber.charAt(8);
           
           if(letternumber.equals("438-5626")){
           
           
               System.out.println("GET-LOAN.");
           }
           else if(letternumber.equals("225-5466")){
           
           
               System.out.println(" CALL-HOME");
           }
          
        
   
    }
 
    
    }
    

