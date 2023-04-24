package Wiley_core_java;

class Employee{
	private String name;
	private int age ;
	
	public String getName()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public int getAge()
	{
		return age;
		
	}
	public void setAge(int age)
	{
		this.age=age;
		
	}
}

class EmpImpl {
	public void showData (Employee emp)
	{
		System.out.println("Name is "+emp.getName() +" age is "+emp.getAge());
	}
}
public class EmpEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		
		emp.setName("Rohit");
		emp.setAge(22);
		
		EmpImpl empIm = new EmpImpl();
		empIm.showData(emp);
		
	}

}
