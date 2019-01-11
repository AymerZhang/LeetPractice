package leetQ60;

/**
 * Created by zhangzhongwen on 2019/1/11
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
        System.out.println(getPermutation(4, 9));
    }

    private static int calFactorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }

        return ans;
    }

    public static String getPermutation(int n, int k) {
        StringBuilder ans = new StringBuilder("");
        int num = k;
        StringBuilder s = new StringBuilder("");
        int factorial = calFactorial(n);

        for (int i = 1; i <= n; i++) {
            s.append(i);
        }

        for (int i = n; i >= 1; i--) {
            factorial /= i;
            int index = (num - 1) / factorial;

            String tmp = "" + s.charAt(index);
            ans.append(tmp);
            num -= index * factorial;
            s = s.deleteCharAt(index);
        }

        return ans.toString();
    }
}
