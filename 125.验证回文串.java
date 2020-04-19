/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        char head, tail;
        while (i < j) {
            head = s.charAt(i);
            tail = s.charAt(j);
            if (!Character.isLetterOrDigit(head)) {
                i++;
                continue;

            }
            if (!Character.isLetterOrDigit(tail)) {
                j--;
                continue;

            }

            if (Character.toLowerCase(head) != Character.toLowerCase(tail)) {

                return false;
            }
            i++;
            j--;

        }

        return true;

    }
}
// @lc code=end
