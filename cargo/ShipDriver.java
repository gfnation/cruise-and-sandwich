package edu.albany.cargo;

import edu.albany.cruise.CruiseShip;
import edu.albany.cruise.Ship;

public class ShipDriver {

	public static void main(String[] args) {
		Ship ships[] = new Ship[3];
		
		ships[0] = new Ship("Regular Ship", "1987");
		
		ships[1] = new CruiseShip("Cruise" , "2010", 4003);
		
		ships[2] = new CargoShip("Cargo", "1972", 3);
		
		System.out.println(ships[0].toString());
		System.out.println(ships[1].toString());
		System.out.println(ships[2].toString());
	}

}
