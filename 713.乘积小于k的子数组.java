/*
 * @lc app=leetcode.cn id=713 lang=java
 *
 * [713] 乘积小于K的子数组
 */

// @lc code=start
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int res = 0, prod = 1, left = 0;

        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];

            while (prod >= k && left <= right) {
                prod /= nums[left++];
            }

            if (prod < k) {
                res += right - left + 1;
            }
        }

        return res;

    }
}
// @lc code=end
