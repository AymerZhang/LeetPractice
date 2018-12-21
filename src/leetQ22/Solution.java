package leetQ22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }


    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateOneByOne("", list, n, n);
        return list;
    }

    public static void generateOneByOne(String sublist, List<String> list, int left, int right) {
        if (left > right) {
            return;
        }
        if (left > 0) {
            generateOneByOne(sublist + "(", list, left - 1, right);
        }
        if (right > 0) {
            generateOneByOne(sublist + ")", list, left, right - 1);
        }
        if (left == 0 && right == 0) {
            list.add(sublist);
            return;
        }
    }
/*    public static List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        if (n > 0) generateParenthesisCore("", n, n, result);
        return result;
    }*/

    private static void generateParenthesisCore(String prefix, int left, int right, List<String> result) {
        if (left == 0 && right == 0) result.add(prefix);
        // Has left Parenthesis
        if (left > 0) generateParenthesisCore(prefix + '(', left - 1, right, result);
        // has more right Parenthesis
        if (left < right) generateParenthesisCore(prefix + ')', left, right - 1, result);
    }
}
