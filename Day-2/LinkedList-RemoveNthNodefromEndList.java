// Remove Nth Node from End List

// Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Solution

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;

        for (int i=0;i<n+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}