import java.util.Scanner;

public class Pro9{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in );
   System.out.println("enter marks of Maths:");
   int math=sc.nextInt() ;
   System.out.println("enter Marks of java:");
   int java=sc.nextInt();
   System.out.println("enter Marks of Os:");
   int os=sc.nextInt();
   int total=0;
   double avg=0;
   total=math+java+os;
   avg=total/3.0;
   String grade;
   if (math < 35 || java < 35 || os < 35) {
            System.out.println("Student is Fail (One or more subjects below 35)");
            grade = "F";
        } else if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B+";
        } else if (avg >= 60) {
            grade = "B";
        } else if (avg >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Grade is: " + grade);
  
}
}