package leetQ29;

/**
 * Created by zhangzhongwen on 2018/12/21
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(divide(-2147483648, 1));
        System.out.println(divide(2147483647, -1));
//        System.out.println(divide(7, -3));
      /*  int test = -2147483648;
        int toggle = -test;
        System.out.println(toggle); // toggle == test;*/
    }

    public static int divide(int dividend, int divisor) {
        long ans = divide((long) dividend, (long) (divisor));
        long m = 2147483648L;
        if (ans == m) {
            return Integer.MAX_VALUE;
        } else {
            return (int) ans;
        }
    }

    public static long divide(long dividend, long divisor) {
        long ans = 1;
        long sign = 1;
        if (dividend < 0) {
            sign = opposite(sign);
            dividend = opposite(dividend);
        }
        if (divisor < 0) {
            sign = opposite(sign);
            divisor = opposite(divisor);
        }
        long origin_dividend = dividend;
        long origin_divisor = divisor;

        if (dividend < divisor) {
            return 0;
        }

        dividend -= divisor;
        while (divisor <= dividend) {
            ans = ans + ans;
            divisor += divisor;
            dividend -= divisor;
        }
        long a = ans + divide(origin_dividend - divisor, origin_divisor);
        return sign > 0 ? a : opposite(a);
    }

    public static long opposite(long x) {
        return ~x + 1;
    }
}
