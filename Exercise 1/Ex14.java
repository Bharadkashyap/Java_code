//Write a Java Program to enter a no. and check it is Armstrong or not?
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
 int digits = String.valueOf(num).length();
        
        while (num != 0) {
            int digit = num % 10;      
            sum += Math.pow(digit, digits);
            num = num / 10;             
        }

       if (sum == original) {
            System.out.println(original + " is a Armstrong.");
        } else {
            System.out.println(original + " is not a Armstrong.");
        }
    }
}