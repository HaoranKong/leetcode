package 最长连续序列;

import org.junit.Test;

import java.security.Key;
import java.util.*;

import static java.lang.Math.max;

/**
 * ClassName: Solution
 * Package: 最长连续序列
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/14 19:44
 * @Version 1.0
 */
public class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
            return 0;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        int flag=1;
        int max=1;
        Arrays.sort(nums);
        for(int num:nums) {
            if(!map.containsKey(num))
                map.put(num,num);
        }
        Set<Integer> integers = map.keySet();

        Integer[] num = integers.toArray(new Integer[0]);


        if(num.length==1)
            return 1;
        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]+1==num[i+1])

            {
                flag++;
            }
            else{
                max=Integer.max(flag,max);
                flag=1;

            }



        }
        return Integer.max(flag,max);

    }
  /**
   *
   * @author lyj
   * @date 2024-04-14
   */
  @Test
  public void test(){
      int[] nums = {0,3,7,2,5,8,4,6,0,1};
      System.out.println(longestConsecutive(nums));
  }
}
