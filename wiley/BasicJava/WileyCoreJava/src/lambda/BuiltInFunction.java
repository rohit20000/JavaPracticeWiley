package lambda;

import java.util.*;
import java.util.function.Function;

public class BuiltInFunction {

	// to store emp imformation

	private static HashMap<Integer, String> Employee = new HashMap<Integer, String>();

	public static void add(String name, int ID) {
		if (!Employee.containsKey(ID))
			Employee.put(ID, name);
		else
			System.out.println("Employee already exist");

	}

	public static void main(String ar[]) {
		Function<Integer, String> get = (Integer ID) -> {
			if (Employee.containsKey(ID))
				return Employee.get(ID);
			else
				return "Invalid ID";
		};
		
		//add employee
		
		add("Rohit",1);
		add("Sneha",2);
		add("filza",3);
		add("faizan",4);
		add("Sourav",5);
		
		System.out.println(get.apply(8));
	}
}
