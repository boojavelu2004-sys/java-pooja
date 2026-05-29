public class arrmaxsecond {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 99, 45};

        int max = 0, second = 0;

        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }

        System.out.println(second);
    }
}