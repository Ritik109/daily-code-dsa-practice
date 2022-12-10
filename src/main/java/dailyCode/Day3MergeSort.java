package dailyCode;

import java.util.Arrays;

public class Day3MergeSort {

    public static void main(String[] args) {
        int[] arr = {11, 4, 5, 6, 2, 3, 4, 8, 6, 0, 13, 11};
        mergeSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int n) {
        if(n<2) return;

        int mid = n/2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[n-mid];
        for (int i=0;i<mid;i++) leftArr[i]=arr[i];
        for (int i=mid;i<n;i++) rightArr[i-mid]=arr[i];
        mergeSort(leftArr,mid);
        mergeSort(rightArr,n-mid);
        merge(arr,leftArr,rightArr,mid,n-mid);


    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr, int l, int r) {

        int i=0;
        int j=0;
        int k=0;

        while (i < l && j < r){
            if (leftArr[i] <= rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while (i < l){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while (j < r){
            arr[k]=rightArr[j];
            j++;
            k++;
        }


    }

}
