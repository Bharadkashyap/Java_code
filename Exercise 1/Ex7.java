//Write a Java Program to enter three nos. and find maximum out of it
import java.util.Scanner;
public class Ex7{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter FIrst Number:");
		int n1=sc.nextInt();
			
		System.out.println("Enter Second Number:");
		int n2=sc.nextInt();			
		System.out.println("Enter Third Number:");
		int n3=sc.nextInt();
			if(n1>n2 || n1>n3)
			{
				
		System.out.println("First number is Maximum"+n1);
			}
			else if(n2>n1 || n2>n3)
			{
				
		System.out.println("Second number is Maximum"+n2);
			}
			else if(n3>n1 || n3>n2)
			{
				
		System.out.println("Third number is Maximum"+n3);
			}
			else 
			{
				
		System.out.println("All are Equal");
			}
		}
}