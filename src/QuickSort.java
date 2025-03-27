import java.util.Arrays;
import java.util.Comparator;

public class QuickSort {
    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    public static int partition(int[] A, int p, int r) {
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
        int[] array = {34, 7, 23, 32, 5, 62};

        // Sort the array using mergeSort
        quickSort(array, 0, array.length-1);
        System.out.println("Sorted array: " + Arrays.toString(array));


    }
}
