import java.util.*;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();

            if (i != k) {
                total += cost;
            }
        }

        int bCharged = sc.nextInt();

        int actualShare = total / 2;

        if (bCharged == actualShare) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(bCharged - actualShare);
        }

        sc.close();
    }
}