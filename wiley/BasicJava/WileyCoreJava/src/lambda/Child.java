package lambda;

@FunctionalInterface
public interface Child extends Parent {

	public void sayHello();
	 default void sayHi() {
		 
	 }
	 
//	 Method of Object class
	 String toString();
	 int hashCode();
	 boolean equals(Object obj);
	
	 
}
