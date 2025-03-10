
package secondlabexam;

import java.util.Scanner; 
public class SecondLabExam {

   
    public static void main(String[] args) {
 Scanner fetch = new Scanner(System.in);
  String character;

        System.out.print(" Enter a character: ");
        character = fetch.next();
        
        int characterLetters = character.length(); 
       for ( int x = 0 ; x < characterLetters; x++){
                 char characs = character.charAt(x);
           
             if( characs == 'g'){
             
                 System.out.println(character +  " is  Good");
                 break;
                  
             }
             else if(characs == 'b' ){
                                  System.out.println(character +  " is a BADDY");
                                  break;
             }
             else{
                 System.out.println(character + " is a  Neutral");
                 break;
                 
             }
            
       }
        
         
       
         
    
 
  } 
    
}
