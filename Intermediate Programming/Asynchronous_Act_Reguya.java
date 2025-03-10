import java.util.Random;
import java.util.Scanner;

public class Asynchronous_Act_Reguya {
	
	//instance / global variable  
	static Random rand = new Random(); 

	public static void main(String[] args) {
		Mtehdos methods = new Mtehdos(); 
		Scanner fetch = new Scanner(System.in); 
		System.out.println("Number of Dies on the Side: " + methods.sides);  
		System.out.println("Set how many sides u want: "  );
		int desiredSides = fetch.nextInt(); 
		 methods.SetSide(desiredSides);
		  System.out.println("Number of the Sides on 8 rolled Dies : " +  methods.sides);
		   System.out.println("Random number of "+ desiredSides+  " sides: " + methods.RollDie());
		 
		 
		 //Number 2  //Calling all methods
		   SumOFAllDice();
		   SixSided();
		   twentySided(); 
		   Counter counter = new Counter();
		  
             //Number 3 
		    System.out.println("Enter a sequence of integers (enter 0 to stop):");
		    int num;
		    do {
		        num = fetch.nextInt();
		        if (num != 0) {
		            counter.increment();
		        }
		    } while (num != 0);

		    System.out.println("You entered " + counter.getValue() + " non-zero integers.");
	}     
	public static void SumOFAllDice() { 
		 int Dice1;
	     int Dice2; 
	     int Dice3;
	     int Dice4 ; 
	     int Dice5  ; 
	     int sum = 0 ; 
	     int result ;  
	     
	    
 
	      for(int i = 0 ; i < 100; i++) { 
	    	  Dice1 = rand.nextInt(6)+1; 
	    	  Dice2 = rand.nextInt(19) + 1; 
	    	  Dice3 = rand.nextInt(3) + 1 ; 
	    	  Dice4 = rand.nextInt(7) + 1 ; 
	    	  Dice5 = rand.nextInt(11) + 1 ;  
	    			   
	    	  sum += Dice1 + Dice2 + Dice3 + Dice4 + Dice5; 
	      } 
	      
	 


	}
	public static void SixSided() {  
		
		
		 int z = 0 ;
		 for(int i = 0 ;  i < 100; i++) {
			   z = rand.nextInt(5) + 1 ;  
			   
		 }
		 double average = (double) z / 100; 
	  System.out.println("Average: "  + average);
  	  
    }
	public static void twentySided() {
		 int z = 0 ;
		 for(int i = 0 ;  i < 100; i++) {
			   z = rand.nextInt(19) + 1 ;  
			   
		 }
		 double average = (double) z / 100; 
	  System.out.println("Average: "  + average);
	}
	
}
	
	 


