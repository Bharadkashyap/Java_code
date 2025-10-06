//WriteajavaprogramtoimplementExceptionChaining
public class Pro30 {
    public static void main(String[] args) {
        try {
            Throwable cause = new NullPointerException("Cause");
            throw new Exception("Chained Exception", cause);
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            System.out.println("Cause: " + e.getCause());
        }
    }
}
