import java.util.Scanner;

public class diagonalelm{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int sum = 0;

        // User Input
        System.out.println("Enter matrix values:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Diagonal Sum
        for (int i = 0; i < 3; i++) {
            sum = sum + a[i][i];
        }

        // Output
        System.out.println("Sum of diagonal elements = " + sum);
    }
}