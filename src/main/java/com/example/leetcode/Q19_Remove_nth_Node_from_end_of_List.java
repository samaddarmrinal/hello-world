package com.example.leetcode;

public class Q19_Remove_nth_Node_from_end_of_List {

    //Given the head of a linked list, remove the nᵗʰ node from the end of the list
//and return its head.
//
//
// Example 1:
//
//
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
//
//
// Example 2:
//
//
//Input: head = [1], n = 1
//Output: []
//
//
// Example 3:
//
//
//Input: head = [1,2], n = 1
//Output: [1]
//
//
//
// Constraints:
//
//
// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
//
//
//
// Follow up: Could you do this in one pass?
//
// Related Topics Linked List Two Pointers 👍 18256 👎 768


//leetcode submit region begin(Prohibit modification and deletion)


    /**
     * Definition for singly-linked list.*/
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
       /* int start=1;
        int end=1;
        ListNode a=head;
        ListNode z= head;

        if(head.next==null && n==1){
            return null;
        }

        do{
            if(end-start==n){
                start++;
                a=a.next;
            }
            z=z.next;
            end++;
        }while(z!=null);*/

            ListNode dummy_head = new ListNode(0);
            dummy_head.next=head;
            ListNode slow = dummy_head;
            ListNode fast = dummy_head;

            for (int i =1;i<=n+1;i++)
            {
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next = slow.next.next;
            return dummy_head.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
