import java.util.*;

public class MergeSortComparison {
    public static void main(String[] args) {
        int[] data = loadFromFile("aula2.txt");

        int[] mergeSortData = Arrays.copyOf(data, data.length);

        long mergeSortStartTime = System.nanoTime();
        mergeSort(mergeSortData);
        long mergeSortEndTime = System.nanoTime();
        long mergeSortDuration = mergeSortEndTime - mergeSortStartTime;

        String results = String.format("Merge Sort: %s", formatDuration(mergeSortDuration));
        System.out.println(results);
        saveResultsToPDF(results, "merge_sort_results.pdf");
    }

    public static void mergeSort(int[] arr) {
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
