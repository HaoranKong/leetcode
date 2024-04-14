package 最长连续序列;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Solution2
 * Package: 最长连续序列
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/14 20:30
 * @Version 1.0
 */
public class Solution2 {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        int current=0;
        Set<Integer>sets = new HashSet<Integer>();
        for(int num:nums){
            sets.add(num);
        };
        for(int num:sets)
        {
            if(!sets.contains(num-1))
            {

                while (sets.contains(num+1)){
                    longest++;
                    num++;
                }

            }
            current=Integer.max(longest,current);
            longest=1;

        }
        return current;

    }
    @Test
    public void test(){
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

}
