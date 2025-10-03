//Write a Java Program to enter marks of 3 subjects and find total, percentage, result and class.
import java.util.Scanner;

public class Ex5{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in );
   System.out.println("enter marks of Maths:");
   int math=sc.nextInt() ;
   System.out.println("enter Marks of java:");
   int java=sc.nextInt();
   System.out.println("enter Marks of Os:");
   int os=sc.nextInt();
   int total=0;
   total=math+java+os;
   double percentage = total / 3.0;
  String result = (math >= 35 && java >= 35 && os >= 35) ? "Pass" : "Fail";
        String grade;

        if (result.equals("Fail")) {
            grade = "No Class";
        } else if (percentage >= 75) {
            grade = "Distinction";
        } else if (percentage >= 60) {
            grade = "First Class";
        } else if (percentage >= 50) {
            grade = "Second Class";
        } else if (percentage >= 35) {
            grade = "Pass Class";
        } else {
            grade = "No Class";
        }

        // Output
        System.out.println("\n--- Result Summary ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Result: " + result);
        System.out.println("Class: " + grade);
}
}