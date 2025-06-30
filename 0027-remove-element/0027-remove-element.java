class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // index for the next position to fill

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // move non-val to the front
                k++;
            }
        }
        return k;
    }
}
