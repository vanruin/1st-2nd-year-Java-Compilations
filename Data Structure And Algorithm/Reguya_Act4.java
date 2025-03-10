/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reguya_act4;

/**
 *
 * @author 137981
 */
import java.util.Scanner; 
import java.util.Random;
public class Reguya_Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner fetch = new Scanner(System.in); 
        System.out.println("Enter a temperature: "); 
        int x = fetch.nextInt(); 
        System.out.println("Input f or F for Fahrenheit and c or C for Celsius: "); 
        String y = fetch.next();
        
      double fahrenheit = (x-32) * 5556;
       double celcius; 
       celcius = (x*9/5) + 32;
       
        if(y.equals("f")){
            
          System.out.println(fahrenheit); 
        }
        else if(y.equals("F")){
        System.out.println(fahrenheit);
        }
        else if (y.equals("c")){
            System.out.println(celcius);
            
            
        }
        else if(y.equals("C")){
        System.out.println(celcius);
        }
        
        
     int num1 = random.nextInt(10)+1;
        
     int num2 = random.nextInt(10)+1; 
     
        int formula = num1 + num2; 
        
        System.out.println("The result of dice roll " + num1 + " and " + num2 + " is " + (num1 + num2));
         if(formula == 2){
        System.out.println("You Win!");
        }
        else if(formula == 3){
        
        
        System.out.println("You win");
        }
        else if (formula == 12){
        System.out.println("Start over"); 
        }
        else if(formula == 4){
        
        System.out.println("Continue rolling....."); 
        
        }
        else if (formula == 12){
        
        System.out.println("Its a tie!"); 
        }
        else if(formula == 5){
        
        System.out.println("Continue rolling....."); 
        
        }
         else if(formula == 6){
        
        System.out.println("Continue rolling....."); 
        
        }
         else if(formula == 7){
        
        System.out.println("Continue rolling....."); 
        
        }
         else if(formula == 8){
        
        System.out.println("Continue rolling....."); 
        
        }
         else if(formula == 9){
        
        System.out.println("Continue rolling....."); 
        
        }
         else if(formula == 10){
        
        System.out.println("Continue rolling....."); 
        
        }
    }
   
    
}
