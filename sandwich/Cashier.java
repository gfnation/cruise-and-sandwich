package edu.albany.sandwich;

public class Cashier extends Worker{

	private int ordersTaken;
	
	public Cashier(String name, String yearStarted, int ordersTaken){
		super(name, yearStarted);
		this.ordersTaken = ordersTaken;
	}
	
	public int getOrders(){
		return ordersTaken;
	}
	
	public void setOrders(int ordersTaken){
		this.ordersTaken = ordersTaken;
	}
	
	@Override
	public String toString(){
		return super.toString() + " and has taken " + ordersTaken + " orders";
	}
}
