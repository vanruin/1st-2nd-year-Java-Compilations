import java.util.Scanner;

public class Reguya_Asynchronous_Activity_2{
	
	 static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter score for student " + i + ": ");
            scores[i] = scanner.nextInt();
        }

        int bestScore = findBestScore(scores);

        for (int i = 0; i < numStudents; i++) {
            char grade = assignGrade(scores[i], bestScore);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }

    private static int findBestScore(int[] scores) {
        int bestScore = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > bestScore) {
                bestScore = score;
            }
        }
        return bestScore;
    }

    private static char assignGrade(int score, int bestScore) {
        if (score >= bestScore - 10) {
            return 'A';
        } else if (score >= bestScore - 20) {
            return 'B';
        } else if (score >= bestScore - 30) {
            return 'C';
        } else if (score >= bestScore - 40) {
            return 'D';
        } else {
            return 'F';
        }
        /// Number 2 : 
        
        int[] counts = new int[100];
        int input;
        do {
            System.out.print("Enter an integer between 1 and 100 (0 to end input): ");
            input = scanner.nextInt();
            if (input >= 1 && input <= 100) {
                counts[input - 1]++;
            }
        } while (input != 0);

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }
        
        //number 3 
        
        int[] numbers = new int[10];
        boolean[] isDistinct = new boolean[10];
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            isDistinct[i] = true;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] == numbers[j]) {
                    isDistinct[i] = false;
                }
            }
        }
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < 10; i++) {
            if (isDistinct[i]) {
                System.out.print(numbers[i] + " ");
            }
        }
        
        //Number 4: 
        
        System.out.print("Enter list1: ");
        int n1 = scanner.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            list1[i] = scanner.nextInt();
        }
        System.out.print("Enter list2: ");
        int n2 = scanner.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list2[i] = scanner.nextInt();
        }
        if (equal(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }
    }

    public static boolean equal(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
	

