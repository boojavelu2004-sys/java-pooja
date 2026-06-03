import java.util.*;

public class cake {

    static int birthdayCakeCandles(int[] candles) {
        int max = candles[0];
        int count = 0;

        // Find the tallest candle
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] > max) {
                max = candles[i];
            }
        }

        // Count tallest candles
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] candles = new int[n];

        for (int i = 0; i < n; i++) {
            candles[i] = sc.nextInt();
        }

        System.out.println(birthdayCakeCandles(candles));

        sc.close();
    }
}
