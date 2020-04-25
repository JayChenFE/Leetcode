/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {

    public int rob(int[] nums) {
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
