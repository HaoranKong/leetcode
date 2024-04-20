package 合并区间;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
        List<int[]>res = new ArrayList<int[]>();
        int begin=0;
        int end=1;

        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][begin]<=res.get(res.size()-1)[end])
            {
                int[] newelement = new int[2];
                newelement[0]=res.get(res.size()-1)[begin];
                newelement[1]=Math.max(intervals[i][end],res.get(res.size()-1)[end]);
                res.set(res.size() - 1,newelement);
            }
            else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int [res.size()][]);

    }

    /**
     *
     * @author khr
     * @date 2024-04-20
     */
    @Test
    public void test(){
            int[][] ints={{1,4},{0,2},{3,5}};
        for (int[] ints1 : merge(ints)) {
            System.out.println(Arrays.toString(ints1) );
        }

    }
}
