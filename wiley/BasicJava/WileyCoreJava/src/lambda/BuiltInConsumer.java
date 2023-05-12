package lambda;
import java.util.function.BiConsumer;;
public class BuiltInConsumer {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> el= 
				(Integer age,Integer percent)->{
					if(age > 18 && percent >75)
					{
						System.out.println("done");
					}
					else
					{
						System.out.println("Not Done");
					}
				};
				
				System.out.println(el);
		
	}

}
