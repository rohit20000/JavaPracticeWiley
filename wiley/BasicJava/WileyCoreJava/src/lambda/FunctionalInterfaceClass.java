package lambda;

@FunctionalInterface
interface Calc{
	int calculate(int val);
}
public class FunctionalInterfaceClass {
public static void main(String[] arts)
{
	Calc cl= (int val)-> val+54;
	
	System.out.println("Result : "+cl.calculate(54));
}
}
