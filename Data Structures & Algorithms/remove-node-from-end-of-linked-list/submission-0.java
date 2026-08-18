class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Reverse the list
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Now prev is the head of reversed list
        ListNode reversedHead = prev;

        // If we need to remove the head of reversed list
        if (n == 1) {
            reversedHead = reversedHead.next;
        } else {

            ListNode temp = reversedHead;
            ListNode temp1 = null;

            int i = 1;

            while (i < n) {
                temp1 = temp;
                temp = temp.next;
                i++;
            }

            // Remove temp
            temp1.next = temp.next;
        }

        // Reverse again
        prev = null;
        curr = reversedHead;

        while (curr != null) {
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}