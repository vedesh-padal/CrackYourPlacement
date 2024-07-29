/*
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. 
  The linked list holds the binary representation of a number.

  Return the decimal value of the number in the linked list.

  The most significant bit is at the head of the linked list.
 */

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {

  // if head is pointing to MSB
  public int getDecimalValue(ListNode head) {
    int sum = 0;
    while (head != null)  {
      sum *= 2;
      sum += head.val;
      head = head.next;
    }
    return sum;
  }


  // if head is pointing to the LSB

  private int pow(int n)  {
    int ans = 1;
    for (int i=1; i <= n; i++) {
      ans *= 2;
    }
    return ans;
  }

  public int getDecimalValue2(ListNode head)  {
    ListNode temp = head;
    int count = 0;
    while (temp != null)  {
      count++;
    }
    count--;  // decrement count to use it as an index

    int ans = 0;
    temp = head;
    while (count >= 0)  {
      if (temp.val == 1)  {
        ans += pow(count);
      }
      temp = temp.next;
      count--;
    }
    return ans; // return the final decimal value
  }
}