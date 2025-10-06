//Writeajavaprogramtodemonstrateencapsulation
class Student
{
	private String name;
	private int Age;
	Student(String name,int Age)
	{
		this.name=name;
		this.Age=Age;
	}
	void Display()
	{
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+Age);
	}
}
public class Pro21
{
	public static void main(String[] args)
	{
		Student s=new Student("kashyap",21);
		s.Display();
	}

}