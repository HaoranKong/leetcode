package 旋转图像;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: Solution
 * Package: 旋转图像
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 15:38
 * @Version 1.0
 */
public class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length/2; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j]=temp;
            }
        }

    }
    /**
     *
     * @author khr
     * @date 2024-04-21
     */
    @Test
    public void test(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
