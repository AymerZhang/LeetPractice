package leetQ5;

/**
 * 字符串找到其中最长的回文串
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s) {
        String result = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (isPalindromic(i, j, s) && j - i + 1 > maxLength) {
                    result = s.substring(i, j + 1);
                    maxLength = j - i + 1;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean isPalindromic(int l, int r, String s) {
        while (r >= l) {
            if (s.charAt(r) != s.charAt(l)) {
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
}
