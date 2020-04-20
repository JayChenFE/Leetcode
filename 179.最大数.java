import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=179 lang=java
 *
 * [179] 最大数
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {
        String result = Arrays.stream(nums).mapToObj(String::valueOf).sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.joining());

        return result.startsWith("0") ? "0" : result;

    }
}
// @lc code=end
