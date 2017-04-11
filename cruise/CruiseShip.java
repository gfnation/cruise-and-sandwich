package edu.albany.cruise;

public class CruiseShip extends Ship{

	private int numPassenger;
	
	public CruiseShip(String name, String year, int numPassenger){
		super(name, year);
		this.numPassenger = numPassenger;
	}
	
	public void setNumPassenger(int numPassenger){
		this.numPassenger = numPassenger;
	}
	public int getNumPassenger(){
		return numPassenger;
	}
	
	@Override
	public String toString(){
		return "The ship " + super.getName() + " has a capacity of " + numPassenger;
	}
}
