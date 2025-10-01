import java.util.*;

public class FrequencyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; 
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            int number = sc.nextInt();
            // Fetch
            System.out.println(freq.getOrDefault(number, 0));
        }

        sc.close();
    }
}
