//.Writeajavaprogramtoextendoneinterfaceintoanotherinterface
interface Animal
{
	void eat();
}
interface Pet extends Animal
{
	void Play();
}
 class Dog implements Pet
{
	public void eat()
	{
		System.out.println("Dog eating.......");
	}
	public void Play()
	{
		System.out.println("Dog is Playing");
	}
}
 class Cat implements Pet
{
	public void eat()
	{
		System.out.println("Cat eating.......");
	}
	public void Play()
	{
		System.out.println("Cat is Playing");
	}
}
public class Pro12
{
	public static void main(String[] args)
	{
		Pet c=new Dog();
		Pet s=new Cat();
		
		s.eat();
		c.eat();
		s.Play();
		c.Play();
	}
}