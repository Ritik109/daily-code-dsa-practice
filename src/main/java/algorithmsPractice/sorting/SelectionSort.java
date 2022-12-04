package algorithmsPractice.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 1, 4, 9, 6, 8, 4, 6, 1};
        applySelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void applySelectionSort(int[] arr) {

        int minEleIdx;
        int idx = 0;
        for (int j = 0; j < arr.length; j++) {
            minEleIdx = j;
            //finding minimum and placing it in sorted array
            for (int i = j; i < arr.length; i++) {
                if (arr[minEleIdx] > arr[i]) {
                    minEleIdx = i;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[minEleIdx];
            arr[minEleIdx] = temp;
            idx++;
        }
    }


}
