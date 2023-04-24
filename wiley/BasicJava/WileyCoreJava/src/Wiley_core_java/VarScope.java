package Wiley_core_java;

public class VarScope {

	int inVar = 10;
	int val= 12;
	int val1= 18;
	
	public void sum()
	{
		
		int val=122;
		int val1= 123;
		System.out.println( "sum is "+(this.val+this.val1));
	}
     static	int  staticVar= 30;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=133;
		int val1 =13;
		int locVar = 20;
		
		System.out.println("Local vari is " +locVar);
		
		VarScope vs= new VarScope();
		
		vs.sum();

		
		System.out.println("Ins var. is "+ vs.inVar);

		System.out.println("Static var. is "+ staticVar);
	}

}
