
package activity3_reguya;


import java.util.Scanner; 
import java.util.Random; 
public class Activity3_Reguya {


    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        Random random = new Random(); 
        
        int num ; 
        
        System.out.println("Enter an item number: "); 
        num = fetch.nextInt(); 
        System.out.println("sum of money: ");
        double amount = fetch.nextDouble(); 
        
        double num1,num2,num3,num4,num5,num6; 
        
        num1 = 1.25; 
        num2 = .75; 
        num3 = .90; 
        num4 = .75; 
        num5 = 1.50;
        num6 = .75 ; 
        
        if(num == 1){
        
      if(amount > num1){
      
      System.out.println("Thankyou for buying item " + num1 + "Your change is: " + (amount-num1));
      
      }
    
        }
        else if( amount < num1){
        
        System.out.println("Please insert another" + num1); 
        }
         if(num == 2){
        
      if(amount > num2){
      
      System.out.println("Thankyou for buying item " + num2 + "Your change is: " + (amount-num2));
      
      }
    
        }  else{
        
        System.out.println("Please insert another" + num2); 
        }
     if(num == 3){
        
      if(amount >= num3){
      
      System.out.println("Thankyou for buying item " + num3 + "Your change is: " + (amount-num3));
      
      }
    
        }
     else if (amount < num3){
        
        System.out.println("Please insert another" + num3); 
        }
         if(num ==4){
        
      if(amount >= num4){
      
      System.out.println("Thankyou for buying item " + num4 + "Your change is: " + (amount-num4));
      
      }
    
        }
         else if ( amount < num4){
        
        System.out.println("Please insert another" + num4); 
        }
        
       if(num ==5){
        
      if(amount > num5){
      
      System.out.println("Thankyou for buying item " + num5 + "Your change is: " + (amount-num5));
      
      }
    
        }
       else if(amount < num5){
        
        System.out.println("Please insert another" + num5); 
        }
         if(num == 6){
        
      if(amount > num6){
      
      System.out.println("Thankyou for buying item " + num6 + "Your change is: " + (amount-num6));
      
      }
    
        }
         else if(amount < num6){
        
        System.out.println("Please insert another" + num6); 
        }
        
       
        
        //////////////////////////
        
        double a = Math.random * 101; 
        int x = (int) a % 11; 
        System.out.println("enter a number: "); 
        int type = fetch.nextInt(); 
        
        
            

        switch (x){
             
            case 1: 
            System.out.println("You win 1"); 
            break;
            case 2: 
            System.out.println("You win 2"); 
            break;
            case 3: 
            System.out.println("You win 3"); 
            break;
            case 4: 
            System.out.println("You win 4"); 
            break;
            case 5: 
            System.out.println("You win 5"); 
            break;
            case 6: 
            System.out.println("You win 6"); 
            break;
            case 7: 
            System.out.println("You win 7"); 
            break;
            case 8: 
            System.out.println("You win 8"); 
            break;
            case 9: 
            System.out.println("You win 9"); 
            break;
            case 10: 
            System.out.println("You win 10"); 
            break;
            case 11: 
            System.out.println("You win 11"); 
            break;
        }
        
        }
}

    

