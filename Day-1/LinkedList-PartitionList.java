// Partition List

// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
// You should preserve the original relative order of the nodes in each of the two partitions.

// Solution

class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head==null) return null;
        ListNode small=new ListNode(0);
        ListNode large=new ListNode(0);
        ListNode smallp=small;
        ListNode largep=large;
        while(head!=null){
            if(head.val < x){
                smallp.next=head;
                smallp=head;
            }
            else{
                largep.next=head;
                largep=head;
            }
            head=head.next;
        }
        
        largep.next=null;
        smallp.next=large.next;
        head=small.next;
        return small.next;
    }
}