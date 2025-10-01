//.WriteajavaprogramtouseAbstractclass

abstract class Animal
{
	void eat()
	{
	  System.out.println("Eating animal....");
	}
	
	abstract void sound();
}
 class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Bark...");
	}
}
  class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Meow...");
	}
}
public class Pro16
{
	public static void main(String[] args)
	{
		Animal d=new Dog();
		Animal c=new Cat();
		d.eat();
		d.sound();
		c.eat();
		c.sound();
	
	}
}