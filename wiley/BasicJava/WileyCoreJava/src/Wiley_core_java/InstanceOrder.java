package Wiley_core_java;

public class InstanceOrder {
	
	
	int age;
	String name;
	
	
	

	{
		name="rohi	t";
		age=22;
		System.out.println("Inside the instance block");
		
	}
	
	
	public InstanceOrder()
	{
		System.out.println("Age is "+age+" Name is "+name);
		
		System.out.println("Inside the 0 parameter construtor");
		
		
	}
	public InstanceOrder (int a,int b)
	{
		System.out.println("Inside the 2 parameter construtor");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceOrder io= new InstanceOrder ();
		
		new InstanceOrder(2,3);

	}

}
