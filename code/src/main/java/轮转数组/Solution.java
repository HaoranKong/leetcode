package 轮转数组;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: Solution
 * Package: 轮转数组
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/20 21:42
 * @Version 1.0
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] clone = nums.clone();
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=clone[(nums.length-k+i)%nums.length];
        }

    }
    /**
     *
     * @author khr
     * @date 2024-04-20
     */
    @Test
    public void test(){
        int[] nums=new int[]{1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
