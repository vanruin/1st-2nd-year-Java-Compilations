import java.util.Random;
import java.util.Scanner;

public class Reguya_Assignment {
	 static int[][] HoursOfWork = new int[8][7]; 
	static  int[] Calculation = new int[8];
	static int hours; 
	static String name; 
	  static String[] Employees = new String[8]; 
	public static void main(String[] args) {
		Scanner fetch = new Scanner(System.in); 
		Random rand = new Random();
		
		
		
		
		  for(int j = 0 ; j < Employees.length; j++) {
			  System.out.println("Enter the name of the employee" + " E" + (j + 1) + ": ");
			  Employees[j] = fetch.nextLine(); 
		  } 
		
		
		
		
		
		for(int i = 0; i < 8; i++) {
			System.out.println("Enter hours for " + Employees[i] + ": ");
			 for(int j = 0 ; j < 7 ; j++ ) {
				 
				 HoursOfWork[i][j] = fetch.nextInt(); 
				
			 }
		}
		
		//Meth0ds
		
		
		TotalOfEmployeesHours();
		Calculations();
		TotalHoursinDecreasingOrder();
		Display();
		
		 //RollDie
		int rolls = 1000;
        int[][] rollsArray = new int[rolls][2];
        int[] sumsArray = new int[13];

        for (int i = 0; i < rolls; i++) {
            int die1 = (int)(Math.random() * 6) + 1;
            int die2 = (int)(Math.random() * 6) + 1;
            int sum = die1 + die2;
            rollsArray[i][0] = die1;
            rollsArray[i][1] = die2;
            sumsArray[sum]++;
        }

        System.out.println("Pair of numbers rolled by the dice:");
        for (int i = 0; i < rolls; i++) {
            System.out.println(rollsArray[i][0] + " " + rollsArray[i][1]);
        }

        System.out.println("\nSum of each pair of dice rolls:");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%d: ", i);
            for (int j = 0; j < sumsArray[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nNumber of times each sum is rolled:");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%d: %d\n", i, sumsArray[i]);
        }

        System.out.println("\nSums that are rolled the maximum number of times:");
        int maxCount = 0;
        for (int i = 2; i <= 12; i++) {
            if (sumsArray[i] > maxCount) {
                maxCount = sumsArray[i];
            }
        }

        for (int i = 2; i <= 12; i++) {
            if (sumsArray[i] == maxCount) {
                System.out.printf("%d ", i);
            }
        
		
		
		

	}
	
	public static void TotalOfEmployeesHours() {
		 for(int i = 0; i < 8 ; i++) {
			  for(int k = 0 ; k < 7; k++) {
				   
			  }
		 }
		 
	}
	public static void Calculations() {
	
		
		for(int i = 0 ; i < Calculation.length; i++) {
			 for(int j = 0 ; j < 7; j++) {
				 Calculation[i] += HoursOfWork[i][j]; 
			 }
		}
		
		
	}
	public static void TotalHoursinDecreasingOrder() {
		 for(int i = 0 ; i < 8; i++) {
			  for(int j = 0 ; j < 7; j++) {
				   if(Calculation[i] < Calculation[j]) {
					   hours = Calculation[i]; 
					   Calculation[i] = Calculation[j];
					   Calculation[j] = hours;
					    
					   name = Employees[i]; 
					   Employees[i] = Employees[j]; 
					   Employees[j] = name;
					   
					   
				   }
			  }
		 }
	}
	static void Display() {
		 for(int i = 0; i < 8 ; i ++) {
			 System.out.println( Employees[i] + "\t" +  Calculation[i]);
		 }
	}
	

}
