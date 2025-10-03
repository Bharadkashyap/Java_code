//Write a Java Program to enter 10 Nos. and find Maximum out of it without using array.
import java.util.Scanner;
public class Ex9{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
System.out.println("Enter Number 1:");
		int max=sc.nextInt();
		
		
		for(int i=2;i<10;i++)
		{
			System.out.println("Enter Number"+(i+1)+ ":");
		int num=sc.nextInt();
		if(num>max)
		{
			max=num;
		}
		
		}
		
		System.out.println("Maximum Is :"+max);
	
	}
}