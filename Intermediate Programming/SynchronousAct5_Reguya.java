/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronousact5_reguya;

import java.util.Scanner;

/**
 *
 * @author 137981
 */
public class SynchronousAct5_Reguya {
        static char average;
    static int[] arry = new int[5];
      static int sum = 0 ;
      static String Username;
       
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in); 
        
        System.out.println("Enter name: ");
        Username = fetch.nextLine();
          
        double convertion;
        System.out.println("Enter grade : ");
         
        
         
    
         for(int i = 0 ; i < 5; i++){
         
             arry[i] = fetch.nextInt();
             
          }
         for(int j = 0 ; j < 5; j++ ){
         
              convertion = arry[j];
             System.out.println(convertion); 
             
             
             
             
         }
         CalculateGrade();
         OverALL();
         
        }
        
        
        
    
 public static void CalculateGrade(){
          
         
         for(int i = 0 ; i < 5 ; i++){
          
             sum += arry[i] / 5;
             
         
          }
         System.out.println(sum);
            
     } 
  public static void ReturningAverageScore(){
  
  
         if(sum <=90){
             
             average = 'A';
             
         
         }
         else if( sum <= 80){
            average = 'B';
          
          } 
         else if(sum <= 70){
         average = 'C'; 
           
          }
         else if(sum <= 60){
         
          average = 'D';
          
         }
         else{
         
         average = 'F';  
         }

    
      
    
       
               
   
  
 
     
    
    
  }
  public static void OverALL(){
  
      System.out.println("First_Name Last_Name Test1 Test2 Test3 Test4 Test5 Average Grade ");
      System.out.println(Username + " " + sum + " " +average);
      
  }
}
     
    

            
            
            
    
            

            
            
