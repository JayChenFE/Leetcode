/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {

        // 用三个指针
        // p0追踪0的最右边界
        // p2 2的最左边界
        // curr 当前考虑的元素

        // 初始化
        int p0 = 0, curr = 0, p2 = nums.length - 1;

        int tmp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                // 若nums[curr] = 0，则将其与 nums[p0]互换
                // 因为curr左边的值已经扫描过了，所以curr要++继续扫描下一位，
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            } else if (nums[curr] == 2) {
                // 若 nums[curr] = 2,
                // 则与 nums[p2]互换
                // 与p2交换的值，curr未扫描，要停下来扫描一下，所以curr不用++
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            } else
                curr++;
        }

    }
}
// @lc code=end
