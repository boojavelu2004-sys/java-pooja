import java.io.*;
import java.util.*;

public class minimax {

    public static void miniMaxSum(int[] arr) {
        long total = 0;

        for (int i = 0; i < 5; i++) {
            total += arr[i];
        }

        long min = total - arr[0];
        long max = total - arr[0];

        for (int i = 1; i < 5; i++) {
            long sum = total - arr[i];

            if (sum < min) {
                min = sum;
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        miniMaxSum(arr);

        sc.close();
    }
}