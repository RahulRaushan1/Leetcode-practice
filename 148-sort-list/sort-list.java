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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        // finding mid
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;

        }

        ListNode rightHead=slow.next;
        slow.next=null;

        head = sortList(head);
        rightHead = sortList(rightHead);

        ListNode merge= merge(head,rightHead);
        return merge;

        
    }
    private ListNode merge(ListNode left, ListNode right){
        ListNode temp = new ListNode(-1);
        ListNode res = temp ;

        while(left!=null && right!=null){
            if(left.val <= right.val ){
                temp.next = left;
                left= left.next;
            }
            else{
                temp.next = right;
                right = right.next;
            }
            temp=temp.next;
        }
        while(left!=null){
            temp.next = left;
            left=left.next;
            temp = temp.next;
        }
        while(right!=null){
            temp.next = right;
            right=right.next;
            temp = temp.next;
        }
        return res.next;
    }
}