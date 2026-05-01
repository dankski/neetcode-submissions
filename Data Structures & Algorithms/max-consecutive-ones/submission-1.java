class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current_max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                current_max++;
            } else {
                current_max = 0;
            }

            if (current_max > max) {
                max = current_max;
            }
        }

        return max;
    }

}