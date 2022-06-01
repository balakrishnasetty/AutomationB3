package Programs;

class Bike12{  
	  void run(){System.out.println("running");}  
	}  
	class Splendor extends Bike{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){  
	    Bike12 b = new Splendor();    //upcasting  
	    //upcasting is not possible in java
	    b.run();  
	  }  
	}