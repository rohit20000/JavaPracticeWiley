package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList arr= new ArrayList();
			
			arr.add("a");

			arr.add("b");

			arr.add("c");

			arr.add('d');
			

			arr.add(1.222);
			

			arr.add(9);
			
			arr.remove(Character.valueOf('d'));
	
			arr.remove(Integer.valueOf(9));
			
			System.out.println(arr);
			
			ArrayList<String> arr2 = new ArrayList();
			
			arr2.add("a");
			
			arr2.size();
			
			List<Integer> list= new ArrayList<>();
			
			list.add(4);
			list.add(3);
			
			list.remove("4");
			
			System.out.println(list);
			String[] friend= {};
			
			ArrayList<String> friendarr= new ArrayList<>(Arrays.asList("venkat","rishav"));
			
			System.out.println(friend);
			System.out.println(friendarr);
			
			
	}

}
