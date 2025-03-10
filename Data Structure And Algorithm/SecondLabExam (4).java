
package secondlabexam;

import java.util.Scanner;


public class SecondLabExam {

    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in); 
            
      SecondLabExamFile prog = new SecondLabExamFile(0,0,0,0,0,0);
           
           System.out.println("Enter grade: ");
            
           int a   = 0;
            int b = 0; 
             int c = 0;
            int d = 0;
             int f = 0;
            
            int A[] = new int[5]; 
            int sum = 0 ; 
            int x = 0; 
            for(int i = 0 ; i <A.length ; i++){
             
                 A[i] = fetch.nextInt(); 
                 
                x = A[i];
                 sum += A[i]; 
                     
            
            }   
             System.out.println("enter letter grade: ");
            ; 
             
               for(int i = 0 ; i < 5; i++){ 
               
                char z = fetch.next().charAt(0); 
                 
                 prog.ReturningGradeLetter(z, z, z, z, z);
                 
                }
            
             
            SecondLabExamFile p1 = new SecondLabExamFile(sum,x,x,x,x,x); 
            
             p1.MakingAsterisk();
            
            
              
             
            
           
             
            
            
            
            
            
             
         
    }
    
}
