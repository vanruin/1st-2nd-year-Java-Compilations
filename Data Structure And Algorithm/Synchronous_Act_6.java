package synchronous_act_6;

import java.util.Scanner;

public class Synchronous_Act_6 {
//wala nahuman sir
    public static void main(String[] args) {
        Myfunctions functions = new Myfunctions();
        Scanner fetch = new Scanner(System.in);
     
           
       String ids[] = {"1234","12341"}; 
        
     
        System.out.println("Enter id: ");
        String id = fetch.nextLine();
                for(String m : ids){ 
                 if(id == m){ 
                   
                     System.out.println("Enter what you want to do: ");
                     String todo = fetch.nextLine(); 
                     
                     if(todo == "Withdraw"){
                     
                     
                     }
                     
                   
                  }
                 else{
                 
                     System.out.println("You don't have an id account in our system yet, please create one: ");
                     
                     
                     for(int i = 0 ; i < ids.length; i++){
                      ids[i] = fetch.nextLine();
                     
                       
                     }
                 }
                
                 }
     
    }

}
