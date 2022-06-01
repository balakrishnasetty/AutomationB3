package Programs;

class Bank13{  
float getRateOfInterest()
{
	return 0;
	}  
}  
class SBI13 extends Bank13
{  
float getRateOfInterest()
{
	return 8.4f;
	}  
}  
class ICICI13 extends Bank13{  
float getRateOfInterest(){return 7.3f;}  
}  
class AXIS13 extends Bank13{  
float getRateOfInterest(){return 9.7f;}  
}  
class TestPolymorphism{  
public static void main(String args[]){  
Bank13 b;  
b=new SBI13();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
b=new ICICI13();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
b=new AXIS13();  
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
}  
}