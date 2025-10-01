//15.WriteajavaprogramtouseHierarchicalinheritance

class Animal{
	void makesound()
	{
		System.out.println("Animal make Sound");
	}
}
class Dog extends Animal {
	void bark()
	{
		System.out.println("Dog Bark ");
	}
	
}class Cat extends Animal {
	void Meow()
	{
		System.out.println("cat Meows");
	}
	
}
public class Pro15{
 public static void main(String[] args){
	 System.out.println("---Hierarchical inheritance---");
	 Dog obj1=new Dog();
	 Cat obj2=new Cat();
	 obj1.makesound();
	 obj1.bark();
	 System.out.println("------------");
	 obj2.makesound();
	 obj2.Meow();
 }
}
