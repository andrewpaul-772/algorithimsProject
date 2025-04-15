import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        // Find the maximum value in the array to determine the size of counting array
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create counting array and output array
        int[] C = new int[max + 1];
        int[] B = new int[arr.length];

        // Initialize counting array
        for (int i = 0; i <= max; i++) {
            C[i] = 0;
        }

        // Count occurrences of each element
        for (int j = 0; j < arr.length; j++) {
            C[arr[j]]++;
        }

        // Calculate cumulative count
        for (int i = 1; i <= max; i++) {
            C[i] += C[i - 1];
        }

        // Build the output array
        for (int j = arr.length - 1; j >= 0; j--) {
            B[C[arr[j]] - 1] = arr[j];
            C[arr[j]]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = B[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10,12,1,7,5,6,8};
        int k = Arrays.stream(arr).max().getAsInt();
        int[] B = new int[arr.length];
        countingSort(arr);
        System.out.println("sorted array: " + Arrays.toString(B));
    }
}
