package leetQ63;

/**
 * Created by zhangzhongwen on 2019/1/17
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        }));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int h=obstacleGrid.length;
        int w=obstacleGrid[0].length;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(i==0&&j==0 && obstacleGrid[i][j]!=1){
                    obstacleGrid[i][j]=1;
                }else if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                }else if(i==0){
                    obstacleGrid[i][j]=obstacleGrid[i][j-1];
                }else if(j==0){
                    obstacleGrid[i][j]=obstacleGrid[i-1][j];
                }else{
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[h-1][w-1];
    }
}
