package Programs;

class Bike11{
	final void run(){System.out.println("running");}
	}
	   
	class Honda extends Bike11{
	    void run(){System.out.println("running safely with 100kmph");}
	   
	   public static void main(String args[]){
	   Honda honda= new Honda();
	   honda.run();
	   }
	}
