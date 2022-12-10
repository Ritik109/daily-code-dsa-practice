package dailyCode;

import java.util.Arrays;

public class Day1 {
    /*
     * Reverse String
     * */

    public static void main(String[] args) {

        System.out.println("Output Non Recursive : " + reverseString("My Name is Ritik"));
        System.out.println("Output Recursive : " + recursiveReverseString("Hello"));
        System.out.println("Output Swapping Char Array :  : " + reverseStringWithSwapping("Hello"));

    }

    //non-recursive | iterative approach
    public static String reverseString(String toReverse) {

        StringBuilder reversed = new StringBuilder();

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reversed.append(toReverse.charAt(i));
        }
        return reversed.toString();
    }

    // recursive approach

    public static String recursiveReverseString(String toReverse) {
        if (toReverse.length() == 1) return toReverse;
        int len = toReverse.length();
        return toReverse.charAt(len - 1) + reverseString(toReverse.substring(0, len - 1));
    }

    // swapping approach with char array

    public static String reverseStringWithSwapping(String toReverse) {
        char[] toReverseChar = toReverse.toCharArray();
        int len = toReverseChar.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = toReverseChar[i];
            toReverseChar[i] = toReverseChar[len - i - 1];
            toReverseChar[len - i - 1] = temp;
        }

        return new String(toReverseChar);
    }
}
