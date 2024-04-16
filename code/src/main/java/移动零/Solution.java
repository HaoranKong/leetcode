package 移动零;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import org.junit.Test;

/**
 * ClassName: Solution
 * Package: 移动零
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/14 21:16
 * @Version 1.0
 */
public class Solution {
    public void moveZeroes(int[] nums) {

        int left=0;
        int right=0;
        for(int num:nums){

            if(num!=0){
                swap(nums,left,right);
                left++;
                if(right==nums.length)
                  return;
                right++;

            }
            else {
                right++;
            }
        }


    }



    private void swap(int[] nums, int left, int right) {
        int temp;
        temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }

    /**
     *
     * @author khr
     * @date 2024-04-14
     */
    @Test
    public void test(){
       int[] nums = {0,1,0,3,12};
       moveZeroes(nums);
       for(int num:nums){
           System.out.println(num);
       }
    }
}
