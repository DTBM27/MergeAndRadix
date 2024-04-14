import java.util.*;

public class RadixSortComparison {
    public static void main(String[] args) {
        int[] data = loadFromFile("aula2.txt");

        int[] radixSortData = Arrays.copyOf(data, data.length);

        long radixSortStartTime = System.nanoTime();
        radixSort(radixSortData);
        long radixSortEndTime = System.nanoTime();
        long radixSortDuration = radixSortEndTime - radixSortStartTime;

        String results = String.format("Radix Sort: %s", formatDuration(radixSortDuration));
        System.out.println(results);
        saveResultsToPDF(results, "radix_sort_results.pdf");
    }

    public static void radixSort(int[] arr) {
    }

    public static int[] loadFromFile(String filename) {
        return new int[0];
    }

    public static String formatDuration(long nanoseconds) {
        return "00:00:00:00";
    }

    public static void saveResultsToPDF(String results, String filename) {
    }
}
