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
        ListNode curr;
        curr=head;
        int length=1;
        while(curr.next!=null){
            curr=curr.next;
            length++;
        }
        curr=head;
        if (length==n){
            head=head.next;
            return head;
        }
        
        for (int c=1;c<length-n;c++){
            curr=curr.next;
        }
            curr.next=curr.next.next;
        
        return head;
    }
}
