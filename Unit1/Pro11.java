//.WriteajavaprogramtouseInterfaceinjava
interface Shape
{
	void draw();
}
 class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing A CIrcle");
	}
}
 class Square implements Shape
{
	public void draw()
	{
		System.out.println("Drawing A Square");
	}
}
public class Pro11
{
	public static void main(String[] args)
	{
		Shape c=new Circle();
		Shape s=new Square();
		c.draw();
		s.draw();
	}
}