package Wiley_core_java;

public class ConstructorType {

	public ConstructorType ()
	{
		System.out.println("0 parameter constructor");
	}
	public ConstructorType (int a,int b)
	{
		this(2,3,4);
		System.out.println("2 parameter constructor");
	}
	public ConstructorType (int a ,int b,int c)
	{
		System.out.println("3 parameter constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorType ct1= new ConstructorType();

		ConstructorType ct2= new ConstructorType(2,3);

		ConstructorType ct3= new ConstructorType(1,2,3);
	}

}
