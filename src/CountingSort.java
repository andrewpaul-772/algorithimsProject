import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr, int[] B, int k) {
        int[] C = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            C[i] = 0;
        }
        for (int j = 0; j < arr.length; j++) {
            C[arr[j]]++;
        }
        for (int i = 1; i <= k; i++) {
            C[i] += C[i - 1];
        }
        for (int j = arr.length-1; j >= 0; j--) {
            B[C[arr[j]]-1] = arr[j];
            C[arr[j]]--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10,12,1,7,5,6,8};
        int k = Arrays.stream(arr).max().getAsInt();
        int[] B = new int[arr.length];
        countingSort(arr, B, k);
        System.out.println("sorted array: " + Arrays.toString(B));
    }
}
