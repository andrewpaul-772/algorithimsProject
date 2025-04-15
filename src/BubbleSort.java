import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 6, 2, 1, 0, 3, -5, -100, 1000, -300, 500, 20, 50};
        System.out.println(java.time.LocalDateTime.now());
        bubbleSort(arr);
        System.out.println(java.time.LocalDateTime.now());
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
