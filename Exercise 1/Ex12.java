//Write a Java Program to enter three nos. and find maximum out of it.
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        
        while (num != 0) {
            int digit = num % 10;      
            reverse = reverse * 10 + digit;
            num = num / 10;             
        }

       
        System.out.println("Reversed number: " + reverse);
    }
}