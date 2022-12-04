package practice1;

import javax.sound.midi.MidiFileFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MinimumSubArrayWithSumGreaterThan {

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(a,6,50));

        int[] a1 = new int[]{1, 10, 5, 2, 7};
        System.out.println(smallestSubWithSum(a1,5,9));

        ArrayList arr = new ArrayList<>();
        arr.add("ABC");
        arr.add(true);
        arr.add("NJA");
        System.out.println(arr);
    }

    // n^2 solution
    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here
        int len=n+1;
        for (int start=0;start<n;start++){
            int sum=a[start];
            if (sum > x) return 1;

            for (int end=start+1;end<n;end++){
                     sum+=a[end];
                     if (sum > x && (end - start +1 )<len){
                         len=(end - start + 1);
                     }
            }
        }
        return len;
    }

    // n^2 solution
    public static int smallestSubWithSum2(int a[], int n, int x) {
        // Your code goes here
        int len=n+1;
        return 0;
   
    }


    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(frequency.containsKey(arr[i])){
                frequency.put(arr[i],frequency.get(arr[i])+1 );
            }
            else {
                frequency.put(arr[i],1 );

            }
        }

        List<Integer> a = frequency.values().stream().sorted().collect(Collectors.toList());
        System.out.println(a);
        int count=0;
        for (int i=0;i<a.size();i++){
            if (a.get(i) > k) return a.size();
            if (a.get(i) == k) return a.size()-1;
            if (a.get(i) < k){
                
            }
        }
return 1;
    }
}
