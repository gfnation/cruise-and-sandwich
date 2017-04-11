package edu.albany.sandwich;

public class SandwichDriver {

	public static void main(String[] args) {
		Cashier cashier = new Cashier("Shelly", "1995", 42);
		SandwichMaker maker = new SandwichMaker("Mark", "2012", 12);
		Customer cust = new Customer("Johnny", 14);
		
		//Show current stats
		printStat(cashier, maker, cust);
		
		System.out.println(cust.getName() + " comes in to order some food. " + maker.getName() + " makes the sandwich for " + cust.getName()+". "+ cashier.getName() + " then checks " + cust.getName() + " out.");

		cust.setVisits(cust.getVisits() + 1);
		maker.setNumSandwich(maker.getNumSandwich() +1);
		cashier.setOrders(cashier.getOrders()+1);
		
		printStat(cashier, maker, cust);
	}

	public static void printStat(Cashier cash, SandwichMaker m, Customer c){
		System.out.println(cash.toString() +"\n"+ m.toString() + "\n" + c.toString());
	}
}
