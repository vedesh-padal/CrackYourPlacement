/*
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null)
      return head;

    ListNode curr = head;
    while (curr != null) {
      while (curr.next != null && curr.val == curr.next.val) {
        curr.next = curr.next.next; // skip the duplicates
      }
      curr = curr.next;
    }
    return head;
  }
}