package leetQ15;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 找出所有相加等于零的组  三个数为一组
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);//从小到大排序
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, num = 0 - nums[i];
                while (lo < hi) {
                    if (num == nums[lo] + nums[hi]) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < num) lo++;
                    else hi--;
                }
            }
        }

        return res;
    }
}
