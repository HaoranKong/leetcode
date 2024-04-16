package 三数之和;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution1
 * Package: 三数之和
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/16 15:20
 * @Version 1.0
 */
public class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i]>0)
                continue;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            else{
                int left=i+1;
                int right=nums.length-1;
                while(left<right)
                {
                    int sum=nums[left]+nums[right]+nums[i];
                    if(sum>0)
                    {
                        right--;
                    }
                    else if(sum<0)
                    {
                        left++;
                    }
                    else {
                        result.add(new ArrayList<Integer>(Arrays.asList(nums[left], nums[i], nums[right])));
                        while(nums[left++]==nums[left]&&left<nums.length-1)
                            continue;
                        while (nums[right--]==nums[right]&&right>0)
                            continue;

                    }

                }
            }

        }



        return result;


    }

    /**
     *
     * @author khr
     * @date 2024-04-16
     */
    @Test
    public void test(){
            int nums[]={0,0,0};
        System.out.println(threeSum(nums));
    }
}
