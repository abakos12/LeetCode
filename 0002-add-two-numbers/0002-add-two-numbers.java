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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode();
        ListNode start = head;

        int runningOver = 0;


        while(true) {
            runningOver = runningOver / 10;
            if(l1 == null && l2 == null) {
                break;
            } else if(l1 == null) {
                runningOver += l2.val;
            } else if(l2 == null) {
                runningOver += l1.val;
            } else {
                runningOver = runningOver + l1.val + l2.val;
            }

            
            
            String conversion = String.valueOf(runningOver);

            int lastDigit = Integer.parseInt(conversion.substring(conversion.length() - 1));

            runningOver -= lastDigit;
            head.val = lastDigit;

            

            if(l2 != null) {
                l2 =  l2.next;
            }
            if(l1 != null) {
                l1 = l1.next;
            }
            
            if (l2 == null && l1 == null) {
                // runningOver = runningOver / 10;
                if (runningOver >= 10) {
                    // head.val = runningOver - 10;
                    head.next = new ListNode();
                    head = head.next;
                    head.val = runningOver / 10;
                }
                break;
            }
            

            head.next = new ListNode();
            head = head.next;
            

        }

        return start;

    }
}