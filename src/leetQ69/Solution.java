package leetQ69;

/**
 * Created by zhangzhongwen on 2019/1/24
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }

    public static int mySqrt(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
}
