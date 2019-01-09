package leetQ54;

import java.util.ArrayList;
import java.util.List;

/**
 * The solution of python only one line
 * def spiralOrder(self, matrix):
 *     return matrix and [*matrix.pop(0)] + self.spiralOrder([*zip(*matrix)][::-1])
 */

/**
 * Created by zhangzhongwen on 2019/1/9
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> ans = (ArrayList<Integer>) spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}});
        System.out.println(ans);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int i = 0, j = 0;
        // 0:right 1:bottom 2:left 3:top
        int current = 0;
        ans.add(matrix[i][j]);
        while (true) {
            if (left > right || bottom < top) {
                break;
            }
            switch (current) {
                case 0:
                    if (j < right) {
                        j++;
                        ans.add(matrix[i][j]);
                    } else {
                        top++;
                        current++;
                    }
                    break;
                case 1:
                    if (i < bottom) {
                        i++;
                        ans.add(matrix[i][j]);
                    } else {
                        right--;
                        current++;
                    }
                    break;
                case 2:
                    if (j > left) {
                        j--;
                        ans.add(matrix[i][j]);
                    } else {
                        bottom--;
                        current++;
                    }
                    break;
                case 3:
                    if (i > top) {
                        i--;
                        ans.add(matrix[i][j]);
                    } else {
                        left++;
                        current = 0;
                    }
                    break;
            }
        }
        return ans;
    }
}
