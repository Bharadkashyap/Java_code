//Write a Java Program to perform 3x3 matrix multiplication.
import java.util.*;
public class Ex19
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		int i,j;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		System.out.print("First Matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			System.out.println("Enetr Number "+i+j+":");
			a[i][j]=sc.nextInt();
			
			}
			
		}
		
		System.out.print("Second Matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			System.out.println("Enetr Number "+i+j+":");
			b[i][j]=sc.nextInt();
			
			}
			
		}
		
				System.out.println("Matrixs:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			System.out.print(a[i][j]);
			
			}
			
				System.out.println();
			
		}
			for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			System.out.print(b[i][j]);
			
			}
			
				System.out.println();
			
		}
		System.out.println("After Multiplication Matrix Is:");
	for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			System.out.print("\t"+a[i][j]*b[i][j]+"\t");
			
			}
			
				System.out.println();
			
		}		
		
		
	}
}