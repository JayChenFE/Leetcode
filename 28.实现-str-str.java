/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    // 将 needle（目标字符串） 依次与字符串 haystack 长度为 needle 的子串比较，
    // 完全相同则返回子串的数组下标。
    // 一个指针用于遍历，遍历次数为 haystack 多余长度 + 1；
    // 一个指针用于依次比较是否与 needle 每一个字符相同

    public int strStr(String haystack, String needle) {
        int hLen = haystack.length(), nLen = needle.length();
        for (int i = 0; i <= hLen - nLen; i++) { // 等于，适用于两者长度相等的情况下（包含都为 ""）
            int j = 0;
            for (; j < nLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == nLen) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end
