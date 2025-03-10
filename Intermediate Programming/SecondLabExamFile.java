
package secondlabexam;


public class SecondLabExamFile {
            int grade; 
            int letterA; 
           int letterB; 
           int letterC;
           int letterD; 
           int letterF;  
            SecondLabExamFile(int grade, int lettergradeA, int lettergradeB,int lettergradeC, int lettergradeD, int lettergradeF){ 
               
                
                
                this.letterA = letterA; 
                this.letterB = letterB; 
                this.letterC = letterC; 
                this.letterD = letterD; 
                this.letterF = letterF; 
                 this.grade = letterA + letterB + letterC + letterD + letterF; 
                        
              
            
            }  
            
            public void SetA(int letterA){ 
               
            this.letterA = letterA; 
            MakingAsterisk();
             }
            public void SetB(int letterB){ 
            this.letterB = letterB; 
            MakingAsterisk();
            }
            public void SetC(int letterC){
            this.letterC = letterC; 
            MakingAsterisk();
            
            }
            public void SetD(int letterD){
             this.letterD = letterD; 
             MakingAsterisk();
             }
            public void SetF(int letterF){ 
            
             this.letterF = letterF; 
             MakingAsterisk();
            
            }
            
            public int PercentA(){
             return Math.round(letterA * 100.0f / grade);
                     
            }
            
            public int PercentB(){
            
            return Math.round(letterB * 100.0f / grade);
            
            
            
            }
            public int PercentC(){
            
            return Math.round(letterC * 100.0f / grade);
            }
            public int PercentD(){
            
            return Math.round(letterD * 100.0f / grade);
            }
            public int PercentF(){
            
            return Math.round(letterF * 100.0f / grade);
            }
            public void MakingAsterisk(){ 
                System.out.println("0%                                        "); 
                 
                
              for(int i =  0 ; i < Math.round(letterA * 100.0f / grade); i++){ 
              
                  System.out.print("*");
               }
               for(int i =  0 ; i < Math.round(letterB * 100.0f / grade); i++){ 
              
                  System.out.print("*");
               }
                for(int i =  0 ; i < Math.round(letterC * 100.0f / grade); i++){ 
              
                  System.out.print("*");
               }
                 for(int i =  0 ; i < Math.round(letterD * 100.0f / grade); i++){ 
              
                  System.out.print("*");
               }
                  for(int i =  0 ; i < Math.round(letterF * 100.0f / grade); i++){ 
              
                  System.out.print("*");
               }
                  
             
            }
            public  void ReturningGradeLetter(char a, char b, char c , char d , char f){
            
            
                if(a == 'A'){
                 a++; 
                 
                 }
                else if(a == 'B'){
                 b++; 
                 
                 }
                else if(a == 'C'){
                 c++; 
                 
                 }
                else if(a == 'D'){
                 d++; 
                 
                 }
                else if(a == 'f'){
                 f++; 
                 
                 }
                
                for(int i = 0  ; i < a; i++){
                
                    System.out.println("*");
                 }
                for(int i = 0  ; i < b; i++){
                
                    System.out.println("*");
                 }
                for(int i = 0  ; i < c; i++){
                
                    System.out.println("*");
                 }
                for(int i = 0  ; i < d; i++){
                
                    System.out.println("*");
                 }
                for(int i = 0  ; i < f; i++){
                
                    System.out.println("*");
                 }
             }
            
            

}
