package leetQ34;

/**
 * Created by zhangzhongwen on 2018/12/26
 */
public class Solution {
    public static void main(String[] args) {
        int[] range = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println(range[0] + "==" + range[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        if (n == 0) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int l = 0, r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        int leftMatch;
        if (l == n || nums[l] != target) {
            leftMatch = -1;
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        } else {
            leftMatch = l;
        }

        r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] > target) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        int rightMatch;
        if (l > 0 && l <= n && nums[l - 1] == target) {
            rightMatch = l - 1;
        } else {
            rightMatch = -1;
        }

        ans[0] = leftMatch;
        ans[1] = rightMatch;
        return ans;
    }
}
