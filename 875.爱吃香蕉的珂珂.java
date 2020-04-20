/*
 * @lc app=leetcode.cn id=875 lang=java
 *
 * [875] 爱吃香蕉的珂珂
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int H) {

        int left = 0;
        int right = getMax(piles);

        while (left < right) {
            int middle = left + (right - left) >> 1;
            if (canEat(piles, H, middle)) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return left;

    }

    private int getMax(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private boolean canEat(int[] piles, int H, int speed) {
        int total = 0;
        for (int pile : piles) {
            total += (pile + speed - 1) / speed;
        }
        return total >= H;
    }

}
// @lc code=end
