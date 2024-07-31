/*
  Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

  You must write an algorithm that runs in O(n) time and uses only constant extra space.

  Example 1:

  Input: nums = [4,3,2,7,8,2,3,1]
  Output: [2,3]
  Example 2:

  Input: nums = [1,1,2]
  Output: [1]
  Example 3:

  Input: nums = [1]
  Output: []
*/
import java.util.List;
import java.util.ArrayList;

class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int index = Math.abs(nums[i]) - 1;
      // that means that this number appeared for the 2nd time
      if (nums[index] < 0)
        ans.add(Math.abs(index + 1));
      nums[index] = -nums[index];
    }

    return ans;
  }
}