//Write a java program to implement simple exception handling
import java.util.Scanner;
public class Pro22 {
    public static void main(String[] args) {
        try {
           Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First number:");
		 int a=sc.nextInt();
		 System.out.println("Enter Second number:");
		 int b=sc.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception caught: Divided By 0");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

