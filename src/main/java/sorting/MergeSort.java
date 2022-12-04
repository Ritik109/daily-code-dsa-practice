package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 1, 4, 9, 6, 8, 4, 6, 1};
        applyMergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void applyMergeSort(int[] arr,int n) {
        if (n < 2) return;

        int mid = n / 2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];

        for(int i=0;i<mid;i++){
            leftArr[i]=arr[i];
        }
        for(int i=mid;i<n;i++){
            rightArr[i-mid]=arr[i];
        }
        applyMergeSort(leftArr,mid);
        applyMergeSort(rightArr,n-mid);
        merge(arr,leftArr, rightArr, mid,n-mid);


    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int l,int r ) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l && j < r) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < r) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
