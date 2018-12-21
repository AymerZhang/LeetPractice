package leetQ27;

/**
 * Created by zhangzhongwen on 2018/12/19
 */
public class Solution {
    public static void main(String[] args) {
        int[] array;
        System.out.println(removeElement(array = new int[]{2, 2, 2, 3}, 2));
        for (int i :
                array) {
            System.out.println(i);
        }
    }

    private static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int other = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (other != i) {
//                    int temp = nums[i];
//                    nums[i] = nums[other];
//                    nums[other] = temp;
                    nums[other] = nums[i];
                }
                other++;
            }
        }
        return other;
    }
}
