package packconstructor;

abstract class Vehicle{
	abstract void drive();
	void applybreak() {
		System.out.println("Applying Break.");
	}
}
class Car extends Vehicle {
	void drive() {
		System.out.println("Driving Car");
	}
	void changeGear() {
		System.out.println("Changing Gear");
	}
}




public class abstractdemo {
	public static void main(String[] args) {
		// Vehicle v= new Vehicle
		Vehicle v = new Car();
				v.drive();
				v.applybreak();
				//v.changegear(): error because base class objects can invoke only overridden methods or its own methods.
				Car c = new Car();
						c.changeGear();
	}
}
