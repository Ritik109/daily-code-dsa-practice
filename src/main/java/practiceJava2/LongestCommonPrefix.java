package practiceJava2;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.longestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"}, 4);
    }

    String longestCommonPrefix(String arr[], int n) {
        Arrays.sort(arr);
        String longestPrefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].startsWith(longestPrefix)) {
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
                i = 1;
            }
        }
        if (longestPrefix.length()==0)
            longestPrefix="-1";
        return longestPrefix;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        String longestPrefix = strs[0];;

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(longestPrefix) != 0){
                longestPrefix=longestPrefix.substring(0,longestPrefix.length()-1);
            }
        }



        return longestPrefix;

    }

}
