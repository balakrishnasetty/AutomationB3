package Programs;

public class Main1{

		  private String name;

		  // constructor
		  Main1() {
		    System.out.println("Constructor Called:");
		    name = "Programiz";
		  }

		  public static void main(String[] args) {

		    // constructor is invoked while
		    // creating an object of the Main class
		    Main1 obj = new Main1();
		    System.out.println("The name is " + obj.name);
		  }
		}


