package leetQ26;

public class JavaSolution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums));
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int point1 = 0;
        int point2 = 1;
        int count = 0;

        if (nums.length == 0) {
            return 0;
        }

        for (point1 = 0; point1 < nums.length - 1; point1++) {
            if (nums[point1] == nums[point2]) {
                count++;
                nums[point1] = nums[point2];
                point2++;
            } else {
                nums[point2 - count] = nums[point2];
                point2++;
            }
        }
        return nums.length - count;
    }
}
