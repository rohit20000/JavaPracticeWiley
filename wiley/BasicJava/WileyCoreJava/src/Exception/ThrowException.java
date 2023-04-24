package Exception;

class AgeNotValid extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public AgeNotValid(String message)
	{
		super(message);
	}
}
public class ThrowException {
	public static void getAge(int age) throws AgeNotValid
	{
		if(age>18)
		{
			try {
				throw new AgeNotValid(" age not valid");
			}
			catch(Exception e)
			{
				e.printStackTrace();	
				System.out.println(e.toString());
				System.out.println(e.getMessage());
				
			}
		}
		else {
			System.out.println("Age valid");
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String[] args) throws AgeNotValid {
		// TODO Auto-generated method stub
getAge(19);
	}

}
