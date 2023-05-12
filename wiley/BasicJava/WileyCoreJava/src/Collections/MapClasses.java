package Collections;
import java.util.*;
public class MapClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map= new HashMap<String,String>();
		
		map.put("a","A");
		map.put("b",null);
		map.put(null,"nullval");
		
		map.put(null,null);
		map.put("a","f");
		map.put("z","f");
		
		
		System.out.println(map);
		
		
		
	}

}
