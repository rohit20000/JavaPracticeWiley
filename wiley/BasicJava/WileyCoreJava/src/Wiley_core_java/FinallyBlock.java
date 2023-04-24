package Wiley_core_java;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Rohit");
			
			System.out.println("112");
			
//			System.out.println(10/0);
			
		}
		catch(Exception e) {
//			System.exit(0);
//			System.out.println(10/0);
			e.printStackTrace();
		}
		finally {
			System.out.println("Done");
		}

	}

}
