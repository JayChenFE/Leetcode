/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int rob(TreeNode root) {
        int[] result = robInternal(root);
        return Math.max(result[0], result[1]);
    }

    private int[] robInternal(TreeNode root) {
        // result[0]代表不偷root时的最大值
        // result[1]代表偷root时的最大值
        int[] result = new int[2];
        if (root == null) {
            return result;
        }

        int[] left = robInternal(root.left);
        int[] right = robInternal(root.right);

        // 前节点选择不偷：当前节点能偷到的最大钱数 = 左孩子能偷到的钱 + 右孩子能偷到的钱
        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        // 当前节点选择偷：当前节点能偷到的最大钱数 = 左孩子选择自己不偷时能得到的钱 + 
        // 右孩子选择不偷时能得到的钱 + 当前节点的钱数
        result[1] = left[0] + right[0] + root.val;

        return result;
    }

}
// @lc code=end
