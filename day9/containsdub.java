import java.util.*;

public class containsdub {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.add(n)) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}