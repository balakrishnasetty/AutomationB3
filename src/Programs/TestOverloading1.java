package Programs;

class Adder
{  

static int add(int a,int b)
{
	int c= a+b;
	return c;
}  
static int add(int a,int b,int c)
{
	int d=a+b+c;
	return d;
	}  
}  
class TestOverloading1{  
public static void main(String[] args)
{  
	Adder a=new Adder();
System.out.println(a.add(11,11));  
System.out.println(a.add(11,11,11));  
}
}  
