package practiceJava1;

public class LinkedList {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);

        ListNode node4 = new ListNode(4, node5);

        ListNode node3 = new ListNode(3, node4);

        ListNode node2 = new ListNode(2, node3);

        ListNode head = new ListNode(1, node2);

        LinkedList list = new LinkedList();
        list.printList(head);

        Solution sol = new Solution();
        //head = sol.reverseList(head);
        head = sol.removeElements(head, 5);

        list.printList(head);
    }

    void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " --> ");
            curr = curr.next;
        }
        System.out.print("null\n");

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;

    }


    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            if (curr.val == val) {
                if (prev == null) {
                    head = next;
                } else {
                    prev.next = next;
                }
                curr.next = null;
                curr = next;
            } else {
                prev = curr;
                curr = next;
            }

        }
        return head;

    }
}
