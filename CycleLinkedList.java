class  ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleLinkedList {

    public static class Solution {

        public boolean hasCycle(ListNode head) {

            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;
                fast = fast.next.next;

                if (fast == slow) {
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;

        // Creating cycle
        d.next = b;

        Solution sol = new Solution();

        System.out.println(sol.hasCycle(a));
    }
}