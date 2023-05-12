package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInPredicate {

	public static void main(String[] args) {
		
		Predicate<String> cheLength= (String str) ->str.length()==4;
		
		List<String> fi = Arrays.asList("java","python","angular");
		
		fi.forEach(l -> {
			if(cheLength.test(l))
			{
				System.out.println(l);
			}
		});
	}

}
