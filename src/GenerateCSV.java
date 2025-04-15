import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateCSV {
    public static void main(String[] args) throws IOException {
        random();
        inOrder();
        reverseOrder();
        randomBigK();
        randomSmallK();
        alternatingElements();
        evenlyPartitioned();
    }

    public static void random() throws IOException {
        int[] sizes = {25_000, 50_000, 75_000, 100_000};
        Random random = new Random();

        for (int size : sizes) {
            String filename = size / 1000 + "k_intsRandom.csv";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (int i = 0; i < size; i++) {;
                    writer.write(random.nextInt(Integer.MAX_VALUE) + "\n");
                }
            }
            System.out.println("Generated random " + filename);
        }
    }
    public static void inOrder() throws IOException {
            int[] sizes = {25_000, 50_000, 75_000, 100_000};

            for (int size : sizes) {
                String filename = size / 1000 + "k_intsAscending.csv";

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                    for (int i = 0; i < size; i++) {
                        writer.write(i + "\n");  // Numbers will be 0, 1, 2, ..., size-1
                    }
                }
                System.out.println("Generated ascending " + filename);
            }
    }
    public static void reverseOrder() throws IOException {
        int[] sizes = {25_000, 50_000, 75_000, 100_000};

        for (int size : sizes) {
            String filename = size / 1000 + "k_intsDescending.csv";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (int i = 0; i < size; i++) {
                    writer.write((size - 1 - i) + "\n");  // Starts from (size-1) down to 0
                }
            }
            System.out.println("Generated descending " + filename);
        }
    }

    public static void randomBigK() throws IOException {
        int[] sizes = {25_000, 50_000, 75_000, 100_000};
        Random random = new Random();

        for (int size : sizes) {
            String filename = size / 1000 + "k_intsRandomBig.csv";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (int i = 0; i < size; i++) {
                    writer.write(random.nextInt(100_000_000) + "\n");
                }
            }
            System.out.println("Generated random " + filename);
        }
    }

    public static void randomSmallK() throws IOException {
        int[] sizes = {25_000, 50_000, 75_000, 100_000};
        Random random = new Random();

        for (int size : sizes) {
            String filename = size / 1000 + "k_intsRandomSmall.csv";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (int i = 0; i < size; i++) {
                    writer.write(random.nextInt(100_000_000) + "\n");
                }
            }
            System.out.println("Generated random " + filename);
        }
    }

    public static void evenlyPartitioned() throws IOException {
        int[] sizes = {25_000, 50_000, 75_000, 100_000};

        for (int size : sizes) {
            String filename = size / 1000 + "k_intsEvenlyPartitioned.csv";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (int i = 0; i < size; i++) {
                    // Create evenly distributed values between 0 and 100M
                    int value = (int)(((double)i / size) * size);
                    writer.write(value + "\n");
                }
            }
            System.out.println("Generated evenly partitioned " + filename);
        }
    }

    public static void alternatingElements() throws IOException {
        int[] sizes = {25_000, 50_000, 75_000, 100_000};

        for (int size : sizes) {
            String filename = size / 1000 + "k_intsAlternating.csv";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                // Create alternating low/high pattern
                for (int i = 0; i < size; i++) {
                    int value = (i % 2 == 0) ? i % 100 : size + (i % 100);
                    writer.write(value + "\n");
                }
            }
            System.out.println("Generated alternating " + filename);
        }
    }


}
