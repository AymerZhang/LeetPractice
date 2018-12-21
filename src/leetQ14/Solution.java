package leetQ14;

/**
 * Longest Common Prefix 最长的公共前缀
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"123","1234","123"}));
        System.out.println(longestCommonPrefix(new String[]{"a","aaaaaaa","a"}));
        System.out.println(longestCommonPrefix(new String[]{"","",""}));
        System.out.println(longestCommonPrefix(new String[]{"abcdefg","a",""}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder ans = new StringBuilder();
        int index = 0;
        Loop:
        while (true) {
            StringBuilder temp = new StringBuilder();
            for (String str : strs) {
                if (str.length() > index) {
                    temp.append(str.charAt(index));
                } else {
                    break Loop;
                }
            }
            for (int i = 1; i < temp.length(); i++) {
                if (temp.charAt(i) != temp.charAt(i - 1)) {
                    break Loop;
                }
            }
            ans.append(temp.charAt(0));
            index++;
        }
        return ans.toString();
    }
}
