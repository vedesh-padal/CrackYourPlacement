class Solution {
  public int findDuplicate(int[] nums) {

    // tortoise and haire method since there is a duplicate, the slow and the fast
    // pointers are bound to meet
    int slow = nums[0];
    int fast = nums[0];

    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);

    fast = nums[0]; // once the intersection is found, reset the fast pointer
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }

    return slow; // since now, slow and fast values are same and they are the intersecting / repeating number
  }
}