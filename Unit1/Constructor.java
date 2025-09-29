import java.util.Scanner;
public class Constructor
{
	  double width;
    double height;
    double depth;

	Constructor()
	{
		System.out.println("Default Constructor: Initializing Box with default dimensions.");
        width = 0.0;
        height = 0.0;
        depth = 0.0;
		
	}
	public Constructor(double val)
	{
		 System.out.println("No-Argument Constructor: Initializing a cube with side: " + val);
        width = val;
        height = val;
        depth = val;
	}
	public Constructor(double w,double h,double d)
	{
		  System.out.println("Parameterized Constructor: Initializing Box with width: " + w + ", height: " + h + ", depth: " + d);
        width = w;
        height = h;
        depth = d;
	}
	public double Volume()
	{
		return width * height * depth;	
	}
	
	public static void main(String[] s)
	{
		Constructor  def=new Constructor();
		System.out.println("Default Constructor :"+def.Volume()+"\n");
		Constructor  cube=new Constructor(5.0);
		System.out.println("Constructor of cube :"+cube.Volume()+"\n");
		Constructor  custom=new Constructor(5.0,55.0,12.0);
		System.out.println("Constructor custom:"+custom.Volume()+"\n");
	}
}