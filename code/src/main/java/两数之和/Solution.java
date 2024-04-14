package 两数之和;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution
 * Package: 两数之和
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/14 13:53
 * @Version 1.0
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }

        return null;

    }
    @Test
    public void test(){
        int[] nums = new int[]{2,7,11,15};
        int target= 9;
         for(int i:twoSum(nums, target))
         {
             System.out.println(i);
         };
    }
}
