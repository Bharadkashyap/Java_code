import java.util.Scanner;
public class Jagged {
    public static void main(String[] s) {
		
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        int[][] jag = new int[row][];

        // Input section
        for (int i = 0; i < row; i++) {
            System.out.println("Enter number of columns for row " + (i + 1) + ":");
            int col = sc.nextInt();
            jag[i] = new int[col];

            for (int j = 0; j < jag[i].length; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                jag[i][j] = sc.nextInt();
            }
        }

        // Output section
        System.out.println("\nJagged Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < jag[i].length; j++) {
                System.out.print(jag[i][j] + "\t");
            }
            System.out.println(); 
        }
    }
}
