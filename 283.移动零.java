/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {

        int pos = 0;
        // 将不是0的左移
        for (int num : nums) {
            if (num != 0) {
                nums[pos++] = num;
            }
        }

        // 最后的位置补0
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }
}
// @lc code=end
