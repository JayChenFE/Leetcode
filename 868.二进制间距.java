/*
 * @lc app=leetcode.cn id=868 lang=java
 *
 * [868] 二进制间距
 */

// @lc code=start
class Solution {
    public int binaryGap(int N) {
        int index = -1, ans = 0;
        for (int i = 0; i < 32; ++i)
            if (((N >> i) & 1) == 1) {
                if (index >= 0) {
                    ans = Math.max(ans, i - index);
                }
                index = i;
            }

        return ans;
    }
}
// @lc code=end
