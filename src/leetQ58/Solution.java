package leetQ58;

/**
 * Created by zhangzhongwen on 2019/1/10
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("a"));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split("[ //,//?//!]");
        if (words.length == 0) return 0;
        return words[words.length - 1].length();
    }
}
