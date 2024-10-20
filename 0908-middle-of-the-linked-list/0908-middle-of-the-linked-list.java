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
    public ListNode middleNode(ListNode head) {
        ListNode middle = new ListNode();
        middle = head;
        int moved = 0;
        while(head.next != null) {
            if (moved == 0) {
                middle = middle.next;
                moved = 1;
            } else {
                moved = 0;
            }
            head = head.next;
        }

        return middle;
    }
}