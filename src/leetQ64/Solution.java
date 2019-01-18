package leetQ64;

/**
 * Created by zhangzhongwen on 2019/1/18
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1},
        }));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 1; i < n; i++) {
            grid[0][i] = grid[0][i] + grid[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    grid[i][0] = grid[i][0] + grid[i - 1][0];
                } else {
                    grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        return grid[m - 1][n - 1];
    }
}
