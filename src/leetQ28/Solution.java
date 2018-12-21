package leetQ28;

/**
 * Created by zhangzhongwen on 2018/12/19
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(strStr("aaaaa","bba"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        int head = 0;
        int end = needle.length();
        while (end <= haystack.length()) {
            if (haystack.substring(head, end).equals(needle)) {
                return head;
            }
            head++;
            end++;
        }
        return -1;
    }
}
