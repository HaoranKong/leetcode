package 合并区间;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: Solution
 * Package: 合并区间
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/20 20:36
 * @Version 1.0
 */
public class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        int begin=1;
        int end=1;


        int[][] ints = new int[intervals.length][];
        ints[0][begin]=intervals[0][0];
        ints[0][end]=intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            if((intervals[i][end]<=ints[i-1][end])||(intervals[i][begin]>=ints[i-1][begin]))
            {
                ints[i][begin]=Math.min(ints[i-1][begin],intervals[i][begin]);
                ints[i][end]=Math.max(ints[i-1][end],intervals[i][end]);
            }
        }

        return new int[intervals.length][];
    }
}
