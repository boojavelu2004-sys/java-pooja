class arrmissing {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};
        int n = 5;

        int sum = 0;

        for (int i : arr)
            sum += i;

        int missing = n * (n + 1) / 2 - sum;

        System.out.println("Missing value: " + missing);
    }
}