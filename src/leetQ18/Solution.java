package leetQ18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 4 sum
 */
public class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        //多加了层循环
        for (int j = 0; j < nums.length - 3; j++) {
            //防止重复的
            if (j == 0 || (j > 0 && nums[j] != nums[j - 1]))
                for (int i = j + 1; i < nums.length - 2; i++) {
                    //防止重复的，不再是 i == 0 ，因为 i 从 j + 1 开始
                    if (i == j + 1 || nums[i] != nums[i - 1]) {
                        int lo = i + 1, hi = nums.length - 1, sum = target - nums[j] - nums[i];
                        while (lo < hi) {
                            if (nums[lo] + nums[hi] == sum) {
                                res.add(Arrays.asList(nums[j], nums[i], nums[lo], nums[hi]));
                                while (lo < hi && nums[lo] == nums[lo + 1])
                                    lo++;
                                while (lo < hi && nums[hi] == nums[hi - 1])
                                    hi--;
                                lo++;
                                hi--;
                            } else if (nums[lo] + nums[hi] < sum)
                                lo++;
                            else
                                hi--;
                        }
                    }
                }
        }
        return res;
    }
}
