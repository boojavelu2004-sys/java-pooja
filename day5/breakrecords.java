import java.util.*;

public class breakrecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int maxScore = scores.get(0);
        int minScore = scores.get(0);

        int maxBreaks = 0;
        int minBreaks = 0;

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);

            if (score > maxScore) {
                maxScore = score;
                maxBreaks++;
            } else if (score < minScore) {
                minScore = score;
                minBreaks++;
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        result.add(maxBreaks);
        result.add(minBreaks);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> scores = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            scores.add(sc.nextInt());
        }

        List<Integer> result = breakingRecords(scores);

        System.out.println(result.get(0) + " " + result.get(1));

        sc.close();
    }
}