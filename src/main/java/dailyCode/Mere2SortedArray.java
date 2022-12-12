package dailyCode;

import java.util.Arrays;

public class Mere2SortedArray {
    public static void main(String[] args) {
        Mere2SortedArray mere2SortedArray = new Mere2SortedArray();
        mere2SortedArray.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                nums1 = shiftNum1(nums1, i, m);
                nums1[i] = nums2[j];
                i++;
                j++;
                m++;
            } else {
                i++;
            }
        }
        while(j<n){
            nums1[i]=nums2[j];
            i++;
            j++;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public int[] shiftNum1(int[] nums, int idx, int m) {
        int element = nums[idx];
        for (int i = idx + 1; i < nums.length; i++) {
            int val = nums[i];
            nums[i] = element;
            element = val;
        }
        return nums;
    }
}
