package Collections;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tmap= new TreeMap<Integer,String>();
	
		tmap.put(1000,"Rohit");
		tmap.put(100,"Faizan");
		tmap.put(500,"Sourav");
		tmap.put(200,"sneha");
		tmap.put(2000,"Filza");
		
		System.out.println(tmap);
		
		tmap.forEach((k,v)->System.out.println("Key : "+k +" val: "+v) );
		System.out.println(tmap.firstEntry());
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());
		System.out.println(tmap.ceilingEntry(1000));
		System.out.println(tmap.descendingKeySet());
//		System.out.println(tmap.);
		
		Set<Integer> keyless=tmap.headMap(300).keySet();
		
		System.out.println(keyless);

		Set<Integer> keyhigh=tmap.tailMap(300).keySet();
		
		System.out.println(keyhigh);
	}

}
