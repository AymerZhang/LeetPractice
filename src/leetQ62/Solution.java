package leetQ62;

/**
 * Created by zhangzhongwen on 2019/1/13
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
        System.out.println(uniquePaths(7, 3));
    }

    public static int uniquePaths(int m, int n) {
        int[][] count = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count[i][j] = -1;
            }
        }

        return uniquePathsHelper(m - 1, n - 1, count);
    }

    private static int uniquePathsHelper(int m, int n, int[][] count) {
        if (m == 0 && n == 0) {
            return 1;
        }
        if (m < 0 || n < 0) {
            return 0;
        }

        if (count[m][n] == -1) {
            count[m][n] = uniquePathsHelper(m - 1, n, count) + uniquePathsHelper(m, n - 1, count);
        }
        return count[m][n];
    }
}
