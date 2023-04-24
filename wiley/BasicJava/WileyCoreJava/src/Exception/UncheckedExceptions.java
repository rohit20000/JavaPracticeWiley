package Exception;

import  java.util.*;
class StringNotFound extends RuntimeException{
	public StringNotFound(String message)
	{
		super(message);
	}
}
public class UncheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr =new ArrayList<>();
		
		arr.add("Rohit");
		arr.add("Filza");
		
		if(!arr.contains("Rohit"))
		{
			try{
				throw new StringNotFound("THis string is not found");
			}catch(StringNotFound e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("done");
		
	}

}
