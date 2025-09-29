//multi dimension  Array
import java.util.Scanner;
public class MultiArray
{
	public static void main(String[] s)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Rows");
			int row=sc.nextInt();
			System.out.println("Enter column");
			int col=sc.nextInt();
		int[][] array=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
		{
			System.out.println("Enter Value:");
			array[i][j]=sc.nextInt();			
		}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
		{
			System.out.print(array[i][j]+"\t" );
				
		}		
			System.out.println();
		}
	}
	
}  