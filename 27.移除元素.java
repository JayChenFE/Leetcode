/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {

        int pos = 0;
        // 将不是val的左移
        for (int num : nums) {
            if (num != val) {
                nums[pos++] = num;
            }
        }

        return pos;
    }
}
// @lc code=end
