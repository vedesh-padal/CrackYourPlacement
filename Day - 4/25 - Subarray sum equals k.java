/*
  Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

  A subarray is a contiguous non-empty sequence of elements within an array.

  Example 1:

  Input: nums = [1,1,1], k = 2
  Output: 2
  Example 2:

  Input: nums = [1,2,3], k = 3
  Output: 2
 */


import java.util.HashMap;

class Solution {
  public int subarraySum(int[] nums, int k) {
    int n = nums.length;

    // // Approach - 1: 2 pointer method
    // int l = 0, r = 0;
    // int sum = nums[0];
    // int count = 0;  // to keep track of the subarrays of sum = k
    // // int maxLen = 0;
    // while (r < n)   {
    //     if (l <= r && sum > k)   {
    //         sum -= nums[l];
    //         l++;
    //     }
    //     if (sum == k)   {
    //         count++;
    //         // if the problem is about finding the maxLen of such subarray:
    //         // maxLen = Math.max(maxLen, r - l + 1);
    //     }

    //     r++;
    //     if (r < n && sum < k)
    //         sum += nums[r];
    // }
    // return count;

    // Approach - 2: prefix sum:
    int sum = 0, count = 0;
    HashMap<Integer, Integer> hmap = new HashMap<>();
    hmap.put(0, 1); // for the cases, when you have sum == k, and it should be considered,
    // and no. of those subarrays should also be counted

    for (int i = 0; i < n; i++) {
      sum += nums[i];
      if (hmap.containsKey(sum - k))
        count += hmap.get(sum - k);

      hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
    }
    return count;
  }
}