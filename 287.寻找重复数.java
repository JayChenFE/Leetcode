/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    // 这个数组当做一个存在环的单链表，利用快慢指针法来寻找链表的环
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            if (slow == nums[slow]) {
                return slow;
            }
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while (fast != slow) {
            if (slow == nums[slow]) {
                return slow;
            }
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }
}
// @lc code=end
