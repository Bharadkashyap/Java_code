//Write a java program to perform simple inheritance.

class Animal{
	void makesound()
	{
		System.out.println("Animal make Sound(Parent class)");
	}
}
class Dog extends Animal {
	void bark()
	{
		System.out.println("Dog Bark (Child Class)");
	}
	
}
public class Pro13{
 public static void main(String[] args){
	 System.out.println("---Simple inheritance---");
	Dog obj=new Dog();
	obj.makesound();
	obj.bark();
 }
}
