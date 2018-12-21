package leetQ9;

/**
 * Integer is palindrome(回文串)
 * -101 ==> false
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(isPalindrome(-25));
        System.out.println(isPalindrome(191));
//        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        if (!Character.isDigit(sb.charAt(0))) {
            return false;
        }
        return sb.reverse().toString().equals(x + "");
    }

    //优化方案
    /*class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            if (x == 0) return true;
            if (x % 10 == 0) return false;


            int a = x, b = 0;
            while (b < a) {
                b *= 10;
                b += a % 10;
                a /= 10;
            }
            return a == b || b / 10 == a;
        }
    }*/
}
