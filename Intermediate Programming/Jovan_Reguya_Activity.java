
package jovan_reguya_activity;

import java.util.Scanner;


public class Jovan_Reguya_Activity {

    
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);   
        int num = 20; 
           
           char[] answers = new char[20]; 
           
           answers[0] = 'T'; 
             answers[1] = 'F'; 
               answers[2] = 'F'; 
                 answers[3] = 'T'; 
                   answers[4] = 'F'; 
                     answers[5] = 'F'; 
                       answers[6] = 'T'; 
                         answers[7] = 'T'; 
                           answers[8] = 'T'; 
                             answers[9] = 'T'; 
             answers[10] = 'F'; 
             answers[11] = 'F'; 
               answers[12] = 'T'; 
                 answers[13] = 'F'; 
                   answers[14] = 'T'; 
                     answers[15] = 'F'; 
                       answers[16] = 'T'; 
                         answers[17] = 'F'; 
                           answers[18] = 'T'; 
                             answers[19] = 'T'; 
                             int score = 0;
                             System.out.println("Enter a student's id: ");
                             String studentId = fetch.nextLine();
                            
                             System.out.println("Enter students answer: ");
                             String studentAns = fetch.nextLine();
                             for(int i = 0 ; i <answers.length; i++ ){
                             
                                char z = studentAns.charAt(i); 
                                 if(z ==  answers[0]){
                                    score++;
                                  }
                                 else if(z ==  answers[1]){
                             answers[1]++; 
                             
                             
                             }
                                 else if(z ==  answers[2]){
                                 score++; 
                                 
                                 }
                                 else if(z ==  answers[3]){
                                     score ++;
                                 }
                                 else if(z ==  answers[4]){
                                     score ++;
                                 }
                                 else if(z ==  answers[5]){
                                     score ++;
                                 }
                                 else if(z ==  answers[6]){
                                     score ++;
                                 }
                                 else if(z ==  answers[7]){
                                     score ++;
                                 }
                                 else if(z ==  answers[8]){
                                     score ++;
                                     
                                 }
                                 else if(z ==  answers[9]){
                                     score++;
                                 }
                                 else if(z ==  answers[10]){
                                     score ++;
                                 }
                                 else if(z ==  answers[11]){
                                     score ++;;
                                 }
                                 else if(z ==  answers[12]){
                                     score ++;
                                 }
                                 else if(z ==  answers[13]){
                                     score++;
                                 }
                                 else if(z ==  answers[14]){
                                     score ++;
                                 }
                                 else if(z ==  answers[15]){
                                     score ++;
                                 }
                                 else if(z ==  answers[16]){
                                     score ++;
                                 }
                                 else if(z ==  answers[17]){
                                     score ++;
                                 }
                                 else if(z ==  answers[18]){
                                     score ++;
                                 }
                                 else if(z ==  answers[19]){
                                     score ++;
                                 }
                                 else if(z ==  answers[20]){
                                     score ++;
                                 }
                                 else if(z == ' '){
                                 score--;
                                 }
                                 else{
                                 score--;
                                 }
                                 }
                                 
                                     double total = 100.0*score ;
                                     char grade;
      
               if (total >= 90) {
                grade = 'A';
            } else if (total >= 80) {
                grade = 'B';
            } else if (total >= 70) {
                grade = 'C';
            } else if (total >= 60) {
                grade = 'E';
            } else {
                grade = 'F';
            }                
     
                              
                         System.out.print("Student id: " + studentId);            
                               System.out.println("Student Answers: " + studentAns);  
                               System.out.println("Student score: "  + score);
                               System.out.println("Student grade : " + grade );
                               
                             
                            
                             
                             
                             
                            
    }
    
     
    
}
