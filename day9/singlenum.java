public class singlenum {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        int single = 0;

        for (int n : nums) {
            single ^= n;
        }

        System.out.println(single);
    }
}