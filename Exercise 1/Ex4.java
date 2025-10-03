//Write a Java Program to enter amount in Rs. and find amount in Dollars (1 Dollar = 82.78 Rs.
import java.util.Scanner;
public class Ex4{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amountin Rs:");
		int rs=sc.nextInt();
			double doll=rs/82.78;
		System.out.println("Dollar Is :"+doll);
	}
}