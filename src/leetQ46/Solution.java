package leetQ46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhangzhongwen on 2019/1/2
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        //convert int array to list
        //src: https://stackoverflow.com/questions/30122439/converting-array-to-list
        res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                for (int k = i + 1; k < nums.length; k++) {
                    swap(res.get(j), i, k);
                    res.add(new ArrayList<>(res.get(j)));
                    swap(res.get(j), i, k);
                }
            }
        }
        return res;
    }

    private static void swap(List<Integer> list, int i, int j) {
        int tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

}
