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
    public void reorderList(ListNode head) {
        ListNode a,b,d;
        
        if (head==null||head.next==null)return;
        
        while(head.next!=null){
            a=head;
            while(a.next.next!=null)
                a=a.next;
            d=a.next;
            a.next=null;
            b=head.next;
            d.next=b;
            head.next=d;
            head=b;
            if (head==null)break;
        }
        
            
    }
}
