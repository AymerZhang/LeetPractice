package leetQ56;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhongwen on 2019/1/10
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        System.out.println(merge(intervals));
    }


    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> merged = new ArrayList<Interval>();
        List<Interval> interval_copy = intervals;
        if (intervals.size() == 1)
            return intervals;
        int original_size = interval_copy.size();
        for (int j = 0; j < interval_copy.size(); j++) {
            for (int i = 1; i < interval_copy.size(); i++) {
                Interval x = interval_copy.get(0);
                Interval y = interval_copy.get(i);
                if (((x.start <= y.start && x.end >= y.start) || (y.start <= x.start && y.end >= x.start))) {
                    interval_copy.remove(i);
                    interval_copy.remove(0);
                    interval_copy.add(0, new Interval(Math.min(x.start, y.start), Math.max(x.end, y.end)));
                    j = 0;
                    break;
                }
            }
            interval_copy.add(interval_copy.get(0));
            interval_copy.remove(0);
        }
        return interval_copy;
    }
}
