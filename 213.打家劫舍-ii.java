import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int max1 = rob198(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int max2 = rob198(Arrays.copyOfRange(nums, 1, nums.length));
        return Math.max(max1, max2);
    }

    public int rob198(int[] nums) {
        // f(1)=nums[1]
        // f(2)=max(nums[1],nums[2])
        // f(n)=max(nums[n]+f(n-2),f(n-1))
        int prevMax = 0;
        int currMax = 0;
        for (int x : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;

    }
}
// @lc code=end
