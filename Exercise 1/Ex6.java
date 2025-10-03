//Write a Java program to enter two nos. and find maximum out of it

import java.util.Scanner;
public class Ex6{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter FIrst Number:");
		int n1=sc.nextInt();
			
		System.out.println("Enter Second Number:");
		int n2=sc.nextInt();
			if(n1>n2)
			{
				
		System.out.println("First number is Maximum"+n1);
			}
			else if(n1<n2)
			{
				
		System.out.println("Second number is Maximum"+n2);
			}
			else 
			{
				
		System.out.println("Both are Same");
			}
		}
}