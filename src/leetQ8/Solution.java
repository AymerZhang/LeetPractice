package leetQ8;

import java.math.BigDecimal;

/**
 * String to Integer
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
//        System.out.println(myAtoi("4193 with words"));
//        System.out.println(myAtoi("words and 987"));
//        System.out.println(myAtoi("-91283472332"));
//        System.out.println(myAtoi("-"));
//        System.out.println(myAtoi("  -0012a42"));
//        System.out.println(myAtoi("20000000000000000000"));
    }

    public static int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (trim.equals("")) {
            return 0;
        }
        int start = 0, end = 0;
        boolean yet = false;
        for (int i = 0; i < trim.length(); i++) {
            if ((trim.charAt(i) == '+' || trim.charAt(i) == '-' || Character.isDigit(trim.charAt(i))) && !yet) {
                end = start = i;
                yet = true;
            }
            if (yet && !Character.isDigit(trim.charAt(i)) && start != i) {
                end = i;
                break;
            }
        }
        if (start == end) {
            end = trim.length();
        }
        if (start != 0) {
            return 0;
        }
        System.out.println("start == " + start + "  end == " + end + " trim.length() = " + trim.length());
        String substring = trim.substring(start, end);
        BigDecimal ans;
        try {
            ans = new BigDecimal(substring);
        }catch (NumberFormatException e){
            return 0;
        }
        if (ans.compareTo(new BigDecimal(0)) > 0 && ans.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        }
        if (ans.compareTo(new BigDecimal(0)) < 0 && ans.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        }
        return ans.intValue();
    }
}
