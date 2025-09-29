//Write a Program of 1D array
import java.util.Scanner;
public class Pro10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter Value :");
			array[i]=sc.nextInt();			
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("value of Array is:"+array[i]);
				
		}
		
	}
}