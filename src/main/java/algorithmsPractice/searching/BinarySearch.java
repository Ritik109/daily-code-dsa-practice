package algorithmsPractice.searching;

import java.util.Arrays;


public class BinarySearch {

    /*
     * Binary Search is the search algorithm with time complexity of O(logn) which works with sorted array
     * we try to find the expected value in middle of the data set (array)
     * If not found and value is smaller than middle element than we search in 1st haf of the array i.e. from 0 to mid-1
     * Otherwise we try to find in 2nd half of the array i.e. mid+1 to n
     * */

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6, 7, 7, 8, 9, 0, 8, 7, 6, 54, 4, 3, 3,};
        Arrays.sort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));

        System.out.println("This is result from recursive binary search : "+recursiveBinarySearch(arr, 0, arr.length - 1, 8));
        System.out.println("This is result from non-recursive binary search : "+binarySearch(arr, 0, arr.length - 1, 8));



    }

    public static int recursiveBinarySearch(int[] arr, int low, int high, int num) {

        int mid = (low + high) / 2;

        if (low > high) return -1;
        if (arr[mid] == num) return mid;
        else if (arr[mid] > num) return recursiveBinarySearch(arr, low, mid - 1, num);
        else if (arr[mid] < num) return recursiveBinarySearch(arr, mid + 1, high, num);

        return -1;


    }

    public static int binarySearch(int[] arr, int low, int high, int num) {
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] == num) return mid;
            else if (arr[mid] > num) high = mid - 1;
            else low = mid + 1;
            mid = (low + high) / 2;
        }
        return -1;
    }
}
