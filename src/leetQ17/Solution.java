package leetQ17;

import java.util.LinkedList;
import java.util.List;

/**
 * 根据给定字符串(包含2~9)返回对应的所有字母组合
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    //    public List<String> letterCombinations(String digits) {
//
//    }
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) { //查看队首元素
                String t = ans.remove(); //队首元素出队
                for (char s : mapping[x].toCharArray())
                    ans.add(t + s);
            }
        }
        return ans;
    }
}
