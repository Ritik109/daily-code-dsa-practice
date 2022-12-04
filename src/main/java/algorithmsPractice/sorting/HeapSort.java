package algorithmsPractice.sorting;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 1, 4, 9, 6, 8, 4, 6, 1};
        heapSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int a[], int n) {
        buildHeap(a, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            heapify(a, i, 0);
        }


    }

    public static void buildHeap(int a[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
    }

    public static void heapify(int[] a, int n, int i) {

        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && a[l] > a[largest]) {
            largest = l;
        }
        if (r < n && a[r] > a[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, n, largest);

        }

    }
}
