package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSaveCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> myMap = new ConcurrentHashMap<Integer,String>();
		
		
		myMap.put(1, "java");
		myMap.put(2, "python");
		
		Iterator it = myMap.keySet().iterator();
		
		while(it.hasNext())
		{
			Integer key = (Integer) it.next();
			System.out.println(key+"   :   "+myMap.get(key));
			myMap.put(3, "abc");
		}
		
		
	}

}
