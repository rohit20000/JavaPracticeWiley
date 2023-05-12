package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list= new CopyOnWriteArrayList<>();
		
		
		list.add("a");

		list.add("b");
		
		
		Iterator<String> item = list.iterator();
		
		while(item.hasNext())
		{
			String s1= item.next();
			list.add("c");
			String e1=item.next();
			System.out.println(e1);
		}
		System.out.println(list);
	}

}
