/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode cur = head;
        ListNode reverse = null;

        while (cur != null) {

            if (cur == head) {
                reverse = new ListNode(cur.val);
            } else {
                reverse = new ListNode(cur.val, reverse);
            }

            cur = cur.next;
        }
        
        return reverse;
    }
}
