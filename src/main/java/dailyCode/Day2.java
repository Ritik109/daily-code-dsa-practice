package dailyCode;

public class Day2 {

    /*
     * Palindrome
     * */

    public static void main(String[] args) {
        System.out.println(checkPalindrome("racecar"));
        System.out.println(checkPalindrome(null));
        System.out.println(checkPalindrome("Abc"));



    }

    static boolean checkPalindrome(String toCheck) {

        if (toCheck == null) return false;
        int len = toCheck.length();
        for (int i = 0; i < len / 2; i++) {
            if (toCheck.charAt(i) != toCheck.charAt(len - i - 1)) return false;
        }
        return true;

    }
}
