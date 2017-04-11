package edu.albany.sandwich;

public class Customer extends Person{

	private int numVisits;
	public Customer(String name, int numVisits){
		super(name);
		this.numVisits = numVisits;
	}
	
	public int getVisits(){
		return numVisits;
	}
	public void setVisits(int numVisits){
		this.numVisits = numVisits;
	}
	
	@Override
	public String toString(){
		return super.toString() + " and has visited " + numVisits + " times.";
	}
}
