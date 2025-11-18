import java.util.*;

public class ChocolateDistribution {

    public static void main(String[] args) {

        int[] arr = {3, 45, 3, 7, 8, 5, 98};
        int m = 3;

        ChocolateDistribution obj = new ChocolateDistribution();
        int result = obj.findMinDiff(arr, m);

        System.out.println("Minimum Difference = " + result);
    }

    public int findMinDiff(int[] a, int m) {

        if (m > a.length) return -1;

        Arrays.sort(a);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= a.length - m; i++) {
            int diff = a[i + m - 1] - a[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
