package Wiley_core_java;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,2,3,4};


try {
	System.out.println(a[1]);
	System.out.println(a[3]);
	
	String s="Rohit";
	
	System.out.println(s.charAt(2));
	
	int r= 12/0;
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
	System.out.println(e.toString());
	e.printStackTrace();
	
}
catch(StringIndexOutOfBoundsException e)
{
	e.printStackTrace();
}
catch(Exception e)
{
	e.printStackTrace();
}


System.out.println("Done");
	}

}
