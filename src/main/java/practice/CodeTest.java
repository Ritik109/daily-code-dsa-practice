package practice;

public class CodeTest {


    public static void main(String[] args) {
        CodeTest codeTest = new CodeTest();
        System.out.println(codeTest.searchInsert(new int[]{1,3,4,5},2));
    }

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }


    public boolean isPalindrome(String s) {
        s=s.toLowerCase().strip().replaceAll("[^a-zA-Z0-9]","");

        System.out.println(s);
        int first=0;
        int last=s.length()-1;
        while (first<last){
            if (s.charAt(first)!=s.charAt(last))
                return false;
            first++;
            last--;
        }
        return true;
    }
    public String addBinary(String a, String b) {
        int ai = a.length()-1;
        int bi = b.length()-1;

        String result ="";
        int carry = 0;

        while(ai >= 0 || bi>=0 || carry == 1){
            int d1 = 0;
            int d2 = 0;
            int sum=0;
            if(ai>=0){
                d1 = a.charAt(ai) ;
            }
            if(bi>=0){
                d2 = b.charAt(bi) ;
            }
            sum = (d1+d2+carry)%2;
            carry = (d1+d2+carry)/2;

            result = sum + result;
            ai--;
            bi--;

        }
        return result;

    }
    public boolean isValid(String s) {
        String ob = "";

        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                ob+=s.charAt(i);
            else {
                if (ob.length()==0) return false;
                if (s.charAt(i) == ')' && ob.charAt(ob.length()-1)!='(') return false;
                else if (s.charAt(i) == ']' && ob.charAt(ob.length()-1)!='[') return false;
                else if (s.charAt(i) == '}' && ob.charAt(ob.length()-1)!='{') return false;
                else{
                    ob=ob.substring(0,ob.length()-1);
                }

            }
        }
        return ob.length()==0;

    }
}
