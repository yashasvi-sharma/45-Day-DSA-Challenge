// Remove Duplicates from Sorted List

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

// Solution

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       ListNode temp=head;
        while(temp!=null && temp.next != null){
            ListNode nextNode=temp.next;
            while(nextNode!=null && nextNode.val==temp.val){
                nextNode=nextNode.next;
            }
            temp.next=nextNode;
            // if(nextNode!=null) nextNode.next=temp;
            temp=temp.next;
        }
       return head;
}
}