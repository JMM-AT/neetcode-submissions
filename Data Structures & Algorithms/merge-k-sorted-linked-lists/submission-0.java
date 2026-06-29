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
    public ListNode mergeKLists(ListNode[] lists) {
        int siz_e=lists.length,index=-1;
        double min;
        boolean isNotEmpty;
        ListNode listeRes,head=new ListNode(0);
        listeRes=head;
        
        if(siz_e == 0)
            return null;
        
        while (true){
            isNotEmpty=false;
            for (int i =0;i<siz_e;i++){
                if (lists[i]!=null){
                    isNotEmpty=true;
                }
            }
            if (!isNotEmpty)
                break;
            
            if (lists[0]!=null){
                min=lists[0].val;
                index=0;
            }else 
                min=Integer.MAX_VALUE;

            for (int i=1;i<siz_e;i++){
                if(lists[i]!=null && lists[i].val<min){
                    min=lists[i].val;
                    index=i;
                }
            }
            head.next=lists[index];
            head=head.next;
            lists[index]=lists[index].next;
        }
        return listeRes.next;
    }
}
