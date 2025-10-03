/*Write java programs to Print following Loops :
a. 1 2 3 4 …… 10
b. 2 4 6 ……. 20
c. 1 3 5 7 …… 19
d. 100 99 98…… 90
e. 200 198 196 …. 180
f. 0 1 1 2 3 5 8 ….. n
g. 1 + 2 + …… + 10 = ans*/
import java.util.Scanner;
public class Ex10{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("a. 1 2 3 4 …… 10");
		System.out.println("b. 2 4 6 ……. 20");
		System.out.println("c. 1 3 5 7 …… 19");
		System.out.println("d. 100 99 98…… 90");
		System.out.println("e. 200 198 196 …. 180");
		System.out.println("f. ");
		System.out.println("g. 1 + 2 + …… + 10 ");
		System.out.println("Enter chooose 1:");
	  char ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'a':
			for(int i=1;i<10;i++)
			{
				System.out.print(i+"\t");
			}
				break;
			case 'b':
			for(int i=2;i<20;i+=2)
			{
				System.out.print(i+"\t");
			}
				break;
			case 'c':
			for(int i=1;i<20;i+=2)
			{
				System.out.print(i+"\t");
			}
				break;
			case 'd':
			for(int i=100;i>90;i--)
			{ 
				System.out.print(i+"\t");
			}
				break;
			case 'e':
			for(int i=200;i>180;i-=2)
			{
				System.out.print(i+"\t");
			}
				break;
			case 'f':
			System.out.println("Enter fibonaci:");
			int  n = sc.nextInt();
			int a=0,b=1;
			for(int i=1;i<=n;i++)
			{
				
				System.out.print(a+"\t");
				int t=a+b;
				a=b;
				b=t;
			}
			
				break;
			case 'g':
			int num=0;
			for(int i=1;i<=10;i++)
			{
				System.out.print(i+"+");
				num+=i;
			}
			System.out.println("Total is:"+num);
				break;
				default:
				System.out.println("Invalid choose");
		}
		
	}
}