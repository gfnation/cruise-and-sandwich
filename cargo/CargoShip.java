package edu.albany.cargo;

import edu.albany.cruise.Ship;

public class CargoShip extends Ship{

	private int tonnage;
	
	public CargoShip(String name, String year, int tonnage){
		super(name, year);
		this.tonnage = tonnage;
	}
	
	public int getTonnage(){
		return tonnage;
	}
	
	public void setTonnage(int tonnage){
		this.tonnage = tonnage;
	}
	
	@Override
	public String toString(){
		return ("The ship " + super.getName() + " has a cargo capacity of " + tonnage + ".");
	}
}
