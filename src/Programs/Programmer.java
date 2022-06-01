package Programs;

import java.io.Serializable;
import java.util.Scanner;

class Employee{
	 float salary=40000;
	 boolean status=true;
	 
	}

	class Programmer extends Employee{
	 int bonus=10000;
	 public static void main(String args[]){
	   Programmer p=new Programmer();
	   System.out.println("Programmer salary is:"+p.salary);
	   System.out.println("Bonus of Programmer is:"+p.bonus);
	  
	   System.out.println(p.status);
	   System.out.println("--------------------------------------------");
	   System.out.println(p.getClass());
	   int a=p.hashCode();
	   System.out.println(a);
	   System.out.println("--------------------------------------------");
	   Programmer q=new Programmer();
	   Serializable b=q.getClass();
	   System.out.println(b);
	   
	   try {
		Object clone = q.clone();
	} catch (Exception e) {
		System.out.println("--------------------------------------------");
		System.out.println("The Name of the Exception with cloned object");
		System.out.println(e);
	}
	   Scanner in = new Scanner(System.in);
	  System.out.println("please Enter Name");
	  String name=in.next();
	  System.out.println(name);
	  System.out.println("Enter Age");
	  int age=in.nextInt();
	  System.out.println(age);
	}
	}