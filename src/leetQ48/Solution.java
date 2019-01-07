package leetQ48;

/**
 * Created by zhangzhongwen on 2019/1/7
 */
public class Solution {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotate(ints);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        //method one
//        int[][] ans = new int[matrix.length][matrix.length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                int index = matrix.length - 1 - i;
//                System.out.println("[" + i + "][" + j + "]==[" + j + "][" + index + "]");
//                System.out.println(matrix[i][j] + "==" + matrix[j][index]);
//                ans[j][index] = matrix[i][j];
//            }
//        }
//
//        System.arraycopy(ans, 0, matrix, 0, ans.length);

        // method two
        if (matrix == null || matrix[0] == null || matrix[0].length == 0) {
            return;
        }
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix.length - 1;
        int n = matrix.length;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                int temp = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom][right - i] = matrix[top + i][right];
                matrix[top + i][right] = temp;
            }

            top++;
            left++;
            right--;
            bottom--;
            n -= 2;
        }
    }
}
