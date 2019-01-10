package leetQ55;

/**
 * Created by zhangzhongwen on 2019/1/10
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public static boolean canJump(int[] nums) {
        if (nums == null)
            return false;

        int canReach = 0;
        int cur = 0;
        while (cur < nums.length && cur <= canReach) {
            if (cur + nums[cur] > canReach)
                canReach = cur + nums[cur];
            ++cur;
        }

        return cur == nums.length;
    }
}
