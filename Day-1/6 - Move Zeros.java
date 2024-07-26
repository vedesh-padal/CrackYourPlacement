class Solution {
  public void moveZeroes(int[] nums) {
    int j = -1; // initially used to find the index of the first 0 in the array
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        j = i;
        break;
      }
    }

    if (j == -1)
      return; // that means all are non-zero numbers in the array

    for (int i = j + 1; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[j++] = nums[i];
        nums[i] = 0;
      }
    }

    // using j we kept track of the last non-zero number in the array
  }
}