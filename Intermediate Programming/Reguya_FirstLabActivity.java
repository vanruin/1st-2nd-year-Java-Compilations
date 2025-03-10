package reguya_firstlabactivity;

import java.util.Scanner;


public class Reguya_FirstLabActivity {

  
    public static void main(String[] args) {
         Scanner fetch = new Scanner(System.in);
                
        int cand0 = 0; 
          int cand1 = 0; 
         int cand2 = 0; 
         int cand3 = 0; 
         int cand4 = 0; 
         int cand5 = 0; 
        int cand6 = 0; 
        int cand7 = 0; 
       int cand8 = 0; 
      int cand9 = 0; 
        System.out.println("Enter a votes : ");
       long  votes = fetch.nextLong();
         String votes1 = Long.toString(votes);
      for(int i = 0 ; i < votes1.length(); i++){
      
           char z = votes1.charAt(i);
          
                if(z == '0'){
                cand0++;
                }
                else if(z == '1'){
             cand1++; 
             } 
             else  if(z == '2'){
             cand2++; 
             } 
             else if(z == '3'){
             cand3++; 
             }
             else if(z == '4'){
             
             cand4++;
             }
             else if(z == '5'){
             cand5++;
             }
             else if(z == '6'){
              cand6++;
             }
             else if(z == '7'){
             cand7++;
             }
             else if(z == '8'){
             cand8++;
             }
             else if(z == '9'){
             cand9++; 
             
             }
             
      }
      if(cand0 > cand1 || cand0 > cand2 || cand0 > cand3 || cand0 > cand4 || cand0 > cand5 || cand0 > cand6 || cand0 > cand7 || cand0 > cand8 || cand0 > cand9 ){
          System.out.println("Candidate Number 0 won!");
          System.out.println("Votes : " + cand0);
           
      }
      else if(cand1 > cand0 || cand1 > cand2 || cand1 > cand3 || cand1 > cand4 || cand1 > cand5 || cand1 > cand6 || cand1 > cand7 || cand1 > cand8 || cand1 > cand9 ){
          System.out.println("Candidate Number 1 won!");
           System.out.println("Votes : " + cand1);
      }
      else if(cand2 > cand3 || cand2 > cand4 || cand2 > cand5 || cand2 > cand6 || cand2 > cand7 || cand2 > cand8 || cand2 > cand9 || cand2 > cand0 || cand2 > cand1){
          System.out.println("Candidate Number 2 won!");
         System.out.println("Votes : " + cand2);
      }
      else if(cand3 > cand4 || cand3 > cand5 || cand3 > cand6 || cand3 > cand7 || cand3 > cand8 || cand3 > cand9 || cand3 > cand0 || cand3 > cand1 || cand3 > cand2){
          System.out.println("Candidate Number 3 won!");
          System.out.println("Votes : " + cand3);
      }
      else if(cand4 > cand5 || cand4 > cand6 || cand4 > cand7 || cand4 > cand8 || cand4 > cand9 || cand4 > cand0 || cand4 > cand1 || cand4 > cand2 || cand4 > cand3){
          System.out.println("Candidate Number 4 won!");
          System.out.println("Votes : " + cand4);
      }
      else if(cand5 > cand4 || cand5 > cand6 || cand5 > cand8 || cand5 > cand7 || cand5 > cand9 || cand5 > cand0 || cand5 > cand1 || cand5 > cand2 || cand5 > cand3){
          System.out.println("Candidate Number 5 won!");  
          System.out.println("Votes : " + cand5);
      }
      else if(cand6 > cand4 || cand6 > cand5 || cand6 > cand6 || cand6 > cand7 || cand6 > cand8 || cand6 > cand9 || cand6 > cand0 || cand6 > cand1 || cand6 > cand2){
          System.out.println("Candidate Number 6 won!");  
          System.out.println("Votes : " + cand6);
      }
      else if(cand7 > cand7 || cand7 > cand5 || cand7 > cand6 || cand7 > cand4 || cand7 > cand7 || cand7 > cand9 || cand7 > cand0 || cand7 > cand1 || cand7 > cand2){
          System.out.println("Candidate Number 7 won!");
          System.out.println("Votes : " + cand7);
      }
      else if(cand8 > cand8 || cand8 > cand5 || cand8 > cand6 || cand8 > cand7 || cand8 > cand7 || cand8 > cand9 || cand8 > cand0 || cand8 > cand1 || cand8 > cand2){
          System.out.println("Candidate Number 8 won!");  
          System.out.println("Votes : " + cand8);
      }
      else if(cand9 > cand4 || cand9 > cand5 || cand9 > cand6 || cand9 > cand7 || cand9 > cand8 || cand9 > cand8 || cand9> cand0 || cand9 > cand1 || cand9 > cand2){
          System.out.println("Candidate Number 9 won!");  
          System.out.println("Votes : " + cand9);
      }
    }
    
}
