package leetQ16;

import java.util.Arrays;

/**
 * 给定一个数组，找出三个数的和 和 目标数字最接近的和
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sub = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                if (Math.abs((nums[lo] + nums[hi] + nums[i] - target)) < sub) {
                    sum = nums[lo] + nums[hi] + nums[i];
                    sub = Math.abs(sum - target);
                }
                if (nums[lo] + nums[hi] + nums[i] > target) {
                    hi--;
                } else {
                    lo++;
                }
            }
        }
        return sum;
    }
}
