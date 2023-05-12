package Collections;

import java.util.Objects;

public class GeniusStudent implements Comparable<GeniusStudent>{

	private int id;
	
	private String name;
	
	public GeniusStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeniusStudent other = (GeniusStudent) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	
	
	@Override
	public int compareTo(GeniusStudent o) {
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
