//WriteajavaprogramtouseMultipleCatchBlock
public class Pro25 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds ");
        }
    }
}
