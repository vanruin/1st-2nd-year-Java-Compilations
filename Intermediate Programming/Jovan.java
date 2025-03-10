/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jovan;
import java.util.Random;
import java.util.Scanner;

public class Jovan {

    private static char[][] seats; 

    public static void main(String[] args) {
        initializeSeats(); 
        printSeats(); 

        Scanner input = new Scanner(System.in);
        String ticketType;
        int row, col;

        do {
            System.out.print("Enter your ticket type (first class, business class, or economy class): ");
            ticketType = input.nextLine().toLowerCase();

            if (ticketType.equals("first class")) {
                System.out.print("Enter your desired seat (Row 1 or 2, Seat A, B, C, D, E, or F): ");
            } else if (ticketType.equals("business class")) {
                System.out.print("Enter your desired seat (Rows 3 to 7, Seat A, B, C, D, E, or F): ");
            } else if (ticketType.equals("economy class")) {
                System.out.print("Enter your desired seat (Rows 8 to 13, Seat A, B, C, D, E, or F): ");
            } else {
                System.out.println("Invalid ticket type, please try again.");
                continue;
            }

            String[] seat = input.nextLine().toUpperCase().split(" ");
            row = Integer.parseInt(seat[0]) - 1; // subtract 1 to convert to array index
            col = seat[1].charAt(0) - 'A'; // convert A, B, C, etc. to array index

            if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
                System.out.println("Invalid seat, please try again.");
                continue;
            }

            if (seats[row][col] == 'X') {
                System.out.println("Seat is already taken, please choose another one.");
                continue;
            }

            seats[row][col] = 'X'; 
            printSeats(); 

            System.out.print("Do you want to book another seat? (yes/no): ");
        } while (input.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Thank you for choosing our airline. Have a nice flight!");
    }

    
    private static void initializeSeats() {
        seats = new char[13][6];
        Random random = new Random();

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                seats[i][j] = random.nextBoolean() ? 'X' : '*';
            }
        }
    }

    private static void printSeats() {
        System.out.println("        A   B   C   D   E   F");
        for (int i = 0; i < seats.length; i++) {
            System.out.printf("Row %2d", i + 1);
            for (int j = 0; j < seats[0].length; j++) {
                System.out.printf(" %2c ", seats[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}

   