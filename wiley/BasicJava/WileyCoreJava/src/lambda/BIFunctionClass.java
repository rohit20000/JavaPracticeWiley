package lambda;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BIFunctionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> n= a -> a ^ 1;

		System.out.println(n.apply(6));
		
		BinaryOperator<Integer> n1 = (a,b) -> a & b;

		System.out.println(n1.apply(18,6));
	}

}
