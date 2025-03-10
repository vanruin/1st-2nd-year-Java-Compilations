/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.Scanner;


/**
 *
 * @author 137981
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



   

	    Scanner in=new Scanner(System.in);
		System.out.println("Choose type of service:\n1. Regular\n2. Premium");
		int c=in.nextInt();
		
		double regular_price=10;
		double premium_price=25;
		if(c==1){
		    int minutes;
		    System.out.println("Enter number of minutes:");
		    minutes=in.nextInt();
		    int min;
		    if (minutes>50){
		        min=minutes-50;
		        regular_price=regular_price+(min*0.20);
		    }
		    System.out.println("Bill: "+regular_price);
		}
		else if (c==2) {
		   System.out.println("Choose type of call:\n1. Calls made from 6:00 a.m. to 6:00 p.m.\n2. Calls made from 6:00 p.m. to 6:00 a.m.");
		   int c2=in.nextInt();
		   
		   int minutes;
		   int min;
		   System.out.println("Enter number of minutes:");
		   minutes=in.nextInt();
		   if (c2==1){
		       
		       if (minutes>75){
		        min=minutes-75;
		        premium_price=premium_price+(min*0.10);
		    }
		   }
		   else if (c2==2){
		       if (minutes>100){
		        min=minutes-100;
		        premium_price=premium_price+(min*0.05);
		    }
		   } 
		   System.out.println("Bill: "+premium_price);
		}
		
	}
}
	

    


