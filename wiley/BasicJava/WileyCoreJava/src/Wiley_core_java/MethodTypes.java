package Wiley_core_java;


class test{
	
	public static int add(int val1,int val2)
	{
		return val1+val2;
	}
}
public class MethodTypes {

	public static void multiple(int val1,int val2)
	{
		System.out.println("Multi is "+val1*val2);
	}
	
	public void sub(int val1,int val2)
	{
		System.out.println(val1-val2);
	}
	public void add(int val1,int val2)
	{
		System.out.println(val1+val2);
		
		sub(12,4);
	}
	public static void main(String[] args) {

		multiple(12,14);
		
		
		MethodTypes mt= new MethodTypes();
		
		mt.add(20, 220);
		
		System.out.println("From test class "+test.add(3, 2));
		
	}

}
