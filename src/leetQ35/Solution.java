package leetQ35;

/**
 * Created by zhangzhongwen on 2018/12/27
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 9}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0));
        System.out.println(searchInsert(new int[]{1}, 1));
        System.out.println(searchInsert(new int[]{1, 3, 5}, 4));
    }

    public static int searchInsert(int[] nums, int target) {
        int i =0;
        if(nums[0] == target)
            return 0;

        if(target < nums[0])
            return 0;
        for(i =1; i<nums.length; ++i)
        {
            if(nums[i] == target)
                return i;
            else if(nums[i] > target && nums[i-1] < target)
                return i;
        }

        return i;
    }
}
