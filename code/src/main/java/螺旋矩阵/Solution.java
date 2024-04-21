package 螺旋矩阵;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution
 * Package: 螺旋矩阵
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 14:47
 * @Version 1.0
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        int left=0;
        ArrayList<Integer> res=new ArrayList<Integer>();

        while(top <= bottom && left <= right){
            for(int i =left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                res.add(matrix[j][right]);
            }
            right--;

            if (top <= bottom){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                };
                bottom--;
            }

            if (left <= right){
                for(int j=bottom;j>=top;j--){
                    res.add(matrix[j][left]);
                }
                left++;
            }




        }



        return res;
    }

    /**
     * @author khr
     * @date 2024-04-21
     */
    @Test
    public void test() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
