package CodeTest;


import java.util.Arrays;

public class CodeTest {

    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,7,7,8,9,0,8,7,6,54,4,3,3,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(
                binarySearch(arr,0,arr.length-1,88)
        );


    }

    public static int binarySearch(int[] arr, int low, int high,int num){

        int mid = (low+high)/2  ;

        if (low > high) return -1;
        if (arr[mid]==num) return mid;
        else if (arr[mid] > num) return binarySearch(arr,low,mid-1,num);
        else if( arr[mid] < num) return binarySearch(arr,mid+1,high,num);

        return -1;


    }



}
