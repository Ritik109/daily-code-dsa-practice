package algorithmsPractice.sorting;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 1, 4, 9, 6, 8, 4, 6, 1};
        applyBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void applyBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //comparing & swapping adjecent element bubbling
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
