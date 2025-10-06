//WriteajavaprogramtouseThrowKeyword
import java.util.Scanner;
class Pro26
{
    static void ValidateAge(int age)
    {
        if(age>18)
        {
        throw new ArithmeticException("Not eligible to vote");
        }
        else
        {
            System.out.println("Age is valid for vote");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter YOur Age:");
        int a=sc.nextInt();
        ValidateAge(a);
    }
}