import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i : stones) {
            pq.offer(i);
        }

        while (pq.size() >= 2) {

            int x = pq.poll();
            int y = pq.poll();
            if (x != y)
                pq.offer(x - y);
        }
        return pq.isEmpty() ? 0 : pq.peek();

    }
}
// @lc code=end
