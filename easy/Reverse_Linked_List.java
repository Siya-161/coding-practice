/*Intuition
To reverse a linked list, we need to reverse the direction of each node’s next pointer. 
My first thought was to use iteration and maintain a pointer to the previous node, which will help me flip the current node’s pointer 
and proceed through the list.*/

/*Approach
I initialize two pointers: prev as null and current as the head of the list. I iterate through the list while current is not null.
In each iteration:

I temporarily store the next node (current.next).

I reverse the current node’s next pointer to point to prev.

I then move prev to current and current to the next node (which was saved earlier).
This continues until we reach the end of the list, at which point prev will be the new head of the reversed list.*/

/*Complexity
Time complexity:
O(n)

Space complexity:
O(1)*/

//Code
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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode nextN = current.next;
            current.next = prev;
            prev = current;
            current = nextN;
        }
    
        return prev;
        
    }
}
