import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // 1. Read CSV file
        String csvFile = "25k_intsEvenlyPartitioned.csv";
        int[] originalArray;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            originalArray = br.lines()
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }
        System.out.println("-----------Start------------");
        System.out.println("Array size: " + originalArray.length);

        // 2. Create all 10 copies upfront (not part of timed operation)
        int[][] copies = new int[10][];
        for (int i = 0; i < 10; i++) {
            copies[i] = Arrays.copyOf(originalArray, originalArray.length);
        }

        System.out.println("Starting...");

        // 3. Start timer (only for sorting)
        long startTime = System.currentTimeMillis();
        System.out.println("Sort start time: " + LocalDateTime.now());

// 4. Only sorting operations (no array copying here)
        for (int i = 0; i < 10; i++) {
            QuickSort.quickSort(copies[i]);
        }

// 5. End timer
        long endTime = System.currentTimeMillis();
        System.out.println("Sort end time: " + LocalDateTime.now());

        System.out.println("Total time = " + (endTime - startTime) + " ms \n --------Finished-------- \n");


        // 1. Read CSV file
        csvFile = "50k_intsEvenlyPartitioned.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            originalArray = br.lines()
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }
        System.out.println("-----------Start------------");
        System.out.println("Array size: " + originalArray.length);


        // 2. Create all 10 copies upfront (not part of timed operation)
        for (int i = 0; i < 10; i++) {
            copies[i] = Arrays.copyOf(originalArray, originalArray.length);
        }

        System.out.println("Starting...");

        // 3. Start timer (only for sorting)
        startTime = System.currentTimeMillis();
        System.out.println("Sort start time: " + LocalDateTime.now());

// 4. Only sorting operations (no array copying here)
        for (int i = 0; i < 10; i++) {
            QuickSort.quickSort(copies[i]);
        }

// 5. End timer
        endTime = System.currentTimeMillis();
        System.out.println("Sort end time: " + LocalDateTime.now());

        System.out.println("Total time = " + (endTime - startTime) + " ms \n --------Finished-------- \n");



        // 1. Read CSV file
        csvFile = "75k_intsEvenlyPartitioned.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            originalArray = br.lines()
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }
        System.out.println("-----------Start------------");
        System.out.println("Array size: " + originalArray.length);
        // 2. Create all 10 copies upfront (not part of timed operation)
        for (int i = 0; i < 10; i++) {
            copies[i] = Arrays.copyOf(originalArray, originalArray.length);
        }

        System.out.println("Starting...");

        // 3. Start timer (only for sorting)
        startTime = System.currentTimeMillis();
        System.out.println("Sort start time: " + LocalDateTime.now());

// 4. Only sorting operations (no array copying here)
        for (int i = 0; i < 10; i++) {
            QuickSort.quickSort(copies[i]);
        }

// 5. End timer
        endTime = System.currentTimeMillis();
        System.out.println("Sort end time: " + LocalDateTime.now());

        System.out.println("Total time = " + (endTime - startTime) + " ms \n --------Finished-------- \n");


        // 1. Read CSV file
        csvFile = "100k_intsEvenlyPartitioned.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            originalArray = br.lines()
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }
        System.out.println("-----------Start------------");
        System.out.println("Array size: " + originalArray.length);
        // 2. Create all 10 copies upfront (not part of timed operation)
        for (int i = 0; i < 10; i++) {
            copies[i] = Arrays.copyOf(originalArray, originalArray.length);
        }

        System.out.println("Starting...");

        // 3. Start timer (only for sorting)
        startTime = System.currentTimeMillis();
        System.out.println("Sort start time: " + LocalDateTime.now());

// 4. Only sorting operations (no array copying here)
        for (int i = 0; i < 10; i++) {
            QuickSort.quickSort(copies[i]);
        }

// 5. End timer
        endTime = System.currentTimeMillis();
        System.out.println("Sort end time: " + LocalDateTime.now());

        System.out.println("Total time = " + (endTime - startTime) + " ms \n --------Finished-------- \n");
    }

}
