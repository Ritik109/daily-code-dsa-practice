package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 1, 4, 9, 6, 8, 4, 6, 1};
        applyInsertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void applyInsertionSort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            int element = arr[i];
            int correctPos = i;

            while (correctPos > 0 && arr[correctPos - 1] > element) {
                arr[correctPos]=arr[correctPos-1];
                correctPos--;
            }
            arr[correctPos]=element;
        }
    }
}
