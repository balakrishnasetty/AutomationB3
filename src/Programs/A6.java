package Programs;

interface printable{  
void print();  
void scan();
}  
class A6 implements printable{  
public void print(){
	System.out.println("print");
}  

public void scan() {
	System.out.println("sacn");
}
  
public static void main(String args[]){  
A6 obj = new A6();  
obj.print();  
obj.scan();
 }  
}  