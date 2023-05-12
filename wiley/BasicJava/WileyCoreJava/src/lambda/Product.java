package lambda;

public class Product implements Printable {

	public String name;
	public int pid;
	
	
	@Override
	public String print(String s) {
		
		System.out.println("this is a product that implements printable interface");
		return s;
	
	}
	
}
