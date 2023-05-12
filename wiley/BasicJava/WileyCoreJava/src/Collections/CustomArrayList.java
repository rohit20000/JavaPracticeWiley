package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {

	@Override
	public boolean add(Object o)
	{
		if(this.contains(o)){
		return false;
	}else 
     	return super.add(o);
		
	}
	public static void main(String[] args) {
		
		
		CustomArrayList clist= new CustomArrayList();
	
		clist.add(1);

		clist.add(2);

		clist.add(3);

		clist.add(1);
		
		System.out.println(clist);
		
		Set<GeniusStudent> setStudent= new HashSet<>();
		GeniusStudent gs1= new GeniusStudent(101,"rohit");
		GeniusStudent gs2= new GeniusStudent(101,"rohit");
		GeniusStudent gs3= new GeniusStudent(101,"rohit");
		
		setStudent.add(gs1);
		setStudent.add(gs2);
		setStudent.add(gs3);
		
		System.out.println(setStudent);
		
	}

}
