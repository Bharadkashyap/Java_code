// Write a Java Program to enter 10 nos. and sort them in ascending orde
import java.util.Scanner;
import java.util.Arrays;


public class Ex17
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		int[] num=new int[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter a number: ");
			num[i]= sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(num[i]);
			
		}
		Arrays.sort(num);

        System.out.println("\nNumbers in ascending order:");
        for (int num1 : num) 
		{
            System.out.print(num1 + " ");
        }
    }
		
    
}