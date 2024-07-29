class Node {
  int data;
  Node next;
  Node(int val) { this.data = val; }
}

class Solution {
  static void sortList(Node head) {
    int[] count = { 0, 0, 0 };

    // Count the number of 0's, 1's, and 2's in the linked list
    Node current = head;
    while (current != null) {
      count[current.data]++;
      current = current.next;
    }

    // Overwrite the linked list with the sorted elements
    current = head;
    int i = 0;
    while (current != null) {
      if (count[i] == 0) {
        i++;
      } else {
        current.data = i;
        count[i]--;
        current = current.next;
      }
    }
  }
}