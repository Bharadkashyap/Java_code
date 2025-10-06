//4WriteajavaprogramtouseFinallyblockinExceptionHandling
import java.util.Scanner;
public class Pro24 {
    public static void main(String[] args) {
        try {
             Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First number:");
		 int a=sc.nextInt();
		 System.out.println("Enter Second number:");
		 int b=sc.nextInt();
         int data=a/b;
            System.out.println("Result: " + data);
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
