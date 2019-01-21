package leetQ66;

/**
 * Created by zhangzhongwen on 2019/1/21
 */
public class Solution {
    public static void main(String[] args) {
        int[] ans = plusOne(new int[]{1, 2, 3});
        for (int a :
                ans) {
            System.out.println(a);
        }
    }


    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
