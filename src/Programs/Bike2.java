package Programs;

class Vehicle11{  
	  //defining a method  
	  void run(){System.out.println("Vehicle is running");}  
	}  
	//Creating a child class  
	class Bike2 extends Vehicle11{  
	  //defining the same method as in the parent class  
	  void run(){System.out.println("Bike is running safely");}  
	  
	  public static void main(String args[]){  
		  Vehicle11 a=new Vehicle11();
		  a.run();
	  Bike2 obj = new Bike2();//creating object  
	  obj.run();//calling method  
	  }  
	}  
