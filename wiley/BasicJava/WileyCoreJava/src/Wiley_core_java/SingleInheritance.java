package Wiley_core_java;


class Animal{
	public void eat() {
	System.out.println("Eat");
	}
	public void sleep()
	{
	System.out.println("Sleep");
	}
	}

class Lion extends Animal{
public class SingleInheritance extends Lion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion lion = new Lion();
		
		lion.roar();
		lion.sleep();
		lion.eat();

	}

}
