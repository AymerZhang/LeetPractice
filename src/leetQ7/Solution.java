package leetQ7;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 反转整数   123 ==>  321  -123 ==> -321
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(0));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long res = 0;
        while(x!=0){
            int tail = x%10;
            res = res * 10 + tail;
            x = x/10;
        }
        if((int)res==res)// 防止超出整型范围
            return (int) res;
        else
            return 0;

    }
}
