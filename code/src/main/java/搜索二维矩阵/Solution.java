package 搜索二维矩阵;

import com.sun.javafx.image.BytePixelSetter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution
 * Package: 搜索二维矩阵
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 16:01
 * @Version 1.0
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int top=0;
       int right=matrix[0].length-1;
       while (top<matrix.length&&right>=0) {
           if(target<matrix[top][right])
               right--;
           else if(target>matrix[top][right])
            top++;
           else
           {
               return true;
           }
       }

        return false;
    }

    /**
     * @author khr
     * @date 2024-04-21
     */
    @Test
    public void test() {
        int[][] test={{-1,3}};
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int[][] test1={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int target = 15;
        System.out.println(searchMatrix(test1, target));

    }
}
