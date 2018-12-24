package leetQ33;

/**
 * Created by zhangzhongwen on 2018/12/24
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 8, 9, 0, 1, 2, 4, 5, 6};
        System.out.println(search(nums, 0));

    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        //找出最小值的数组下标
   /* while (start < end) {
        int mid = (start + end) / 2;
        if (nums[mid] > nums[end]) {
            start = mid + 1  ;
        } else {
            end = mid;
        }
    }
    int bias = start;*/
        //找出最大值的数组下标
        while (start < end) {
            int mid = Math.round(((float) start + end) / 2);
            if (nums[mid] < nums[start]) {
                end = mid - 1;
            } else {
                start = mid;
            }

        }
        int n = nums.length;
        int bias = (start + n) - (n - 1); //得到偏移
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;//中间的位置
            int mid_change = (mid + bias) % nums.length;//中间的位置对应的数组下标
            int value = nums[mid_change];//中间位置的值
            if (target == value) {
                return mid_change;
            }
            if (target < value) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
