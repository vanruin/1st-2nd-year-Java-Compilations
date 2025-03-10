import java.util.*;
public  class  Mtehdos  {
	   static  Random rand = new Random();
	  int sides ; 
	  int desiredSides; 
	  int numberOfdice ; 
	   
	public  void SuperDie() { 
		this.sides = 6; 
	      this.rand = new Random();
		
		
	}
	public    void SuperDie(int desiredSides ) {
	
	this.desiredSides = desiredSides;  
	 
	}
	public int RollDie() { 
		 return rand.nextInt(desiredSides) + 1; 
	}
	public int Sides() {
		return desiredSides; 
	}
	public int RetrunSide(int desiredSides) { 
		 return desiredSides; 
	}
	public void SetSide(int desiredSides) {
		 this.desiredSides = desiredSides; 
	} 
	
	      

}

	       
	      
	

	
	


 