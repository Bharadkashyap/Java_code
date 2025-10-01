//.Writeajavaprogramtoextendoneinterfaceintoanotherinterface
interface VehicalStart
{
	void start();
}
interface VehicalStop
{
	void stop();
}


 class Car implements VehicalStart,VehicalStop
{
	public void start()
	{
		System.out.println("car start......");
	}
	public void stop()
	{
		System.out.println("car stop....");
	}
}
 class Bike implements VehicalStart,VehicalStop
{
	public void start()
	{
		System.out.println("Bike start......");
	}
	public void stop()
	{
		System.out.println("Bike stop....");
	}
}
public class Pro17
{
	public static void main(String[] args)
	{
		Car c=new Car();
		Bike b=new Bike();
		
		c.start();
		c.stop();
		b.start();
		b.stop();
	}
}