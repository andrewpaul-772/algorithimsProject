import java.util.Arrays;

public class MergeSort {
    // Public wrapper method that only takes the array as input
    public static void mergeSort(int[] array) {
        // Call the recursive helper method with the full range of indices
        if (array != null) {
            mergeSortHelper(array, 0, array.length - 1);
        }
    }

    // Private helper method with the original implementation
    private static void mergeSortHelper(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSortHelper(A, p, q);
            mergeSortHelper(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }

        // Using Integer.MAX_VALUE as sentinel value
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        // Test mergeSort for an array
        int[] array = {34, 7, 23, 32, 5, 62};
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort the array using the simplified mergeSort that only takes the array
        mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}