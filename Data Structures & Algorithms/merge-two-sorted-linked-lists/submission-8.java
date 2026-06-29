/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        
 }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listS=new ListNode();
        ListNode listRes=listS;
        ListNode cur1=list1;
        ListNode cur2=list2;
        while(cur1!=null && cur2!=null){
            if(cur1.val>cur2.val){
            listRes.next=new ListNode(cur2.val);
                cur2=cur2.next;
            }
            else{
            listRes.next=new ListNode(cur1.val);
                cur1=cur1.next;
            }
            listRes=listRes.next;
        }
        while(cur1!=null){
            listRes.next=new ListNode(cur1.val);
            listRes=listRes.next;
            cur1=cur1.next;
        }
        while(cur2!=null){
            listRes.next=new ListNode(cur2.val);
            listRes=listRes.next;
            cur2=cur2.next;
        }
        return listS.next;
    }
}