import java.util.Scanner;

public class Pro7{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in );
   System.out.println("enter number to check Positive and Negative:");
   int num=sc.nextInt();
  if(num>0)
  {
	  System.out.println("Number is Positive:"+num);
  }
  else if(num<0)
  {
	  System.out.println("Number is Negative:"+num);
  }
  else
  {
	  	  System.out.println("Number is Equal TO zero:"+num);
 
  }
  
}
}