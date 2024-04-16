package 无重复字符的最长子串;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Solution2
 * Package: 无重复字符的最长子串
 * Description:滑动窗口
 *
 * @Author KHR
 * @Create 2024/4/16 16:47
 * @Version 1.0
 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {

        if(s==" ")
            return 0;
        else {
            Set<Character> set = new HashSet<Character>();

            int max = 0;
            int left = 0;
            int right = 0;
            while (right < s.length()) {
                if (!set.contains(s.charAt(right))) {
                    set.add(s.charAt(right++));
                    max = Integer.max(max, right - left);
                } else {
                    set.remove(s.charAt(left++));
                }

            }
            return max;

        }

    }

    @Test
    public void test() {
        String s = new String("abbaa");
        System.out.println(lengthOfLongestSubstring(s));
    }

}
