package leetQ36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangzhongwen on 2018/12/28
 */
public class Solution {
    public static void main(String[] args) {

        char[][] chars = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {
                '.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {
                '4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {
                '.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(chars));
    }


    public static boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i / 3 + '-' + j / 3))
                        return false;
            }
        }
        return true;
    }

    private static boolean check(char[] group) {
        ArrayList<Character> list = new ArrayList<>();
        boolean isAllDot = true;
        for (char i :
                group) {
            if (i != '.') {
                if (list.contains(i)) {
                    return false;
                } else {
                    list.add(i);
                }
            } else {
                isAllDot = false;
            }
        }
        return !isAllDot;
    }
}
