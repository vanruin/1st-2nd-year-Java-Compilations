/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstlabexam;

import java.util.Random;
public class FirstLabExam {

    
    public static void main(String[] args) {
      Random math = new Random();
        
       System.out.println("Dealing with cards...."); 
       int personNumber = math.nextInt(13)+1;
       int ComputerNumber = math.nextInt(13)+1; 
     
       
       
       if(personNumber > ComputerNumber){
          
       System.out.println("You win!"); 
       }
       else if(ComputerNumber > personNumber){
       
       
       System.out.println("Computer Wins!"); 
       }
       else if(ComputerNumber == personNumber){
       
       
       System.out.println("It's a tie!"); 
       }
       
      
        if(ComputerNumber == 1){
       
       System.out.println("The Computer got ace");
       }
        if(personNumber == 1){
       
       System.out.println("The person GOT ACE");
       
       }
        
       
        System.out.println("You got " + personNumber  );
       
       System.out.println("The Computer got " + ComputerNumber  );
      
    }
    
}
