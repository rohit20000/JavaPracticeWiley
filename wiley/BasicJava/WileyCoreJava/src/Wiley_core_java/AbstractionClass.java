package Wiley_core_java;

abstract class Test1{
	
	static {
		System.out.println("Test 1 static block");
	}
	{
		System.out.println("Test 1 instance block");
	}
	public Test1(){
		System.out.println("Test1 constructor");
	}
	public abstract void m1();
	
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	
	public static void main(String a[])
	{
		System.out.println("Main method from abstract class");
	}
}

class Test2 extends Test1{
		
	static{
		System.out.println("Test 2 static block");
	}
	{
		System.out.println("Test 2 instance block");
	}
	
	public Test2(){
		System.out.println("Test2 constructor");
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("Test2 m1 method");
		
	}
	
}
public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2= new Test2();
		Test2 t3= new Test2();
		
		t2.m1();
		t2.m2();
		
		t2.main(args);
	}

}
