package 矩阵置零;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: Solution
 * Package: 矩阵置零
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/20 22:40
 * @Version 1.0
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows=new boolean[matrix.length];
        boolean[] cols=new boolean[matrix[0].length];
        for(int i=0; i<matrix.length; i++)
            for (int j=0; j<matrix[i].length;j++) {
                if(matrix[i][j]==0)
                {
                    rows[i]=true;
                    cols[j]=true;
                }

            }
        for(int i=0; i<matrix.length; i++)
            for (int j=0; j<matrix[i].length;j++)
            {
                if(rows[i]||cols[j])
                    matrix[i][j]=0;
            }
    }
    /**
     *
     * @author khr
     * @date 2024-04-20
     */
    @Test
    public void test(){
        int[][] matrix ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for(int i=0; i<matrix.length; i++)
        System.out.println(Arrays.toString(matrix[i]));
    }
}
