
package hangmangame_reguya;


import java.util.Random;
import java.util.Scanner;

public class HangmanGame_Reguya {

   
    public static void main(String[] args) {
  
        String  secretWordsList[] =    {"zipper","cow","plane","ammend", "computer", "append","gas","car"};


       
        final int MAX_BAD_GUESSES = 7;  


        
        String secretWord;
     
        secretWord = "tea";

              
        char[] correctLetters = {};

        
        char[] incorrectLetters;

        
        int    badGuessesCount = 0;  
        Scanner stdin = new Scanner(System.in); 



      
        while (!gameWon (correctLetters) && badGuessesCount < MAX_BAD_GUESSES) {

            
            printHangman(badGuessesCount);

            
            System.out.print("\nWrong guesses: ");

            


            
            System.out.print("\n\n--> Enter a lowercase letter for your guess: ");
            char guess = stdin.nextLine().charAt(0);

           
            boolean found = false;  

      
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) { 
                    found = true;                    
                    correctLetters[i] = guess;       
                }
            }

            if (found) {
                System.out.println("*** Your guess was correct!");
            }
            else {
   	         	

                System.out.println("*** Sorry, that letter is not in the secret word");
            }
        }

       
        System.out.println("\n********************************************");
        System.out.println("The secret word was: " + secretWord);
        if (gameWon(correctLetters)) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Sorry, you lost.");
            printHangman(badGuessesCount);
        }
    }



    
    
    private static boolean gameWon(char[] correctLetters) {

       
        return false;
    }


    
    private static void printHangman(int GetGuessCount) {
        int poleLines = 6;  
        System.out.println("  ____");
        System.out.println("  |  |");

        if (GetGuessCount == 7) {
            System.out.println("  |  |");
            System.out.println("  |  |");
        }

        if (GetGuessCount > 0) {              
            System.out.println("  |  O");
            poleLines = 5;
        }
        
		if (GetGuessCount > 1) {
            poleLines = 4;
            if (GetGuessCount == 2) {
                System.out.println("  |  |");
            } else if (GetGuessCount == 3) {
                System.out.println("  | \\|");
            } else if (GetGuessCount >= 4) {
                System.out.println("  | \\|/");
            }
        }
        
		if (GetGuessCount > 4) {
            poleLines = 3;
			System.out.println("  |  |");
		}
        
		if (GetGuessCount == 6) {
		    poleLines = 2;
            System.out.println("  | /");
        } else if (GetGuessCount >= 7) {
		    poleLines = 0;
            System.out.println("  | / \\");
        }

        for (int k = 0; k < poleLines; k++) {
            System.out.println("  |");
        }
        System.out.println("__|__");
        System.out.println();
    
    
    
    
    }
    
}
