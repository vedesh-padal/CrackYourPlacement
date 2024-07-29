import java.util.*;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    int n = nums.length;
    List<List<Integer>> triplets = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < n; i++) {
      // if adjacent elements itself are duplicates, skip them
      if (i != 0 && nums[i] == nums[i - 1])
        continue;

      int j = i + 1;
      int k = n - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum > 0) {
          k--;
        } else if (sum < 0) {
          j++;
        } else {
          List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
          triplets.add(temp);
          j++;
          k--;

          // skip duplicates, if any:
          while (j < k && nums[j] == nums[j - 1])
            j++;
          while (j < k && nums[k] == nums[k + 1])
            k--;
        }
      }
    }
    return triplets;
  }
}