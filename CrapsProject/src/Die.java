//Rishav Mitra
//10-4-17
//This is the object class of my Craps Project. A random number 1-6 is created which represents the value of the die.

import java.util.Random;
public class Die {
	private int value;
	Random rng;

	public Die() {
		rng=new Random();
		roll();
	}
	public void roll(){
		value=rng.nextInt(6)+1;	
	}
	public int getNumDots(){
		return value;
	}
}
