package edu.albany.cruise;

public class Ship {
	
	protected String name;
	protected String year;
	
	//Constructor 
	public Ship(String name, String year){
		this.name = name;
		this.year = year;
	}
	
	//Accessors and mutators
	public void setName(String name){
		this.name = name;
	}
	
	public void setYear(String year){
		this.year = year;
	}
	
	public String getName(){
		return name;
	}
	
	public String getYear(){
		return year;
	}
	
	@Override
	public String toString(){
		return name + " was built during the year " + year;
	}

}
