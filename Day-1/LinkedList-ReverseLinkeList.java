// Reverse Linked List

// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Solution

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode front;
        ListNode temp = head;
        ListNode prev=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
