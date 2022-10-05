package car;

public class CarOne {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "Ford";
		car.model = "Focus";
		car.fuelCapacity = 100;
		car.fuelConsumption = 0.5 ;
		car.passengerQuantity = 5;
		
		//car.showAutonomy();
		System.out.println("Car autonomy: " + car.getAutonomy());
		
		System.out.println("car consumption is: " + car.calculateAutonomy(10) + " L/km");
	}
}
