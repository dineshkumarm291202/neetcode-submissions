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
        ListNode mid = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            mid = mid.next;
        }
        ListNode secondHead = mid.next;
        mid.next=null;

        ListNode prev =null;
        ListNode curr =secondHead;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        secondHead = prev;
        
        // Step 4: Merge alternatively
        while (head != null && secondHead != null) {

            ListNode temp1 = head.next;
            ListNode temp2 = secondHead.next;

            head.next = secondHead;
            secondHead.next = temp1;

            head = temp1;
            secondHead = temp2;
        }

    }
}
