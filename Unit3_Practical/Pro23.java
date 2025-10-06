//Write a java program to implement ArithmeticException
import java.util.Scanner;
class Pro23
{
	public static void main(String[] args)
	{
	 try 
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First number:");
		 int a=sc.nextInt();
		 System.out.println("Enter Second number:");
		 int b=sc.nextInt();
		 System.out.println("1.Add\n2.sub\n3.div\n4.mul\n5.exit\n");
		 System.out.println("Enter Choose:");
		 int op=sc.nextInt();
		 switch(op)
		 {
			 case 1:
		 System.out.println("Sum is:"+(a+b));
		 break;
		 
			 case 2:
		 System.out.println("sub is:"+(a-b));
		  break;
		  
			 case 3:
		 System.out.println("mul is:"+(a*b));
		  break;
		  
			 case 4:
		 System.out.println("div is:"+(a/b));
		  break;
		   case 5:
		 System.out.println("Exiting.");
		  break;
		  default:
		  System.out.println("Invalid");
		  
		 }
		}
		catch(ArithmeticException e)
		{
		 System.out.println("ArithmeticException check inputs");
		}
		catch(Exception e)
		{
		 System.out.println("Something Wrong");
		}

	}

}