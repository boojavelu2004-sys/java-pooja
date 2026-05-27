public class arraymax {
    public static void main(String[] args) {
        
        int[] arr = {10, 25, 7, 99, 45};
        int max = arr[0];

        for(int i : arr)
            if(i > max)
                max = i;

        System.out.println("Maximum = " + max);
    }
}