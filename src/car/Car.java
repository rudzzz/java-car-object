package car;

public class Car {
	String brand;
	String model;
	int passengerQuantity;
	double fuelCapacity;
	double fuelConsumption;
	
	void showAutonomy() {
		double autonomy = fuelCapacity * fuelConsumption; 
		System.out.println("The car autonomy is: " + autonomy + " km/h");
	}
	
	double getAutonomy() {
		//System.out.println("Call on getAutonomy");
		return fuelCapacity * fuelConsumption;
	}
	
	double calculateAutonomy(double km) {
		double fuelQuantity = km / fuelConsumption;
		return fuelQuantity;
	}
}
