package practiceJava2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();
        System.out.println(maximisePackets(X,Y,A,B));
        //10 12 5 2 = 3
        //17 15 5 2 =
        /*
        *         ListNode l1n3 = new ListNode(4,null);
        ListNode l1n2 = new ListNode(2,l1n3);
        ListNode l1n1 = new ListNode(1,l1n2);

        ListNode l2n3 = new ListNode(4,null);
        ListNode l2n2 = new ListNode(3,l2n3);
        ListNode l2n1 = new ListNode(1,l2n2);
        ListNode listNode = test.mergeTwoLists(l1n1,l2n1);

        while (listNode.next!=null){
            System.out.print(listNode.val +" -> ");
            listNode=listNode.next;
        }
        System.out.print(listNode.val);
        * */
    }

    private static int maximisePackets(int x, int y, int a, int b) {
        int result = 0;
        result = (int) Math.floor((x+y)/(a+b));

        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++)
            map.put(nums[i],i);

        for (int i=0;i<nums.length;i++){
            int compliment =target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment)!=i){
                return new int[]{i,map.get(compliment)};
            }
        }
        return new int[]{-1,-1};

    }
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum=sum*26;
            sum=sum+(columnTitle.charAt(i)-'A'+1);

        }
        return sum;
    }

    public String convertToTitle(int columnNumber) {

        String columnName = "";
        int colNum = columnNumber;
        while (colNum > 26) {
            int remider = colNum % 26;
            colNum = colNum / 26;
            char c = (char) ('A' + remider - 1);
            if (remider == 0) {
                c = 'Z';
                colNum--;
            }
            columnName = c + columnName;

        }
        char c = (char) ('A' + colNum - 1);
        columnName = c + columnName;
        return columnName;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = list1;
        ListNode currL1 = list1;
        ListNode currL2 = list2;

        while (currL2.next!=null){

            if (currL1.next==null){
                currL1.next=currL2;
            }
            if (currL1.next.val < currL2.val){
                currL1=currL1.next;
            }else {
                ListNode temp = currL1.next;
                currL1.next=currL2;
                currL2=currL2.next;
                currL1.next.next=temp;
            }
        }
        if (currL2.next==null){

            if (currL1.next==null){
                currL1.next=currL2;
            }
            if (currL1.next.val < currL2.val){
                currL1=currL1.next;
            }else {
                ListNode temp = currL1.next;
                currL1.next=currL2;
                currL1.next.next=temp;
            }
        }





        return head;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public boolean isPalindrome(int x) {
        int num=x;
        int reverse = 0;
        if (num<0) return false;
        while(num/10!=0){
            reverse = reverse*10 + (num%10);
            num=num/10;

        }
        reverse = reverse*10 + (x%10);
        return reverse==x;

    }
}
