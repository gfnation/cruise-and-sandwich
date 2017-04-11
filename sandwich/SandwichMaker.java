package edu.albany.sandwich;

public class SandwichMaker extends Worker{

	private int numMadeSandwich;
	
	public SandwichMaker(String name, String yearStarted, int numMadeSandwich){
		super(name, yearStarted);
		this.numMadeSandwich = numMadeSandwich;
	}
	
	public int getNumSandwich(){
		return numMadeSandwich;
	}
	
	public void setNumSandwich(int numMadeSandwich){
		this.numMadeSandwich = numMadeSandwich;
	}
	
	@Override
	public String toString(){
		return super.toString() + " and has made " + numMadeSandwich + " sandwiches.";
	}
}
