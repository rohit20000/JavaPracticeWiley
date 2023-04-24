package Wiley_core_java;

abstract class Vehicle {
	protected String color;
	protected int speed;
	protected int numWheels;
	
	public Vehicle(String color,int speed,int numWheels) {
		
	}
	
	public abstract void move();
}

class Car extends Vehicle{

	public Car(String color, int speed, int numWheels) {
		super(color, speed, numWheels);
		// TODO Auto-generated constructor stub
		this.color=color;
		this.speed=speed;
		this.numWheels=numWheels;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public void turn() {
		System.out.println("Car is turning");
	}
	
}
public class CarAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
