package 和为k的子数组;

import org.junit.Test;

/**
 * ClassName: Solution
 * Package: 和为k的子数组
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/18 11:02
 * @Version 1.0
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int left=0;
        int res=0;


        while(true){
            int i=left;
            for(;;){
                sum=sum+nums[i];
                i++;
                if(sum==k){
                    res++;
                    if(i<=nums.length-1){
                        if(nums[i]==0)
                        {res++;i++;}
                    }

                }
                if(i>nums.length-1){
                    break;
                }


            }
            sum=0;
            left++;
            if(left>nums.length-1)
                break;

        }
        return res;

    }
    /**
     *
     * @author khr
     * @date 2024-04-18
     */
    @Test
    public void test(){
        int[] nums=new int[]{1,-1,0};
        int k=0;
        System.out.println(subarraySum(nums, k));

    }
}
