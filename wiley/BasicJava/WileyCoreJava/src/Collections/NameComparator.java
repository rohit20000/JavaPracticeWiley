package Collections;

import java.util.Comparator;

public class NameComparator implements Comparator<GeniusStudent> {

	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {
		// TODO Auto-generated method stub
//		return 0;
		
		if(id==o.id)
			return 0;
		else if(id>o.id)
		{
			return 1;
		}
		else
			return -1;
	}
	
}
