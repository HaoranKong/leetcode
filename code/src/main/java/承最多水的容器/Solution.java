package 承最多水的容器;

import org.junit.Test;

import javax.swing.*;

/**
 * ClassName: Solution
 * Package: 承最多水的容器
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/14 21:51
 * @Version 1.0
 */
public class Solution {
    public int maxArea(int[] height) {
        int max=0;

        int i = 0;
        int j = height.length-1;
            while(j>i) {

                    max = Integer.max(Integer.min(height[i], height[j]) * (j - i), max);
                    if (height[j] < height[i])
                        j--;
                    else
                        i++;



            }


        return max;

    }
    /**
     *
     * @author khr
     * @date 2024-04-14
     */
    @Test
    public void test(){
        int[] height = new int[]{0,2};
        System.out.println(maxArea(height));
    }
}
