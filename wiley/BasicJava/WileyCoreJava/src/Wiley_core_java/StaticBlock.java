package Wiley_core_java;

public class StaticBlock {

	static 
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}
	
	{
		System.out.println("constructor block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb= new StaticBlock();
		
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
	}

}
