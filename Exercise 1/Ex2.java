// Write a Java Program to enter two nos. and perform all 5 mathematical operations
import java.util.Scanner;
public class Ex2{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2:");
		int num2=sc.nextInt();
		System.out.println("---Airthmetic Operation Starts---");
		System.out.println("Addittion of Values is:"+(num1+num2));
		System.out.println("Substraction of Values is:"+(num1-num2));
		System.out.println("Multiplication of Values is:"+(num1*num2));
		System.out.println("Division of Values is:"+(num1/num2));
	}
}