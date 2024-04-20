package 最大子数组和;

import org.junit.Test;

/**
 * ClassName: Solution
 * Package: 最大子数组和
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/20 20:09
 * @Version 1.0
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1; i<dp.length; i++){
            if(dp[i-1]<0)
                dp[i]=nums[i];
            else
                dp[i]=dp[i-1]+nums[i];
        }
        int res=dp[0];
        for(int i=1; i<dp.length; i++){
            res=Math.max(res,dp[i]);
        }
        return res;

    }
    /**
     *
     * @author khr
     * @date 2024-04-20
     */
    @Test
    public void test(){
       int[] nums={-2,1,-3,4,-1,2,1,-5,4} ;
        System.out.println(maxSubArray(nums));
    }
}
