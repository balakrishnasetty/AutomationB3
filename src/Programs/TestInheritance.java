package Programs;

class Animal
{  
void eat()
{
	System.out.println("eating...");
	}  
}  
class Dog extends Animal
{  
void bark()
{
	System.out.println("barking...");
	}  
}  


class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();
Animal a=new Animal();
//Dog a=new Animal();
Animal b=new Dog();
int g = 0;
if (g<=10)
{
b.eat();
}
for(int i=0;i<=10;i++)
{
	b.eat();
}
b.eat();
a.eat();
d.bark();  
d.eat();  
}
}  
