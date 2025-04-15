import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private static Random random = new Random();

    public static void quickSort(int[] A) {
        // Call the helper method with the full array bounds
        quickSortHelper(A, 0, A.length - 1);
    }

    private static void quickSortHelper(int[] A, int p, int r) {
        // Use an iterative approach for small subarrays to reduce stack usage
        if (r - p < 10) {
            insertionSort(A, p, r);
            return;
        }

        // Use recursion with randomized pivot for larger subarrays
        if (p < r) {
            int q = randomizedPartition(A, p, r);
            quickSortHelper(A, p, q - 1);
            quickSortHelper(A, q + 1, r);
        }
    }

    private static void insertionSort(int[] A, int p, int r) {
        for (int i = p + 1; i <= r; i++) {
            int key = A[i];
            int j = i - 1;
            while (j >= p && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    private static int randomizedPartition(int[] A, int p, int r) {
        // Choose a random pivot to avoid worst-case scenarios
        int randomIndex = p + random.nextInt(r - p + 1);

        // Swap the randomly chosen pivot with the last element
        int temp = A[randomIndex];
        A[randomIndex] = A[r];
        A[r] = temp;

        return partition(A, p, r);
    }

    private static int partition(int[] A, int p, int r) {
        int pivot = A[r];
        int i = p - 1;

        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= pivot) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        // Example with a large descending array
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;  // Fill with descending values: 10000, 9999, ...
        }

        // Sort the array using improved quickSort
        quickSort(array);

        // Print just a portion to verify
        System.out.println("First 10 elements of sorted array: " +
                Arrays.toString(Arrays.copyOfRange(array, 0, 10)));
    }
}