package 无重复字符的最长子串;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Solution
 * Package: 无重复字符的最长子串
 * Description:超时解法
 *
 * @Author KHR
 * @Create 2024/4/16 16:15
 * @Version 1.0
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        if (s.length() == 0 || s.length() == 1)
            return s.length();
        else {

            char[] chars = s.toCharArray();
            int left = 0;
            int len = chars.length ;
            Set<Character> set = new HashSet<Character>();
            for (; len > 0; len--) {
                while(left+len<=chars.length){
                    for (int i = left; i < left + len; i++) {
                        set.add(chars[i]);
                    }
                    if (set.size() < len) {
                        left++;
                        set.clear();
                    } else {
                        return Integer.max(max, len);
                    }

                }
                left=0;



            }


        }


        return max;
    }

    /**
     *
     * @author khr
     * @date 2024-04-16
     */
    @Test
    public void test(){
        String s=new String("pwwkew" );
        System.out.println(lengthOfLongestSubstring(s));
    }
}