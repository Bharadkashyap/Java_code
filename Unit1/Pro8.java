import java.util.Scanner;

public class Pro8{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in );
   System.out.println("enter number to check Odd & Even:");
   int num=sc.nextInt();
  if(num%2==0)
  {
	  System.out.println("Num is Even:"+num);
  }
  else
  {
	  System.out.println("Num is Odd:"+num);
  }
  
}
}