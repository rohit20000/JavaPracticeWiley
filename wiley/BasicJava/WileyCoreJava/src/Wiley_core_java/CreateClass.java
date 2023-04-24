package Wiley_core_java;

public class CreateClass  implements Cloneable {
	int a=10;
	
	public void add()
	{
		System.out.println("Number Added");
	}
public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
	
	// create object with new keyword
	
	CreateClass cc= new CreateClass();
	
	cc.add();
	
	System.out.println(cc);
	
	//create object with newInstance()
	
	try {
		Class  c= Class.forName("Wiley_core_java.CreateClass");
		
		CreateClass c1 = (CreateClass) c.newInstance();
		
		c1.add();
		
		System.out.println(c1);
		
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	
	
	//Create object with object.clone()
	
	CreateClass cloneObj= (CreateClass) cc.clone();
	
	cloneObj.add();
	
	System.out.println( "CloneObject "+cloneObj);

}
}
