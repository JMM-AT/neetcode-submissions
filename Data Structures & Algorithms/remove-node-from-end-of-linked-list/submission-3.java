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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l_ist=new ListNode(0);
        l_ist.next=head;
        ListNode fast,slow;
        fast=slow=l_ist;
        for (int i=0;i<=n;i++)
            fast=fast.next;
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return l_ist.next;
    }
}
