//WriteajavaprogramtouseMultipleinheritanceusinginterface.
interface Printable
{
	void Print();
}
interface Showable
{
	void Show();
}
 class Display implements Printable,Showable
{
	public void Print()
	{
		System.out.println("Printing Content.......");
	}
	public void Show()
	{
		System.out.println("Showing Content ");
	}
}

public class Pro18
{
	public static void main(String[] args)
	{
		Display c=new Display();
		c.Print();
		c.Show();
	}
}