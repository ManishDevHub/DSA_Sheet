import java.util.*;

public class CheckSortArr {
    public static void main(String[] args) {
        int arr[] = {4, 54, 654, 32, 36, 35};

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break; // no need to check further
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
