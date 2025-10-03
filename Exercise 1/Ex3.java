//Write a Java Program to enter Principle Amt., Rate of Interest and No. of Years and find Simple and Compound Interest.
import java.util.Scanner;
public class Ex3{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount:");
		int p=sc.nextInt();
		System.out.println("Enter Rate of Interest:");
		int ri=sc.nextInt();
		System.out.println("Enter No of Years:");
		int y=sc.nextInt();
		System.out.println("---Simple Compound Interest---");
		double si=0;
		si=(p*ri*y)/100;
		
		System.out.println("Simple interest is :"+si);
	}
}