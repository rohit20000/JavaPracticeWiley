package lambda;

interface Sayable{

	void say();
	
}
public class MethodReferance {

	public static void saySomething()
	{
		System.out.println("Hello EveryOne static  method");
	}
	
	public static void processSomething()
	{
		System.out.println("processing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable sayable = MethodReferance::saySomething;
		sayable.say();
		
		//thread
		
		Thread t1 = new Thread(MethodReferance:: processSomething);
	t1.start();
	
	
	}

}
