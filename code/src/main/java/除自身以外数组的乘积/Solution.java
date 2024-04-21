package 除自身以外数组的乘积;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: Solution
 * Package: 除自身以外数组的乘积
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/20 22:13
 * @Version 1.0
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lef=1;
        int right=1;
        int[] ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=lef;
            lef=lef*nums[i];
        }
        for(int j=nums.length-1; j>=0; j--){
            ans[j]*=right;right*=nums[j];

        }
        return ans;


    }
    /**
     *
     * @author khr
     * @date 2024-04-20
     */
    @Test
    public void test(){
    int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
