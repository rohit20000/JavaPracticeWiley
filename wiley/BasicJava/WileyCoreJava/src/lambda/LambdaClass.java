package lambda;

public class LambdaClass {

	static String printThing(Printable thing) {
		return thing.print("Asrani");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product myProd = new Product();
//		myProd.print();
//		printThing(myProd);

//		
//		Printable lambdaExp= (s) -> {
//			System.out.println("this is a Lambda function " + s);
//		};
//		
		
//
//		Printable lambdaExp= (s,s2) -> {
//			System.out.println("this is a Lambda function " + s+" "+s2);
//		};
//		
//		lambdaExp.print("1","By2");
		
//		printThing(() -> {
//			System.out.println("this is a Lambda function");
//		});
		

		Printable lambdaExp= (s) -> {
//			System.out.println("this is a Lambda function " + s);
			return "Rohit asrani "+s;
		};
		
//		lambdaExp.print("1");
		System.out.println(printThing(lambdaExp));
		;
		
		
		
	}

}
