package cs2720.showcases;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println("Insertion Sort Class is running...");
    } // main

    // Method for Insertion-sort of an array of chars into ascending order.
    public static void insertionSortAlgorithm(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {
            char cur = data[k];
            int j = k;
            while (j > 0 && data[j - 1] > cur) {
                data[j] = data[j - 1];
                j--;
            } // while
            data[j] = cur;
        } // for
    } // InsertionSort
}