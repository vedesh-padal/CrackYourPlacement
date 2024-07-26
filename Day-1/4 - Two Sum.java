import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] indices = new int[2];
    indices[0] = indices[1] = -1;

    HashMap<Integer, Integer> hmap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (hmap.containsKey(diff)) {
        indices[0] = hmap.get(diff);
        indices[1] = i;
      }
      hmap.put(nums[i], i);
    }

    return indices;
  }
}