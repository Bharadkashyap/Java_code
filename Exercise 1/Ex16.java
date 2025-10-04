//Write Java Programs to print following triangles.
import java.util.Scanner;
public class Ex16{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:for Number Triangles");
		System.out.println("2:for * Triangles ");
		System.out.println("3:for 0/1 Triangles");
		
		System.out.println("Enter chooose :");
	  char ch = sc.next().charAt(0);
		switch(ch)
		{
			case '1':
			
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		
			System.out.println("------First Patern-------");
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print(j);
				}				
				System.out.println();
			}
			System.out.println("------Seond Patern-------");
			
			for(int i=n;i>=1;i--)
			{
				for(int j=i;j>=1;j--)
				{
				System.out.print(j);
				}				
				System.out.println();
			}
			System.out.println("------Third Patern-------");
			
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j>=1;j--)
				{
				System.out.print(j);
				}				
				System.out.println();
			}
			System.out.println("------Fourth Patern-------");
			for(int i=1;i<=n;i++)
			{
				for(int j=5;j>=i;j--)
				{
				System.out.print(j);
				}				
				System.out.println();
			}
			System.out.println("------Fifth Patern-------");
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print(j);
				}				
				System.out.println();
			}
			System.out.println("------Six Patern-------");
				
				int no=1;
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print(no);
				no++;
				}				
				System.out.println();
			}
			
			
			System.out.println("------7th Patern-------");
			
			for(int i=1;i<=5;i++)
			{
				for(int k=1;k<=5-i;k++)
				{
				System.out.print(" ");
				}
				for(int j=i;j>=1;j--)
				{
				System.out.print(j);
				}
				
				for(int j=2;j<=i;j++)
				{
				System.out.print(j);
				}				
				
				System.out.println();
			}
			
				break;
			case '2':
			
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
			System.out.println("------First Patern-------");
			
			for(int i=1;i<=n1;i++)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print("*");
				}				
				System.out.println();
			}
			
			System.out.println("------Second Patern-------");
			
			for(int i=1;i<=n1;i++)
			{
				for(int j=1;j<=n1-i;j++)
				{
					
				System.out.print(" 	");
				}			
				for(int j=1;j<=i ;j++)
				{
				System.out.print("* ");	
				}				
				System.out.println();
			}
			
				break;
				
				
			case '3'://Case 3 for 0/1
			 System.out.print("Enter a number: ");
        int n2 = sc.nextInt();
			
			for(int i=1;i<=n2;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(j%2==0)
					{
						
				System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}				
				System.out.println();
			}
			System.out.println("-------- Second Patern--------");
			for(int i=1;i<=n2;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(j%2==0)
					{
						
				System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}				
				System.out.println();
			}
				break;
		
				default:
				System.out.println("Invalid choose");
		}
		}
	}
	