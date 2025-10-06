//WriteajavaprogramtoimplementExceptionPropagation
import java.util.Scanner;
public class Pro29 {
    void methodA() {
        Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First number:");
		 int a=sc.nextInt();
		 System.out.println("Enter Second number:");
		 int b=sc.nextInt();
        int data = a / b;
        System.out.println("Division result: " + data);
   
    }

    void methodB() {
        methodA();
    }

    void methodC() {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        new Pro29().methodC();
    }
}
 