import java.util.Scanner;
import java.util.*;

public class Third{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in );
   
   System.out.print("enter your name = ");
   String name=sc.nextLine(); 	
   
   System.out.print("enter your age = ");
   int age=sc.nextInt();
   
   System.out.print("enter your contact = ");
    int cont=sc.nextInt();
   
   System.out.print("enter your rollno = ");
   int rollno=sc.nextInt();

   System.out.println("your name is "+name);
   System.out.println("your age is "+age);
   System.out.println("your contact is "+cont);
   System.out.println("your rollno is "+rollno);
   sc.close();
 }
}