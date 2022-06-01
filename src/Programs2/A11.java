package Programs2;

class A11{  
	 void eat()
	 {
		 System.out.println("animal is eating...");
		 }  
	}  
	  
	class Dog1 extends A11
	{  
	 void eat()
	 {
		 System.out.println("dog is eating...");
		 }  
	
	 public static void main(String args[]){  
	  A11 a=new Dog1();  
	  a.eat();  
	 }  
	}
	
	/*
	 * Dynamic binding When type of the object is determined at run-time, it is
	 * known as dynamic binding.
	 */
	
	//Example for the dynamic binding
	/*
	 * Connecting a method call to the method body is known as binding.
	 * 
	 * There are two types of binding
	 * 
	 * Static Binding (also known as Early Binding). Dynamic Binding (also known as
	 * Late Binding).
	 */