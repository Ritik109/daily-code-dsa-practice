package algorithmsPractice.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 1, 4, 9, 6, 8, 4, 6, 1};
        quickSort(arr, 0, 10);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] a, int start, int end) {

        if (start < end) {
            int partitionIndex = partition(a, start, end);
            quickSort(a, start, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, end);

        }

    }

    private static int partition(int[] a, int start, int end) {
        //if (start < end) {
        int pivot = a[end];
        int partIdx = start;
        while (start <= end - 1) {
            if (a[start] < pivot) {
                swap(a,partIdx,start);
                partIdx++;
            }
            start++;
        }

        swap(a,partIdx,end);
        return partIdx;
    }
    // }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
