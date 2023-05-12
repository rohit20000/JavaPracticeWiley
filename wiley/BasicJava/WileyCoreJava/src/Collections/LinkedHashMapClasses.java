package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedHashMap<>
		Map lmap= new LinkedHashMap();
		lmap.put(1, 1);
		lmap.put("#", 1);
		lmap.put(null, 1);
		lmap.put(4, 1);
		
		System.out.println(lmap);
	}

}
