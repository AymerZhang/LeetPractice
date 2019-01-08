package leetQ50;

/**
 * Created by zhangzhongwen on 2019/1/8
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
    }

    public static double myPow(double x, int n) {
//        if (n == 0) return 1.0;
//        double d = myPow(x, n / 2);
//        if (n % 2 == 0) return d * d;
//        if (n < 0) return d * d * (1 / x);
//        return d * d * x;

        if(n == 0){
            return 1;
        }

        double result = 1;
        int power = Math.abs(n);

        if(power == Integer.MIN_VALUE){
            power = Integer.MAX_VALUE;
            result = x;
        }

        double multiple = x;
        while(power > 0){
            if((power & 1) != 0){
                result *= multiple;
            }

            multiple *= multiple;
            power >>= 1;
        }

        return n > 0? result: 1.0 / result;
    }
}
