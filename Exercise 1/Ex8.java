//Write a Java Program to enter 10 Nos. and find sum and average of it.
import java.util.Scanner;
public class Ex8{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		int sum=0;
		for(int i=0;i<10;i++)
		{
		System.out.println("Enter Number"+(i+1)+":");
		num[i]=sc.nextInt();
		sum+=num[i];
		}
		double avg=sum/10.0;
		System.out.println("Resulting....");
		System.out.println("Sum  Is :"+sum);
		System.out.println("Average Is :"+avg);
	
	}
}