package Exception;

public class ThrowsClass {

	
	public static void m1() throws InterruptedException{
		try {
			m2();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void m2() throws InterruptedException{
		Thread t = new Thread();
		t.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
m1();
	}

}
