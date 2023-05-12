package Collections;

import java.util.HashMap;

public class HashMapClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hs= new HashMap<String,Integer>();
		
		hs.put("Rohit",1);

		hs.put("Raj",1);
		hs.put("sneha",1);
		hs.put("faizan",1);
		hs.put("faizan",2);
		System.out.println(hs);
		
		System.out.println(hs.containsKey("Raj"));
		System.out.println(hs.get("Rohit"));
		
		hs.putIfAbsent("Rohita", 5);
		
		hs.remove("Sneha");
		
		System.out.println(hs);
	}

}
